package th.ac.kmitl.it.soa.group5.etaxinvoice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import th.ac.kmitl.it.soa.group5.etaxinvoice.forms.TaxInvoiceForm;

@RestController
public class TaxInvoiceController {

    @GetMapping("/applicable_trade_tax")
    public TaxInvoiceForm applicableTradeTaxForm(@RequestBody TaxInvoiceForm taxInvoiceForm){
        return taxInvoiceForm;
    }
}
