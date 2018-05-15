package th.ac.kmitl.it.soa.group5.etaxinvoice;

import org.junit.Test;
import th.ac.kmitl.it.soa.group5.etaxinvoice.definitions.ReasonForDiscountOrCharge;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReasonForDiscountOrChargeTest {

    @Test
    public void shouldGetCorrectCode() {
        assertEquals(ReasonForDiscountOrCharge.STAMP_DUTY, ReasonForDiscountOrCharge.parse("28"));
        assertEquals(ReasonForDiscountOrCharge.BANK_CHARGES,
                ReasonForDiscountOrCharge.parse("30"));
    }

    @Test
    public void shouldGetCorrectCodeAndDescription() {
        assertEquals(ReasonForDiscountOrCharge.STAMP_DUTY.getReason(), "ค่าอากรสแตมป์");
        assertEquals(ReasonForDiscountOrCharge.BANK_CHARGES
                .getReason(), "ค่าธรรมเนียมที่เกิดจากการทำุรกรรมกับธนาคาร");
    }

    @Test
    public void shouldThrowException(){
        IllegalArgumentException e = assertThrows(
                IllegalArgumentException.class, () -> ReasonForDiscountOrCharge.parse("XXX"));
    }
}