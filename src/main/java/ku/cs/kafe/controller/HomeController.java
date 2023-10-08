// 6410450133 nopnapat norasri

package ku.cs.kafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Decaf? No, it's dangerous to dilute my caffeine.");
        // return html template -> home.html
        return "home";
    }

}
