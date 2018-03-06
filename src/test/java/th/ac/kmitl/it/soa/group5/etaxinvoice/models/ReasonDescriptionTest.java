package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReasonDescriptionTest {

    @Test
    public static void main(String[] args) {
        assertEquals("28", ReasonDescription.DiscountOrChargeIndentificationCode
                .STAMP_DUTY.reasonCode);
        assertEquals("ค่าอากรสแตมป์", ReasonDescription.DiscountOrChargeIndentificationCode
                .STAMP_DUTY.descriptionReason);
    }
}