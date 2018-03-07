package in.ajay.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
	public static void main(String[] args) {

		// creating configuration object
		Configuration cfg = new Configuration();

		// populates the data of the configuration file
		cfg.configure("hibernate.cfg.xml");
		
		// creating session factory object
		SessionFactory factory = cfg.buildSessionFactory();

		// creating session object
		Session session = factory.openSession();

		// creating transaction object
		Transaction t = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setId(116);
		e1.setFirstName("Ajay");
		e1.setLastName("Yadav");

		session.persist(e1);// persisting the object

		t.commit();// transaction is committed
		session.close();

		System.out.println("successfully saved");
	}
}