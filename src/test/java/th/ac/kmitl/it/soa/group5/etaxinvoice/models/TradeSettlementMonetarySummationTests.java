package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TradeSettlementMonetarySummationTests {
    private float lineTotalAmount = (float)500.00;
    private float taxBasisTotalAmount = (float)500.00;
    private float taxTotalAmount = (float)900.45;
    private float grandTotalAmount = (float)600.88;
    private float allowanceTotalAmount = (float)200.99;
    private float chargeTotalAmount = (float) 200.34;

    @Test
    public void getValueFromExchangedDocumentModel() {
        TradeSettlementMonetarySummation.Builder builder = new TradeSettlementMonetarySummation.Builder();
        TradeSettlementMonetarySummation exdoc = builder
                .lineTotalAmount(this.lineTotalAmount)
                .taxBasisTotalAmount(this.taxBasisTotalAmount)
                .taxTotalAmount(this.taxTotalAmount)
                .grandTotalAmount(this.grandTotalAmount)
                .allowanceTotalAmount(this.allowanceTotalAmount)
                .chargeTotalAmount(this.chargeTotalAmount)
                .build();

        assertEquals(this.lineTotalAmount, exdoc.lineTotalAmount);
        assertEquals(this.taxBasisTotalAmount, exdoc.taxBasisTotalAmount);
        assertEquals(this.taxTotalAmount, exdoc.taxTotalAmount);
        assertEquals(this.grandTotalAmount, exdoc.grandTotalAmount);
        assertEquals(this.allowanceTotalAmount, exdoc.allowanceTotalAmount);
        assertEquals(this.chargeTotalAmount, exdoc.chargeTotalAmount);
    }
}