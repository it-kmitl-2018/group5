package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ApplicableTradeTaxtest {

    private String typeCode = "VAT" ;
    private float taxRate = (float) 7.00;
    private float valueExcludingTax = (float) 100.00;
    private float taxValue = (float) 7.00;

    @Test
    public void getValuesFromApplicableTradeTaxModel() {
        ApplicableTradeTax.Builder builder = new ApplicableTradeTax.Builder();
        ApplicableTradeTax taxInfo = builder
                .typeCode(this.typeCode)
                .taxRate(this.taxRate)
                .valueExcludingTax(this.valueExcludingTax)
                .taxValue(this.taxValue)
                .build();

        assertEquals(this.typeCode, taxInfo.typeCode);
        assertEquals(this.taxRate, taxInfo.taxRate);
        assertEquals(this.valueExcludingTax, taxInfo.valueExcludingTax);
        assertEquals(this.taxValue, taxInfo.taxValue);
    }
}