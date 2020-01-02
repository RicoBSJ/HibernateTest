package Modele;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration config = new Configuration();
		config.addClass(Personnes.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();

		try {
			Iterator personnes = session.iterate("from Personnes ");
			while (personnes.hasNext()) {
				Personnes personne = (Personnes) personnes.next();
				System.out.println("nom = " + personne.getNomPersonne());
			}
		} finally {
			session.close();
		}

		sessionFactory.close();
	}
}
