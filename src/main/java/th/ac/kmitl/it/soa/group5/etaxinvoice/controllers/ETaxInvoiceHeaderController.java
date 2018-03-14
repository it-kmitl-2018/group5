package th.ac.kmitl.it.soa.group5.etaxinvoice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import th.ac.kmitl.it.soa.group5.etaxinvoice.forms.ETaxInvoiceHeaderForm;

@RestController
public class ETaxInvoiceHeaderController {

    @GetMapping("/tax_invoice_header")
    public ETaxInvoiceHeaderForm eTaxInvoiceHeader(@RequestBody ETaxInvoiceHeaderForm eTaxInvoiceHeaderForm) {
        return eTaxInvoiceHeaderForm;
    }
}
