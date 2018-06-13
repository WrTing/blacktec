package com.wrt.ql.shiro.controller;

import com.wrt.ql.domain.User;
import com.wrt.ql.shiro.service.ShiroService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/shiro")
public class ShiroController {
    @Autowired
    private ShiroService shiroService;
    @RequestMapping("/login")
    public String login(@RequestParam("User") User user){
        Subject currentuser = SecurityUtils.getSubject();
        if(!currentuser.isAuthenticated()){
            UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(),user.getPassword());
            token.setRememberMe(true);
            try{
                currentuser.login(token);
            }catch(Exception e){
                e.printStackTrace();
                return null;
            }
        }
        return "redirect:/firstpage";
    }
}
