package presentation;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import models.user;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	
	private user u; 
	private Map session;
	
	
	public user getU() {
		return u;
	}

	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}

	public void setU(user u) {
		this.u = u;
	}

	public String seConnecter(){
		System.out.println("username :" + this.u.getUsername() + " & password: "+this.u.getPassword());
		if("admin".equals(this.u.getUsername())&&"admin".equals(this.u.getPassword())){
			session.put("user",u);
			return "SUCCESS"; 
		}
		else return "FAILED";
	}
}
