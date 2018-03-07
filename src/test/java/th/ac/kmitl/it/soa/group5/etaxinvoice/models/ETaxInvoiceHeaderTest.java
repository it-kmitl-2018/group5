package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.sql.Timestamp;

public class ETaxInvoiceHeaderTest {

    private String id = "RDTIV0575526000058001";
    private String name = "ใบกำกับภาษี";
    private String typeCode = "388";
    private Timestamp issueDateTime = new Timestamp(System.currentTimeMillis());
    private Timestamp createDateTime = new Timestamp(System.currentTimeMillis());

    @Test
    public void getValueFromExchangedDocumentModel(){
        ETaxInvoiceHeader.Builder builder = new ETaxInvoiceHeader.Builder();
        ETaxInvoiceHeader exdoc = builder
                .id(this.id)
                .name(this.name)
                .typeCode(this.typeCode)
                .issueDateTime(this.issueDateTime)
                .createDateTime(this.createDateTime)
                .build();

        assertEquals(this.id, exdoc.id);
        assertEquals(this.name, exdoc.name);
        assertEquals(this.typeCode, exdoc.typeCode);
        assertEquals(this.issueDateTime, exdoc.issueDateTime);
        assertEquals(this.createDateTime, exdoc.createDateTime);
    }
}
