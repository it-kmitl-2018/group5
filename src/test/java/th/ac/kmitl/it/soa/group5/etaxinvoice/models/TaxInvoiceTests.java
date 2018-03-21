package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TaxInvoiceTests {

    private String typeCode = "VAT" ;
    private float calculatedRate = (float) 7.00;
    private float basisAmount = (float) 100.00;
    private float calculatedAmount = (float) 7.00;

    @Test
    public void getValuesFromApplicableTradeTaxModel() {

        TaxInvoice.Builder builder = new TaxInvoice.Builder();
        TaxInvoice exdoc = builder
                .typeCode(this.typeCode)
                .calculatedRate(this.calculatedRate)
                .basisAmount(this.basisAmount)
                .calculatedAmount(this.calculatedAmount)
                .build();

        assertEquals(this.typeCode, exdoc.typeCode);
        assertEquals(this.calculatedRate, exdoc.calculatedRate);
        assertEquals(this.basisAmount, exdoc.basisAmount);
        assertEquals(this.calculatedAmount, exdoc.calculatedAmount);
    }
}