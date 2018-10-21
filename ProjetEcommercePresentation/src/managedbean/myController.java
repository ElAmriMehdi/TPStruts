package managedbean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import util.SessionUtils;

@ManagedBean
public class myController {
	 public String onPageLoad(){
		 System.out.println("Onload");
		 HttpSession session = SessionUtils.getSession();
		 if(session==null)
			 return "home";
		 else {
			 if(session.getAttribute("role").equals("admin"))return "admin";
			 else return "user";
		 }
	}
}
