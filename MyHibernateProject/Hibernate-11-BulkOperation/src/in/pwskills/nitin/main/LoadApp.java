package in.pwskills.nitin.main;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import in.pwskills.nitin.bean.InsurancePolicy;
import in.pwskills.nitin.util.UtilClass;

public class LoadApp {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Session session = null;
		List<InsurancePolicy> listOfRecords = null;
		Query<InsurancePolicy> query = null;
		try {

			session = UtilClass
					.getSession();
			query = session.createQuery("FROM in.pwskills.nitin.bean.InsurancePolicy");
			listOfRecords = query.getResultList();

			System.out.println("\nRetrieved using foreach and lambda expression...");
			listOfRecords.forEach(policy -> System.out.println(policy));

			System.out.println();
			System.out.println("Retreived using foreach and method reference... ");
			listOfRecords.forEach(System.out::println);

			System.out.println("***********************");

			System.out.println("Working with Named parameter......");
			query = session.createQuery("FROM in.pwskills.nitin.bean.InsurancePolicy WHERE company IN (:org1,:org2)");

			// set the named parameter value
			query.setParameter("org1", "HDFC");
			query.setParameter("org2", "LIC");

			// execute and retrieve the records
			listOfRecords = query.getResultList();

			// print the result
			listOfRecords.forEach(System.out::println);

		} catch (HibernateException he) {
			he.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			UtilClass
			.closefactory();
			if (session != null) {
				session.close();
			}
		}
	}
}
