package in.cast.service;

import in.cast.dao.Dao;
import it.cast.javabean.Emploee;

public class Service {

	private Dao dao;
		
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	public void save(Emploee emploee){
		dao.save(emploee);
	}
	
}
