package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

        import org.junit.Test;
        import static org.junit.Assert.*;

public class ReasonDescriptionModelTest {

    @Test
    public static void main(String[] args) {
        assertEquals("28", ReasonDescriptionModel.DiscountOrChargeIndentificationCode
                .STAMP_DUTY.reasonCode);
        assertEquals("ค่าอากรสแตมป์", ReasonDescriptionModel.DiscountOrChargeIndentificationCode
                .STAMP_DUTY.descriptionReason);
    }
}