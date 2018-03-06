package th.ac.kmitl.it.soa.group5.etaxinvoice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import th.ac.kmitl.it.soa.group5.etaxinvoice.models.Address;

@Controller
public class AddressController {

    @GetMapping("/addressForm")
    public String addressInputForm(Model model) {
        model.addAttribute("address", new Address());
        return "addressForm";
    }

    @PostMapping("/addressForm")
    public String addressSubmit(@ModelAttribute Address address) {
        return "addressResult";
    }
}
