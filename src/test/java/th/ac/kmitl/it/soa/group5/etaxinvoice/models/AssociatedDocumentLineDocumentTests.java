package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssociatedDocumentLineDocumentTests {

    private String lineId = "3476" ;

    @Test
    public void geExpecttLineID(){
        AssociatedDocumentLineDocument.Builder builder = new AssociatedDocumentLineDocument.Builder();
        AssociatedDocumentLineDocument exdoc = builder
                .lineID(this.lineId).build();
        assertEquals(this.lineId, exdoc.lineID);
    }
}