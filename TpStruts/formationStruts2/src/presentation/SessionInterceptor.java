package presentation;

import java.util.Map;

import models.user;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class SessionInterceptor implements Interceptor{

	@Override
	public void destroy() {
		System.out.println("destroy");
		
	}

	@Override
	public void init() {
		System.out.println("init");
		
	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		Map session = actionInvocation.getInvocationContext().getSession();
		user u = (user) session.get("user");
		if(u == null)return "FAILED";
		else return actionInvocation.invoke();
		
	}
	

}
