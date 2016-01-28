import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

/**
 * Created by khangtnse60992 on 1/28/2016.
 */
@ManagedBean
@ViewScoped
public class HelloBean {
    String hello = "hello";

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
