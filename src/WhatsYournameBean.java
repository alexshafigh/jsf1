import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by saazimi on 7/8/2018.
 */
@ManagedBean
@RequestScoped
public class WhatsYournameBean {
    public String getName(){
        return "Seyyed Ali Azimi";
    }
}
