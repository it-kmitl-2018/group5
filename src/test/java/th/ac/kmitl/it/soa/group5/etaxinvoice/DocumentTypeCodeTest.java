package th.ac.kmitl.it.soa.group5.etaxinvoice;

import org.junit.Test;
import th.ac.kmitl.it.soa.group5.etaxinvoice.definitions.DocumentTypeCode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DocumentTypeCodeTest {

    @Test
    public void shouldGetCorrectCodeAndDescription(){
        assertEquals(DocumentTypeCode.DEBIT_NOTE.getDocumentCode(), "80");
        assertEquals(DocumentTypeCode.DEBIT_NOTE.getDocumentName() , "ใบเพิ่มหนี้ (Debit note)");
        assertEquals(DocumentTypeCode.INVOICE.getDocumentCode(), "380");
        assertEquals(DocumentTypeCode.INVOICE.getDocumentName() , "ใบแจ้งหนี้ (Invoice)");
    }
}
