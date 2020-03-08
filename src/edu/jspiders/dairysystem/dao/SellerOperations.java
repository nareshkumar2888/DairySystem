package edu.jspiders.dairysystem.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import edu.jspiders.dairysystem.dto.Seller;
import edu.jspiders.singleton.SingletonClass;
@Component
public class SellerOperations {
	public boolean insert(Seller seller) {
		SessionFactory factory = SingletonClass.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(seller);
		try {
			tx.commit();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<Seller> displySeller() {
		SessionFactory factory = SingletonClass.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "from Seller";
		Query query = session.createQuery(hql);
		List<Seller> seller = query.list();
		return seller;
	}

	public Seller searchSeller(int id) {
		SessionFactory factory = SingletonClass.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Seller seller = session.get(Seller.class, id);
		return seller;

	}
	
	public void updateSeller(Seller seller) {
		SessionFactory factory=SingletonClass.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(seller);
		tx.commit();
	}
	
	public void deleteSeller(Seller seller) {
		SessionFactory factory=SingletonClass.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.delete(seller);
		tx.commit();
	}
}
