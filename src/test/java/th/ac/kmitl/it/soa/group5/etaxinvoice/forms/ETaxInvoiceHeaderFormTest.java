package th.ac.kmitl.it.soa.group5.etaxinvoice.forms;

import org.junit.Test;
import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ETaxInvoiceHeaderFormTest {

    private String subject = "include note";
    private String content = "include note content";
    private String id = "RDTIV0575526000058001";
    private String name = "ใบกำกับภาษี";
    private String typeCode = "388";
    private Timestamp issueDateTime = new Timestamp(System.currentTimeMillis());
    private Timestamp createDateTime = new Timestamp(System.currentTimeMillis());

    @Test
    public void getValueInfoOfHeaderForm(){
        ETaxInvoiceHeaderForm eTaxInvoiceHeaderForm = new ETaxInvoiceHeaderForm.Builder()
                .subject(subject)
                .content(content)
                .id(id)
                .name(name)
                .typeCode(typeCode)
                .issueDateTime(issueDateTime)
                .createDateTime(createDateTime)
                .build();

        assertEquals(this.subject, eTaxInvoiceHeaderForm.subject);
        assertEquals(this.content, eTaxInvoiceHeaderForm.content);
        assertEquals(this.id, eTaxInvoiceHeaderForm.id);
        assertEquals(this.name, eTaxInvoiceHeaderForm.name);
        assertEquals(this.typeCode, eTaxInvoiceHeaderForm.typeCode);
        assertEquals(this.issueDateTime, eTaxInvoiceHeaderForm.issueDateTime);
        assertEquals(this.createDateTime, eTaxInvoiceHeaderForm.createDateTime);
    }
}
