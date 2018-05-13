package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountInformationOrChargeTest {

    private boolean chargeIndicator = Boolean.TRUE;
    private float actualAmount = (float) 100.0;
    private String reasonOfDiscountOrCharge = "ส่วนลดจากราคาปกติ";
    private String reasonOfDiscountOrChargeCode = "95";

    @Test
    public void getValuesFromDiscountInformationOrChargeModel() {
        DiscountInformationOrCharge.Builder builder = new DiscountInformationOrCharge.Builder();
        DiscountInformationOrCharge discountInformationOrCharge = builder
                .chargeIndicator(this.chargeIndicator)
                .actualAmount(this.actualAmount)
                .reasonOfDiscountOrCharge(this.reasonOfDiscountOrCharge)
                .reasonOfDiscountOrChargeCode(this.reasonOfDiscountOrChargeCode)
                .build();

        assertTrue(this.chargeIndicator);
        assertEquals(this.actualAmount, discountInformationOrCharge.actualAmount);
        assertEquals(this.reasonOfDiscountOrCharge, discountInformationOrCharge
                .reasonOfDiscountOrCharge);
        assertEquals(this.reasonOfDiscountOrChargeCode, discountInformationOrCharge
                .reasonOfDiscountOrChargeCode);
    }
}