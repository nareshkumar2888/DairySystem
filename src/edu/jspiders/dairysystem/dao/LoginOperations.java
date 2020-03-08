package edu.jspiders.dairysystem.dao;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import edu.jspiders.dairysystem.dto.Login;
import edu.jspiders.singleton.SingletonClass;

@Component
public class LoginOperations {

	public Login loginValidation(String username, String password) {

		SessionFactory factory = SingletonClass.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx=session.beginTransaction();
		String hql = "from Login where username=:user and password=:pswd";
		Query query = session.createQuery(hql);
		query.setString("user", username);
		query.setString("pswd", password);

		Login login = (Login) query.uniqueResult();

		tx.commit();
		return login;

	}

}
