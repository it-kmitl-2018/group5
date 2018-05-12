package th.ac.kmitl.it.soa.group5.etaxinvoice;

import org.junit.Test;
import th.ac.kmitl.it.soa.group5.etaxinvoice.definitions.ReasonForDiscountOrCharge;

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