import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.text.DateFormat;
import java.util.Date;

/**
 * Created by saazimi on 7/8/2018.
 */
@ManagedBean
@RequestScoped
public class webTimeBean {
    public String getTime(){
        return DateFormat.getTimeInstance( DateFormat.LONG ).format(new Date());
    }
}
