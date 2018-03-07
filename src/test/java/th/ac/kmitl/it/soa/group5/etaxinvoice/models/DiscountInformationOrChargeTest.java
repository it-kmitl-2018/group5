package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import org.junit.Test;
import static org.junit.Assert.*;

public class DiscountInformationOrChargeTest {

    private boolean chargeIndicator = Boolean.TRUE;
    private float actualAmount = (float) 100.0;
    private String reasonOfDiscountOrCharge = "ส่วนลดจากราคาปกติ";
    private String reasonOfDiscountOrChargeCode = "95";

    @Test
    public void getValuesFromDiscountInformationOrChargeModel() {
        DiscountInformationOrCharge discountInformationOrCharge =
                new DiscountInformationOrCharge();
        discountInformationOrCharge.setChargeIndicator(this.chargeIndicator);
        discountInformationOrCharge.setActualAmount(this.actualAmount);
        discountInformationOrCharge.setReasonOfDiscountOrCharge(this.reasonOfDiscountOrCharge);
        discountInformationOrCharge.setReasonOfDiscountOrChargeCode(
                this.reasonOfDiscountOrChargeCode);

        assertTrue(this.chargeIndicator);
        assertEquals(this.actualAmount, discountInformationOrCharge.getActualAmount(), 0);
        assertEquals(this.reasonOfDiscountOrCharge, discountInformationOrCharge
                .getReasonOfDiscountOrCharge());
        assertEquals(this.reasonOfDiscountOrChargeCode, discountInformationOrCharge
                .getReasonOfDiscountOrChargeCode());
    }
}