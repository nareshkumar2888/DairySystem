package edu.jspiders.dairysystem.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import edu.jspiders.dairysystem.dto.Staff;
import edu.jspiders.singleton.SingletonClass;
@Component
public class StaffOperations {

	public boolean insert(Staff newStaff) {

		SessionFactory factory = SingletonClass.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(newStaff);
		try {
			tx.commit();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public List<Staff> displyAllStaff() {
		SessionFactory factory = SingletonClass.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "from Staff";
		Query query = session.createQuery(hql);
		List<Staff> staff = query.list();

		return staff;

	}

	public void updateStaff(Staff staff) {
		SessionFactory factory = SingletonClass.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(staff);
 		tx.commit();
	}
	
	public Staff search(int id) {
		SessionFactory factory = SingletonClass.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Staff staff=session.get(Staff.class, id);
		tx.commit();
		return staff;
	}
	
	public void deleteStaff(Staff staff) {
		
		SessionFactory factory = SingletonClass.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(staff);
		tx.commit();
		session.close();
	}
}
