package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExchangedDocumentTest {

    private String id = "RDTIV0575526000058001";
    private String name = "ใบกำกับภาษี";
    private String typeCode = "388";
    private String issueDateTime = "2016-09-12T19:19:25.0";
    private String createDateTime = "2016-09-12T15:51:26.0";

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
