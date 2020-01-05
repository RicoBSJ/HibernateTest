package Modele;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate2 {

	public static void main(String args[]) throws Exception {
		Configuration config = new Configuration();
		config.addClass(Personnes.class);
		SessionFactory sessionFactory = config.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();

		try {
			Personnes personne = (Personnes) session.load(Personnes.class, new Integer(3));
			System.out.println("nom = " + personne.getNomPersonne());
		} finally {
			session.close();
		}

		sessionFactory.close();
	}
}