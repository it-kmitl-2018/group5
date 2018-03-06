package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReasonForDiscountOrChargeTest {

    @Test
    public static void getValuesFromReasonForDiscountOrCharge(String[] args) {
        assertEquals("28", ReasonForDiscountOrCharge.DiscountOrChargeIdentificationCode
                .STAMP_DUTY.reasonCode);
        assertEquals("ค่าอากรสแตมป์", ReasonForDiscountOrCharge.DiscountOrChargeIdentificationCode
                .STAMP_DUTY.description);
    }
}