package io.dotsehyde.todoapp.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {
    public record User(String name, String password) {
    }

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String getLogin() {
        logger.info("GET /login");
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String postLogin(@RequestParam String name, @RequestParam String password, ModelMap model) {
        logger.info("POST /login");
        var user = new User(name,password);
        model.put("name", user.name);
        model.put("pass",user.password);
        if(!user.name.equalsIgnoreCase("Ben") && !user.password.equals("qwerty")){
            model.put("error","Invalid credentials");
            return "login";
        }
        return "home";
    }

}
