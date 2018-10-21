package managedbean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
public class myController {
	 public void onPageLoad(){
		 System.out.println("Onload");
		 
		 FacesContext context = FacesContext.getCurrentInstance();
		 HttpServletRequest origRequest = (HttpServletRequest)context.getExternalContext().getRequest();
		    String contextPath = origRequest.getContextPath();
		try {
		        FacesContext.getCurrentInstance().getExternalContext()
		                .redirect(contextPath  + "/faces/home.xhtml");
		    } catch (IOException e) {
		        e.printStackTrace();
		    } 
	}
}
