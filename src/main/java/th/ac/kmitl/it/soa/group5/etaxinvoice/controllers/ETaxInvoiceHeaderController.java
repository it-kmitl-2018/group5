package th.ac.kmitl.it.soa.group5.etaxinvoice.controllers;

import org.springframework.web.bind.annotation.*;
import th.ac.kmitl.it.soa.group5.etaxinvoice.forms.ETaxInvoiceHeaderForm;

@RestController
public class ETaxInvoiceHeaderController {

    @PostMapping("/header_get_json")
    public ETaxInvoiceHeaderForm eTaxInvoiceHeaderGetJson(@RequestBody ETaxInvoiceHeaderForm form) {
        return form;
    }
}
