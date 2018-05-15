package th.ac.kmitl.it.soa.group5.etaxinvoice.difinitions;

import org.junit.Test;
import th.ac.kmitl.it.soa.group5.etaxinvoice.definitions.MessageFunctionTypeCode;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MessageFunctionTypeCodeTest {

    @Test
    public void shouldGetCorrectCode() {
        assertEquals(MessageFunctionTypeCode.INCREASE_PRODUCT_PRICE, MessageFunctionTypeCode.parse("DBNG01"));
        assertEquals(MessageFunctionTypeCode.UNDER_CALCULATE_PRODUCT_PRICE, MessageFunctionTypeCode.parse("DBNG02"));
        assertEquals(MessageFunctionTypeCode.INCREASE_SERVICE_PRICE, MessageFunctionTypeCode.parse("DBNS01"));
        assertEquals(MessageFunctionTypeCode.OTHER_SERVICE_REASON_DEBIT_NOTE, MessageFunctionTypeCode.parse("DBNS99"));
        assertEquals(MessageFunctionTypeCode.DISCOUNT_PRODUCT_PRICE, MessageFunctionTypeCode.parse("DCNG01"));
        assertEquals(MessageFunctionTypeCode.PRODUCT_DAMAGED, MessageFunctionTypeCode.parse("DCNG02"));
        assertEquals(MessageFunctionTypeCode.MISSING_PRODUCT_ITEMS, MessageFunctionTypeCode.parse("DCNG03"));
        assertEquals(MessageFunctionTypeCode.WRONG_ADDRESS_AT_RECEIPT, MessageFunctionTypeCode.parse("RCTC02"));
        assertEquals(MessageFunctionTypeCode.OTHER_REASON_AT_RECEIPT, MessageFunctionTypeCode.parse("RCTC99"));
    }

    @Test
    public void shouldGetCorrectName() {
        assertEquals(MessageFunctionTypeCode.INCREASE_PRODUCT_PRICE.getMessageFunctionName(), "มีการเพิ่มราคาค่าสินค้า  (สินค้าเกินกว่าจำนวนที่ตกลงกัน)");
        assertEquals(MessageFunctionTypeCode.UNDER_CALCULATE_PRODUCT_PRICE.getMessageFunctionName(), "คำนวณราคาสินค้า ผิดพลาดต่ำกว่าที่เป็นจริง");
        assertEquals(MessageFunctionTypeCode.INCREASE_SERVICE_PRICE.getMessageFunctionName(), "การเพิ่มราคาค่าบริการ (บริการเกินกว่าข้อกำหนดที่ตกลงกัน)");
        assertEquals(MessageFunctionTypeCode.OTHER_SERVICE_REASON_DEBIT_NOTE.getMessageFunctionName(), "เหตุอื่น (ระบุสาเหตุ)");
        assertEquals(MessageFunctionTypeCode.DISCOUNT_PRODUCT_PRICE.getMessageFunctionName(), "ลดราคาสินค้าที่ขาย (สินค้าผิดข้อกำหนดที่ตกลงกัน)");
        assertEquals(MessageFunctionTypeCode.PRODUCT_DAMAGED.getMessageFunctionName(), "สินค้าชำรุดเสียหาย");
        assertEquals(MessageFunctionTypeCode.MISSING_PRODUCT_ITEMS.getMessageFunctionName(), "สินค้าขาดจำนวนตามที่ตกลงซื้อขาย");
        assertEquals(MessageFunctionTypeCode.WRONG_ADDRESS_AT_RECEIPT.getMessageFunctionName(), "ที่อยู่ผิด");
        assertEquals(MessageFunctionTypeCode.OTHER_REASON_AT_RECEIPT.getMessageFunctionName(), "เหตุอื่น (ระบุสาเหตุ)");

    }

    @Test
    public void shouldThrowException() {
        IllegalArgumentException e = assertThrows(
                IllegalArgumentException.class, () -> MessageFunctionTypeCode.parse("XXX"));
    }
}