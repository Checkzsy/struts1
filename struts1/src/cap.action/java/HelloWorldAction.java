package cap.action;
import com.opensymphony.xwork2.ActionSupport;
public class HelloWorldAction extends ActionSupports {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String execute() {
        return SUCCESS;
    }

}
