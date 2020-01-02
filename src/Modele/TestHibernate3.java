package Modele;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration config = new Configuration();
		config.addClass(Personnes.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();

		try {
			List personnes = session.find("from Personnes");
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
