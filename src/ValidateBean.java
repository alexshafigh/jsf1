import javax.faces.annotation.ManagedProperty;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by saazimi on 7/10/2018.
 */
@ManagedBean (name = "ValidateBean")
public class ValidateBean implements Serializable{
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

//    @ManagedProperty( value = "#{connectionBean}")
//    private connectionBean conbean;
//    public connectionBean getConbean() throws SQLException, ClassNotFoundException {
//        conbean = new connectionBean();
//        return conbean;
//    }


    public String getResult() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (name != null && email != null && phone != null) {
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            connectionBean conbean = getConbean();
//            conbean.setConnection(DriverManager.getConnection("jdbc:mysql://localhost:3306/alix" , "root" , "123456789"));
//            conbean.setStmnt(conbean.getConnection().prepareStatement("insert into user_information values (1,?,?,?)"));
//            conbean.getStmnt().setString(1,getName());
//            conbean.getStmnt().setString(2,getEmail());
//            conbean.getStmnt().setString(3,getPhone());
//            conbean.getStmnt().executeUpdate();

            return "<p style=\"background-color:yellow;width:200px;" +
                    "padding:5px\">Name: " + getName() + "<br/>E-Mail: " +
                    getEmail() + "<br/>Phone: " + getPhone() + "</p>";
        }
        else return "";
    }

}
