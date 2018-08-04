package in.cast.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import it.cast.javabean.Emploee;

public class Dao {

	private SessionFactory factory;	
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	public void save(Emploee emploee){
		Session session = factory.getCurrentSession();
		Transaction ts = session.beginTransaction();
		session.save(emploee);
		ts.commit();
	}
	
}
