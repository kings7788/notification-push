package th.co.pchome.noti_j;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 專案健康檢查
 */
@Controller
public class HealthController {

    /**
     * Normal running
     */
    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String index() {
        return "Hello world! web app is running.";
    }

    /**
     * Normal running
     */
    @RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView test() {
        return new ModelAndView("push/push_add");
    }
}
