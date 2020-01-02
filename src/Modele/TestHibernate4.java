package Modele;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration config = new Configuration();
		config.addClass(Personnes.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();

		try {
			List personnes = session.find("from Personnes p where p.nomPersonne=?", "nom1", Hibernate.STRING);
			for (int i = 0; i < personnes.size(); i++) {
				Personnes personne = (Personnes) personnes.get(i);
				System.out.println("nom = " + personne.getNomPersonne());
			}
		} finally {
			session.close();
		}

		sessionFactory.close();
	}
}
