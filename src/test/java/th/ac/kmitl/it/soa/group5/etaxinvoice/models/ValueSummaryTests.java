package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValueSummaryTests {
    private float lineTotalAmount = (float)500.00;
    private float taxBasisTotalAmount = (float)500.00;
    private float taxTotalAmount = (float)900.45;
    private float grandTotalAmount = (float)600.88;
    private float allowanceTotalAmount = (float)200.99;
    private float chargeTotalAmount = (float) 200.34;

    @Test
    public void getValueFromExchangedDocumentModel(){
        ValueSummary valueSummary = new ValueSummary();
        valueSummary.setLineTotalAmount(this.lineTotalAmount);
        valueSummary.setTaxBasisTotalAmount(this.taxBasisTotalAmount);
        valueSummary.setTaxTotalAmount(this.taxTotalAmount);
        valueSummary.setGrandTotalAmount(this.grandTotalAmount);
        valueSummary.setAllowanceTotalAmount(this.allowanceTotalAmount);
        valueSummary.setChargeTotalAmount(this.chargeTotalAmount);

        assertEquals(lineTotalAmount, valueSummary.getLineTotalAmount(), 0);
        assertEquals(taxBasisTotalAmount, valueSummary.getTaxBasisTotalAmount(), 0);
        assertEquals(taxTotalAmount, valueSummary.getTaxTotalAmount(), 0);
        assertEquals(grandTotalAmount, valueSummary.getGrandTotalAmount(), 0);
        assertEquals(allowanceTotalAmount, valueSummary.getAllowanceTotalAmount(), 0);
        assertEquals(chargeTotalAmount, valueSummary.getChargeTotalAmount(), 0);

        }
}
