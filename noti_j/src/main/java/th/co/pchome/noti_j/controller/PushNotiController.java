package th.co.pchome.noti_j.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import th.co.pchome.noti_j.service.PushNotiService;
import th.co.pchome.noti_j.vo.PushNotiListVo;

/**
 * 負責 推播通知 view相關邏輯
 */
@Slf4j
@Controller
@RequestMapping("/push")
public class PushNotiController {

    @Autowired
    private PushNotiService pushNotiService;

    /**
     * 顯示 查詢頁
     */
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView searchPage() {

        // render page
        ModelAndView view = new ModelAndView("push/push_list");
        return view;
    }

    /**
     * 分頁查詢 Push notification
     * ajax
     */
    @RequestMapping(value = "/search/json", method = RequestMethod.GET)
    public ModelAndView search() {

        PushNotiListVo push = new PushNotiListVo();
        push.setThTitle("來來來.. 送你好康");
        push.setEnTitle("來來來.. 送你好康");
        push.setTwTitle("來來來.. 送你好康");
        push.setNotiType("行銷活動");

        // render page
        ModelAndView view = new ModelAndView("push/push_list");
        return view;
    }

    /**
     * 檢視 Push notification
     */
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView view() {

        // render page
        ModelAndView view = new ModelAndView("push/push_view");
        return view;
    }

    /**
     * 檢視 指定對象
     */
    @RequestMapping(value = "/recipient", method = RequestMethod.GET)
    public ModelAndView recipient() {

        // render page
        ModelAndView view = new ModelAndView("push/push_view_recipient");
        return view;
    }

    /**
     * 顯示 新增頁
     */
    @RequestMapping(value = "/addpage", method = RequestMethod.GET)
    public ModelAndView addPage() {

        // render page
        ModelAndView view = new ModelAndView("push/push_add");
        return view;
    }

    /**
     * 新增 Push notification
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public RedirectView add() {

        // redirect 查詢頁
        RedirectView redirect = new RedirectView("search");
        return redirect;
    }

    /**
     * 顯示 編輯頁
     */
    @RequestMapping(value = "/editpage", method = RequestMethod.GET)
    public ModelAndView editPage() {

        // render page
        ModelAndView view = new ModelAndView("push/push_edit");
        return view;
    }

    /**
     * 編輯 Push notification
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public RedirectView edit() {

        // redirect 查詢頁
        RedirectView redirect = new RedirectView("search");
        return redirect;
    }

    /**
     * 發送預覽 Push notification
     * ajax
     */
    @RequestMapping(value = "/sendtest/json", method = RequestMethod.POST)
    public String sendTest() {

        return "OK";
    }

    /**
     * 取消 Push notification
     * ajax
     */
    @RequestMapping(value = "/cancel/json", method = RequestMethod.POST)
    public String cancel() {

        return "OK";
    }
}
