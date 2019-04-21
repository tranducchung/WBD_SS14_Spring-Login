package controllers;

import model.Login;
import model.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.ListUser;

@org.springframework.stereotype.Controller
@RequestMapping("/login")
public class Controller {
        @GetMapping
        public ModelAndView home(){
            ModelAndView modelAndView = new ModelAndView("loginForm","login",new Login());
            return modelAndView;
        }
        @PostMapping
        public ModelAndView resultLogin(@ModelAttribute("login") Login login){
            User user = ListUser.checkLogin(login);

           if (user != null){
               ModelAndView modelAndView = new ModelAndView("resultLogin");
               modelAndView.addObject("user",user);
               return modelAndView;

           }else {
              ModelAndView modelAndView = new ModelAndView("error");
              return modelAndView;
           }

        }
}
