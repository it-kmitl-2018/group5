package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReasonForDiscountOrChargeTest {

    @Test
    public void shouldGetCorrectCodeAndDescription() {
        assertEquals(ReasonForDiscountOrCharge.STAMP_DUTY.getReasonCode(), "28");
        assertEquals(ReasonForDiscountOrCharge.STAMP_DUTY.getReason(), "ค่าอากรสแตมป์");
        assertEquals(ReasonForDiscountOrCharge.BANK_CHARGES.getReasonCode(), "30");
        assertEquals(ReasonForDiscountOrCharge.BANK_CHARGES.getReason(), "ค่าธรรมเนียมที่เกิดจากการทำุรกรรมกับธนาคาร");
    }
}