package in.pwskills.nitin.main;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import in.pwskills.nitin.bean.CardPayment;
import in.pwskills.nitin.bean.Chequepayment;
import in.pwskills.nitin.bean.Payment;
import in.pwskills.nitin.util.HibernateUtil;

public class TBCSelectApp {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Session session = null;

		try {
			session = HibernateUtil.getSession();
			Query<Payment> query1 = session.createQuery("from Payment");
			List<Payment> payments = query1.getResultList();
			payments.forEach(System.out::println);

			System.in.read();
			
			// selecting child classes
			Query<CardPayment> query2 = session.createQuery("from CardPayment");
			List<CardPayment> card = query2.getResultList();
			card.forEach(System.out::println);

			System.in.read();
			
			// selecting child classes
			Query<Chequepayment> query3 = session.createQuery("from ChequePayment");
			List<Chequepayment> cheque = query3.getResultList();
			cheque.forEach(System.out::println);

		} catch (HibernateException he) {
			he.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}
	}
}
