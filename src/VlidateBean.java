import javax.faces.bean.ManagedBean;
import java.io.Serializable;

/**
 * Created by saazimi on 7/10/2018.
 */
@ManagedBean (name = "VlidateBean")
public class VlidateBean implements Serializable{
private String name;
private String email;
private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getResult(){
        if (name != null && email != null && phone != null)
            return  "<p style=\"background-color:yellow;width:200px;" +
                 "padding:5px\">Name: " + getName() + "<br/>E-Mail: " +
                 getEmail() + "<br/>Phone: " + getPhone() + "</p>";
        else return "";
    }
}
