package dat19c.exercise.controller;

import dat19c.exercise.service.RestConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @Autowired
    RestConsumeService restConsumeService;

    @GetMapping("/")
    public String getSingle(Model model){
        model.addAttribute("quote", restConsumeService.fetchSingleQuote());
        return "index";
    }
}
