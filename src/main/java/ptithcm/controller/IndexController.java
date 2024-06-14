package ptithcm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ptithcm.bean.Account;
import ptithcm.service.AccountService;

@Controller
public class IndexController {
    @Autowired
    AccountService accountService;

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "PTITHCM Book Shop");
        model.addAttribute("type", "home");
        Account account = accountService.getAccountByUsername("hello");
        model.addAttribute("account", account);
        return "pages/home";
    }

    @RequestMapping("/error")
    public String error(Model model) {
        model.addAttribute("title", "Lỗi");
        return "pages/error";
    }
}
