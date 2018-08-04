package it.cast.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import in.cast.service.Service;
import it.cast.javabean.Emploee;

public class ActionTest extends ActionSupport implements ModelDriven<Emploee>{
	//必须实例化
	private Emploee emploee = new Emploee();
	
	@Override
	public Emploee getModel() {		
		return emploee;
	}

	private Service service;	
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}

	public String execute(){
		
		service.save(emploee);
		
		return SUCCESS;
	}
}
