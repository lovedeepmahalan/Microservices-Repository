package in.pwskills.nitin.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.pwskills.nitin.bean.InsurancePolicy;
import in.pwskills.nitin.bean.PremiumInsurancePolicy;



public class HibernateUtil {

	private static Session session=null;
	private static SessionFactory sessionFactory=null;
	

	static {
		if (sessionFactory == null) {
			sessionFactory = new Configuration()
							.configure()
							.addAnnotatedClass(InsurancePolicy.class)
							.addAnnotatedClass(PremiumInsurancePolicy.class)
							.buildSessionFactory();
		}
	}

	public static Session getSession() {
		if (sessionFactory != null) {
			session = sessionFactory.openSession();
		}
		return session;
	}

	public static void closeSessionFactory() {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}
}

