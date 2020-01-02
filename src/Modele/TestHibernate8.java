package Modele;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		try {
			Query query = session.createQuery("from Personnes p where p.nomPersonne = :nom");
			query.setString("nom", "nom2");
			Iterator personnes = query.iterate();

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
