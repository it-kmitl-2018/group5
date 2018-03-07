package th.ac.kmitl.it.soa.group5.etaxinvoice.controllers;

import org.springframework.stereotype.Controller;;
import org.springframework.web.bind.annotation.GetMapping;
import th.ac.kmitl.it.soa.group5.etaxinvoice.models.ETaxInvoiceHeader;
import java.sql.Timestamp;

@Controller
public class ETaxInvoiceHeaderController {

    @GetMapping("/tax_invoice_header")
    public ETaxInvoiceHeader eTaxInvoiceHeader() {
        ETaxInvoiceHeader eTaxInvoiceHeader = ETaxInvoiceHeader.builder()
                .id("RDTIV0575526000058001")
                .name("ใบกำกับภาษี")
                .typeCode("388")
                .issueDateTime(new Timestamp(System.currentTimeMillis()))
                .createDateTime(new Timestamp(System.currentTimeMillis()))
                .build();
        return eTaxInvoiceHeader;
    }
}
