package th.ac.kmitl.it.soa.group5.etaxinvoice.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import th.ac.kmitl.it.soa.group5.etaxinvoice.models.ETaxInvoiceHeader;
import java.sql.Timestamp;

@RestController
public class ETaxInvoiceHeaderController {

    @PostMapping("/tax_invoice_header")
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
