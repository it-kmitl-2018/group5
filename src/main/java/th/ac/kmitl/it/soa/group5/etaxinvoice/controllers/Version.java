package th.ac.kmitl.it.soa.group5.etaxinvoice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Version {

    @RequestMapping("/")
    public String version() {
        return "version";
    }
}
