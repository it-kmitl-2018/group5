package th.ac.kmitl.it.soa.group5.etaxinvoice.definitions;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UNDocumentTypeCodeTest {

    @Test
    public void shouldGetCorrectCode(){
        assertEquals(UNDocumentTypeCode.METERED_SERVICES_INVOICE , UNDocumentTypeCode.parse("82"));
        assertEquals(UNDocumentTypeCode.CREDIT_NOTE_FINANCIAL , UNDocumentTypeCode.parse("83"));
        assertEquals(UNDocumentTypeCode.DEBIT_NOTE_FINANCIAL , UNDocumentTypeCode.parse("84"));
        assertEquals(UNDocumentTypeCode.SELF_BILLED_CREDIT_NOTE , UNDocumentTypeCode.parse("261"));
        assertEquals(UNDocumentTypeCode.CONSOLIDATED_CREDIT_NOTE , UNDocumentTypeCode.parse("262"));
        assertEquals(UNDocumentTypeCode.PROFORMA_INVOICE , UNDocumentTypeCode.parse("325"));
        assertEquals(UNDocumentTypeCode.COMMERCIAL_INVOICE , UNDocumentTypeCode.parse("380"));
        assertEquals(UNDocumentTypeCode.CREDIT_NOTE , UNDocumentTypeCode.parse("381"));
        assertEquals(UNDocumentTypeCode.DEBIT_NOTE , UNDocumentTypeCode.parse("383"));
        assertEquals(UNDocumentTypeCode.CORRECTED_INVOICE , UNDocumentTypeCode.parse("384"));
        assertEquals(UNDocumentTypeCode.CONSOLIDATED_INVOICE , UNDocumentTypeCode.parse("385"));
        assertEquals(UNDocumentTypeCode.PREPAYMENT_INVOICE , UNDocumentTypeCode.parse("386"));
        assertEquals(UNDocumentTypeCode.SELF_BILLED_INVOICE , UNDocumentTypeCode.parse("389"));
        assertEquals(UNDocumentTypeCode.CONSIGNMENT_INVOICE , UNDocumentTypeCode.parse("395"));
        assertEquals(UNDocumentTypeCode.FACTORED_CREDIT_NOTE , UNDocumentTypeCode.parse("396"));
    }

    @Test
    public void shouldGetCorrectName(){
        assertEquals(UNDocumentTypeCode.METERED_SERVICES_INVOICE.getUnDocumentName(), "Metered services invoice");
        assertEquals(UNDocumentTypeCode.CREDIT_NOTE_FINANCIAL.getUnDocumentName(), "Credit note releted to financial adjustments");
        assertEquals(UNDocumentTypeCode.DEBIT_NOTE_FINANCIAL.getUnDocumentName(), "Debit note releted to financial adjustments");
        assertEquals(UNDocumentTypeCode.SELF_BILLED_CREDIT_NOTE.getUnDocumentName(), "Self billed credit note");
        assertEquals(UNDocumentTypeCode.CONSOLIDATED_CREDIT_NOTE.getUnDocumentName(), "Consolidated credit note - goods and services");
        assertEquals(UNDocumentTypeCode.PROFORMA_INVOICE.getUnDocumentName(), "Proforma invoice");
        assertEquals(UNDocumentTypeCode.COMMERCIAL_INVOICE.getUnDocumentName(), "Commercial invoice");
        assertEquals(UNDocumentTypeCode.CREDIT_NOTE.getUnDocumentName(), "Credit note");
        assertEquals(UNDocumentTypeCode.DEBIT_NOTE.getUnDocumentName(), "Debit note");
        assertEquals(UNDocumentTypeCode.CORRECTED_INVOICE.getUnDocumentName(), "Corrected invoice");
        assertEquals(UNDocumentTypeCode.CONSOLIDATED_INVOICE.getUnDocumentName(), "Consolidated invoice");
        assertEquals(UNDocumentTypeCode.PREPAYMENT_INVOICE.getUnDocumentName(), "Prepayment invoice");
        assertEquals(UNDocumentTypeCode.SELF_BILLED_INVOICE.getUnDocumentName(), "Self-billed invoice");
        assertEquals(UNDocumentTypeCode.CONSIGNMENT_INVOICE.getUnDocumentName(), "Consignment invoice");
        assertEquals(UNDocumentTypeCode.FACTORED_CREDIT_NOTE.getUnDocumentName(), "Factored credit note");
    }

    @Test
    public void shouldThrowException() {
        IllegalArgumentException e = assertThrows(
                IllegalArgumentException.class, () -> UNDocumentTypeCode.parse("XXX"));
    }
}