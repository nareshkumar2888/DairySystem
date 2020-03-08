package edu.jspiders.dairysystem.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import edu.jspiders.dairysystem.dto.MilkRate;
import edu.jspiders.singleton.SingletonClass;
@Component
public class MilkRateOperations {
	
		public ArrayList<Double> getMaxFatAndDate() {
		SessionFactory factory=SingletonClass.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		String sql1="select min(fat) from MilkRate";
		Query query1=session.createQuery(sql1);
		Double minFat=(Double)query1.uniqueResult();
		
		String sql2="select min(rate) from MilkRate";
		Query query2=session.createQuery(sql2);
		Double minRate=(Double)query2.uniqueResult();
		
		String sql3="select max(fat) from MilkRate";
		Query query3=session.createQuery(sql3);
		Double maxFat=(Double)query3.uniqueResult();
		
		String sql4="select max(rate) from MilkRate";
		Query query4=session.createQuery(sql4);
		Double maxRate=(Double)query4.uniqueResult();
		
		ArrayList<Double> data=new ArrayList<>();
		data.add(minFat);
		data.add(minRate);
		data.add(maxFat);
		data.add(maxRate);

		return data;
	}
	
	
	public boolean update(int hikeRate) {
		SessionFactory factory=SingletonClass.getSessionFactory();
		Session session=factory.openSession();
		
		Date d=new Date();
		String date=d.getDate()+"-"+(d.getMonth()+1)+"-"+(d.getYear()+1900);
		List<MilkRate> allMilkRate=getMilkRates();
		int count=0;

		for(MilkRate milkRate:allMilkRate) {
			Transaction tx=session.beginTransaction();
			milkRate.setRate(milkRate.getRate()+hikeRate);
			milkRate.setUpdatedDate(date);
			session.update(milkRate);
			try {
				tx.commit();
				count++;
			}catch(Exception e) {
				return false;
			}
		}
		if(count!=0) {
			return true;
		}
		return false;
	}
	
	
	public List<MilkRate> getMilkRates() {
		SessionFactory factory=SingletonClass.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		String hql="from MilkRate";
		Query query=session.createQuery(hql);
		List<MilkRate> allMilkRates=query.list();
		return allMilkRates; 
	}

}
