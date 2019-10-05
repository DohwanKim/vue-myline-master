package ivis.mobile.linedb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/docs")
    public String docsPage(){
        return "docs";
    }
}
