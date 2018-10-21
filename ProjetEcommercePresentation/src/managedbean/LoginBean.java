package managedbean;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.Size;

import util.SessionUtils;

@ManagedBean
public class LoginBean {

    @Size(min = 2, max = 50)
    private String username;
    @Size(min = 2, max = 50)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    
    public String getPassword() {
        return password;
    }

   
    public void setPassword(String password) {
        this.password = password;
    }

    public String login() {
      //  TODO
        return "logout";
    }

    //logout event, invalidate session
    public String logout() {
        return "home";
    }

    //validate login
    public String validateUsernamePassword() throws IOException{
        if (username.trim().equals("admin") && password.trim().equals("admin")) {
            HttpSession session = SessionUtils.getSession();
            session.setAttribute("role", "admin");
                return "admin";
        }
        else if (username.trim().equals("user") && password.trim().equals("user")) {
                HttpSession session = SessionUtils.getSession();
                session.setAttribute("role", "user");
                    return "user";
        }
        else {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Incorrect Username and Passowrd",
                            "Please enter correct username and Password"));
            return "home";
        }
    }
    
}
