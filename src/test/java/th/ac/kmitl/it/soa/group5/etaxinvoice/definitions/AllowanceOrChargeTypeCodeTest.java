package th.ac.kmitl.it.soa.group5.etaxinvoice.definitions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AllowanceOrChargeTypeCodeTest {

    @Test
    public void shouldGetCorrectCode() {
        assertEquals(AllowanceOrChargeTypeCode.STAMP_DUTY , AllowanceOrChargeTypeCode.parse("28"));
        assertEquals(AllowanceOrChargeTypeCode.BANK_CHARGES , AllowanceOrChargeTypeCode.parse("30"));
        assertEquals(AllowanceOrChargeTypeCode.MIN_COMMISSION , AllowanceOrChargeTypeCode.parse("52"));
        assertEquals(AllowanceOrChargeTypeCode.TRANSFER_CHARGES , AllowanceOrChargeTypeCode.parse("55"));
        assertEquals(AllowanceOrChargeTypeCode.MISCELLANEOUS_CHARGES , AllowanceOrChargeTypeCode.parse("57"));
        assertEquals(AllowanceOrChargeTypeCode.FOREIGN_EXCHANGE_CHARGES , AllowanceOrChargeTypeCode.parse("58"));
        assertEquals(AllowanceOrChargeTypeCode.ALLOWANCE_OR_CHARGES , AllowanceOrChargeTypeCode.parse("65"));
        assertEquals(AllowanceOrChargeTypeCode.SAMPLE_DISCOUNT , AllowanceOrChargeTypeCode.parse("66"));
        assertEquals(AllowanceOrChargeTypeCode.RUSH_DELIVERY_SURCHARGE , AllowanceOrChargeTypeCode.parse("77"));
        assertEquals(AllowanceOrChargeTypeCode.LOADING_CHARGE , AllowanceOrChargeTypeCode.parse("82"));
        assertEquals(AllowanceOrChargeTypeCode.WAREHOUSING_CHARGE , AllowanceOrChargeTypeCode.parse("85"));
        assertEquals(AllowanceOrChargeTypeCode.REDUCTION_PRICE , AllowanceOrChargeTypeCode.parse("95"));
        assertEquals(AllowanceOrChargeTypeCode.INSURANCE_CHARGE , AllowanceOrChargeTypeCode.parse("96"));
    }

    @Test
    public void shouldGetCorrectName() {
        assertEquals(AllowanceOrChargeTypeCode.STAMP_DUTY.getAllowanceOrChargeName() , "ค่าอากรแสตมป์");
        assertEquals(AllowanceOrChargeTypeCode.BANK_CHARGES.getAllowanceOrChargeName() , "ค่าธรรมเนียมที่เกิดจากการทำธุรกรรมกับธนาคาร");
        assertEquals(AllowanceOrChargeTypeCode.MIN_COMMISSION.getAllowanceOrChargeName() , "ค่าดำเนินการขั้นต่ำ");
        assertEquals(AllowanceOrChargeTypeCode.TRANSFER_CHARGES.getAllowanceOrChargeName() , "ค่าธรรมเนียมจากการโอนเงิน");
        assertEquals(AllowanceOrChargeTypeCode.MISCELLANEOUS_CHARGES.getAllowanceOrChargeName() , "ค่าเบ็ดเตล็ด");
        assertEquals(AllowanceOrChargeTypeCode.FOREIGN_EXCHANGE_CHARGES.getAllowanceOrChargeName() , "ค่าธรรมเนียมจากการเปลี่ยนสกุลเงิน");
        assertEquals(AllowanceOrChargeTypeCode.ALLOWANCE_OR_CHARGES.getAllowanceOrChargeName() , "ส่วนลดหรือค่าธรรมเนียมที่เกิดจากข้อตกลงพิเศษทางการค้า");
        assertEquals(AllowanceOrChargeTypeCode.SAMPLE_DISCOUNT.getAllowanceOrChargeName() , "ส่วนลดสำหรับการขายสินค้าสำหรับทดลองตลาด");
        assertEquals(AllowanceOrChargeTypeCode.RUSH_DELIVERY_SURCHARGE.getAllowanceOrChargeName() , "ค่าธรรมเนียมจากการขนส่งสินค้าให้เร็วขึ้นกว่าปกติ");
        assertEquals(AllowanceOrChargeTypeCode.LOADING_CHARGE.getAllowanceOrChargeName() , "ค่าธรรมเนียมจากการบรรทุกสินค้า");
        assertEquals(AllowanceOrChargeTypeCode.WAREHOUSING_CHARGE.getAllowanceOrChargeName() , "ค่าธรรมเนียมในการจัดเก็บสินค้า");
        assertEquals(AllowanceOrChargeTypeCode.REDUCTION_PRICE.getAllowanceOrChargeName() , "ส่วนลดจากราคาปกติ");
        assertEquals(AllowanceOrChargeTypeCode.INSURANCE_CHARGE.getAllowanceOrChargeName() , "ค่าประกันสินค้าหรือบริการ");
    }

    @Test
    public void shouldThrowException() {
        IllegalArgumentException e = assertThrows(
                IllegalArgumentException.class, () -> AllowanceOrChargeTypeCode.parse("100"));
    }
}