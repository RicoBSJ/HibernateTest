package Modele;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration config = new Configuration();
		config.addClass(Personnes.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();

		try {
			int compteur = ((Integer) session.iterate("select count(*) from Personnes").next()).intValue();
			System.out.println("compteur = " + compteur);
		} finally {
			session.close();
		}
		sessionFactory.close();
	}
}
