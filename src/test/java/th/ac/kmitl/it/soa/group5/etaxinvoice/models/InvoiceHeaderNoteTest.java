package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceHeaderNoteTest {

    private String subject = "หมายเหตุ";
    private String content = "content of included note";

    @Test
    public void shouldgetValueFromHeaderNoteModel(){
        InvoiceHeaderNote invoiceHeaderNote = InvoiceHeaderNote.builder()
                .subject(this.subject)
                .content(this.content)
                .build();

        assertEquals(this.subject, invoiceHeaderNote.subject);
        assertEquals(this.content, invoiceHeaderNote.content);
    }
}
