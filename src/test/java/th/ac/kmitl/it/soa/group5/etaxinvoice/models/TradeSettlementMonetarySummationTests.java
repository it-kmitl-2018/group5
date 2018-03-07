package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TradeSettlementMonetarySummationTests {
    private float lineTotalAmount = (float)500.00;
    private float taxBasisTotalAmount = (float)500.00;
    private float taxTotalAmount = (float)900.45;
    private float grandTotalAmount = (float)600.88;
    private float allowanceTotalAmount = (float)200.99;
    private float chargeTotalAmount = (float) 200.34;

    @Test
    public void getValueFromExchangedDocumentModel(){

        TradeSettlementMonetarySummation tradeSettlementMonetarySummation = new TradeSettlementMonetarySummation();
        tradeSettlementMonetarySummation.setLineTotalAmount(this.lineTotalAmount);
        tradeSettlementMonetarySummation.setTaxBasisTotalAmount(this.taxBasisTotalAmount);
        tradeSettlementMonetarySummation.setTaxTotalAmount(this.taxTotalAmount);
        tradeSettlementMonetarySummation.setGrandTotalAmount(this.grandTotalAmount);
        tradeSettlementMonetarySummation.setAllowanceTotalAmount(this.allowanceTotalAmount);
        tradeSettlementMonetarySummation.setChargeTotalAmount(this.chargeTotalAmount);

        assertEquals(lineTotalAmount, tradeSettlementMonetarySummation.getLineTotalAmount(), 0);
        assertEquals(taxBasisTotalAmount, tradeSettlementMonetarySummation.getTaxBasisTotalAmount(), 0);
        assertEquals(taxTotalAmount, tradeSettlementMonetarySummation.getTaxTotalAmount(), 0);
        assertEquals(grandTotalAmount, tradeSettlementMonetarySummation.getGrandTotalAmount(), 0);
        assertEquals(allowanceTotalAmount, tradeSettlementMonetarySummation.getAllowanceTotalAmount(), 0);
        assertEquals(chargeTotalAmount, tradeSettlementMonetarySummation.getChargeTotalAmount(), 0);

        }
}
