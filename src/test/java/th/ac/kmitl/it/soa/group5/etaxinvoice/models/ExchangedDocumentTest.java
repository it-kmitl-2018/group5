package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import org.junit.Test;

import java.sql.Timestamp;
import static org.junit.Assert.*;

public class ExchangedDocumentTest {

    private String id = "RDTIV0575526000058001";
    private String name = "ใบกำกับภาษี";
    private String typeCode = "388";
    private Timestamp issueDateTime = new Timestamp(System.currentTimeMillis());
    private Timestamp createDateTime = new Timestamp(System.currentTimeMillis());

    @Test
    public void getValueFromExchangedDocumentModel(){
        ExchangedDocument exchangedDocument = new ExchangedDocument();
        exchangedDocument.setId(this.id);
        exchangedDocument.setName(this.name);
        exchangedDocument.setTypeCode(this.typeCode);
        exchangedDocument.setIssueDateTime(this.issueDateTime);
        exchangedDocument.setCreateDateTime(this.createDateTime);

        assertEquals(id, exchangedDocument.getId());
        assertEquals(name, exchangedDocument.getName());
        assertEquals(typeCode, exchangedDocument.getTypeCode());
        assertEquals(issueDateTime, exchangedDocument.getIssueDateTime());
        assertEquals(createDateTime, exchangedDocument.getCreateDateTime());

    }

}
