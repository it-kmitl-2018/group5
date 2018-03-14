package th.ac.kmitl.it.soa.group5.etaxinvoice.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import th.ac.kmitl.it.soa.group5.etaxinvoice.forms.ETaxInvoiceHeaderForm;
import th.ac.kmitl.it.soa.group5.etaxinvoice.models.ETaxInvoiceHeader;
import java.sql.Timestamp;

@RestController
public class ETaxInvoiceHeaderController {

    @PostMapping("/tax_invoice_header")
    public ETaxInvoiceHeaderForm eTaxInvoiceHeader(@RequestBody ETaxInvoiceHeaderForm eTaxInvoiceHeaderForm) {
        return eTaxInvoiceHeaderForm;
    }
}
