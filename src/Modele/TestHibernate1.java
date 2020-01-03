package Modele;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernate1 {

	public static void main(String args[]) throws Exception {
		Configuration config = new Configuration();
		config.addClass(Personnes.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Personnes personne = new Personnes("nom3", "prenom3", new Date());
			session.save(personne);
			session.flush();
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			throw e;
		} finally {
			session.close();
		}

		sessionFactory.close();
	}
}