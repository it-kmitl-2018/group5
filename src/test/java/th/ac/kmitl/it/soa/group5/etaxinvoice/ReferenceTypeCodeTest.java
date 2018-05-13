package th.ac.kmitl.it.soa.group5.etaxinvoice;

import org.junit.Test;
import th.ac.kmitl.it.soa.group5.etaxinvoice.definitions.ReferenceTypeCode;

import static org.junit.Assert.assertEquals;

public class ReferenceTypeCodeTest {

    @Test
    public void shouldGetCorrectCode(){
        assertEquals(ReferenceTypeCode.INVOICE_NUMBER.getReferenceCode(), "IV");
        assertEquals(ReferenceTypeCode.REFERENCE_NUMBER_OF_DOCUMENT.getReferenceCode(), "LC");
        assertEquals(ReferenceTypeCode.BARCODE_SERIAL_NUMBER.getReferenceCode(), "LS");
        assertEquals(ReferenceTypeCode.ORDER_NUMBER.getReferenceCode(), "ON");
        assertEquals(ReferenceTypeCode.IDENTICAL_ITEM_NUMBER.getReferenceCode(), "SE");
        assertEquals(ReferenceTypeCode.PREVIOUS_TAX_NUMBER.getReferenceCode(), "ALT");
        assertEquals(ReferenceTypeCode.DEBIT_NOTE_NUMBER.getReferenceCode(), "DL");
        assertEquals(ReferenceTypeCode.CREDIT_NOTE_NUMBER.getReferenceCode(), "CD");
        assertEquals(ReferenceTypeCode.ORTHER_REFERENCE_NUMBER.getReferenceCode(), "ZZZ");
    }

    @Test
    public void shouldGetCorrectName(){
        assertEquals(ReferenceTypeCode.INVOICE_NUMBER.getReferenceName(), "เลขใบแจ้งหนี้");
        assertEquals(ReferenceTypeCode.REFERENCE_NUMBER_OF_DOCUMENT.getReferenceName(), "เลขอ้างอิงระบุเอกสาร");
        assertEquals(ReferenceTypeCode.BARCODE_SERIAL_NUMBER.getReferenceName(), "เลขบาร์โค้ด");
        assertEquals(ReferenceTypeCode.ORDER_NUMBER.getReferenceName(), "เลขที่สั่งซื้อออกโดยผู้ซื้อ");
        assertEquals(ReferenceTypeCode.IDENTICAL_ITEM_NUMBER.getReferenceName(), "เลขระบสุินค้า");
        assertEquals(ReferenceTypeCode.PREVIOUS_TAX_NUMBER.getReferenceName(), "เลขใบกากับภาษีใบเดิม");
        assertEquals(ReferenceTypeCode.DEBIT_NOTE_NUMBER.getReferenceName(), "หมายเลขใบเพิ่มหนี้");
        assertEquals(ReferenceTypeCode.CREDIT_NOTE_NUMBER.getReferenceName(), "หมายเลขใบลดหนี้");
        assertEquals(ReferenceTypeCode.ORTHER_REFERENCE_NUMBER.getReferenceName(), "เอกสารอื่นๆ");
    }
}