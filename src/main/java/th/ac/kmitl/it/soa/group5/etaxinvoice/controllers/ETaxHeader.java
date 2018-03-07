package th.ac.kmitl.it.soa.group5.etaxinvoice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import th.ac.kmitl.it.soa.group5.etaxinvoice.models.ExchangedDocument;

@Controller
public class ETaxHeader {

    @GetMapping("/etaxHeader")
    public String getHeaderDocumentValue( Model model ){
        ExchangedDocument exchangedDocument = ExchangedDocument.builder().build();
        model.addAttribute("exchangedDocument", exchangedDocument );
        return "version";
    }

    @PostMapping("/etaxHeader")
    public String passHeaderDocumentModel(@ModelAttribute ExchangedDocument exchangedDocument) {
        return "confirmETaxFormPage";
    }
}
