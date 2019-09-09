package controller;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import service.UserService;
import javax.servlet.http.HttpSession;
@Controller
public class UserController {
    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping(value = "/login")
    public ModelAndView login(String loginname, String password, ModelAndView mv, HttpSession session) {
        User user = userService.login(loginname, password);
        if(null == user) {
            session.setAttribute("user", user);
            mv.setView(new RedirectView("/main"));
        } else {
            mv.addObject("message", "登录名或者密码错误，请重新输入！");
            mv.setViewName("loginForm");
        }
        return mv;
    }
}
