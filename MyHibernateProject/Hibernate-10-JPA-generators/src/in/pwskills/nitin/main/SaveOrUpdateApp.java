package in.pwskills.nitin.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.pwskills.nitin.bean.PersonInfo;
import in.pwskills.nitin.util.HibernateUtil;

public class SaveOrUpdateApp {

	public static void main(String[] args) {

		Session session = null;
		Transaction transaction = null;

		Boolean flag = false;

		try {
			session = HibernateUtil.getSession();
			transaction = session.beginTransaction();
			
			PersonInfo info = new PersonInfo();
			info.setPaddr("csk");
			info.setPname("dhoni");
			
			session.saveOrUpdate(info);

			flag = true;

		} catch (HibernateException he) {
			he.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			if (transaction != null) {
				if (flag) {
					transaction.commit();
					System.out.println("Record inserted/updated succesfully...");
				} else {
					transaction.rollback();
					System.out.println("Record failed for updation...");
				}

				HibernateUtil.closeSessionFactory();
				if (session != null) {
					session.close();
				}
			}
		}
	}
}
