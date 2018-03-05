package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import org.junit.Test;
import static org.junit.Assert.*;

public class ApplicableTradeTaxtest {

    private String typeCode = "VAT" ;
    private float calculatedRate = (float) 7.00;
    private float basisAmount = (float) 100.00;
    private float calculatedAmount = (float) 7.00;

    @Test
    public void getValuesFromApplicableTradeTaxModel() {
        ApplicableTradeTax applicableTradeTax = new ApplicableTradeTax();
        applicableTradeTax.setTypeCode(this.typeCode);
        applicableTradeTax.setCalculatedRate(this.calculatedRate);
        applicableTradeTax.setBasisAmount(this.basisAmount);
        applicableTradeTax.setCalculatedAmount(this.calculatedAmount);

        assertEquals(this.typeCode, applicableTradeTax.getTypeCode());
        assertEquals(this.calculatedRate, applicableTradeTax.getCalculatedRate(),0);
        assertEquals(this.basisAmount, applicableTradeTax.getBasisAmount(), 0);
        assertEquals(this.calculatedAmount, applicableTradeTax.getCalculatedAmount(), 0);
    }
}