package th.ac.kmitl.it.soa.group5.etaxinvoice;

import org.junit.Test;
import th.ac.kmitl.it.soa.group5.etaxinvoice.definitions.TaxPayerIdTypeCode;

import static org.junit.Assert.assertEquals;

public class TaxPayerIdTypeCodeTest {

    @Test
    public void shouldGetCorrectCode(){
        assertEquals(TaxPayerIdTypeCode.TAX_ID.getTaxPlayerIdCode(), "TXID");
        assertEquals(TaxPayerIdTypeCode.ID_CARD_NUMBER.getTaxPlayerIdCode(), "NIDN");
        assertEquals(TaxPayerIdTypeCode.PASSPORT_NUMBER.getTaxPlayerIdCode(), "CCPT");
        assertEquals(TaxPayerIdTypeCode.OTHER_ID.getTaxPlayerIdCode(), "OTHR");
    }

    @Test
    public void shouldGetCorrectName(){
        assertEquals(TaxPayerIdTypeCode.TAX_ID.getTaxPlayerIdName(), "เลขประจำตัวผู้เสียภาษีอากรสำหรับนิติบัคคล 13 หลัก รวมเลขสาขาอีก 5 หลัก");
        assertEquals(TaxPayerIdTypeCode.ID_CARD_NUMBER.getTaxPlayerIdName(), "เลขประจำตัวประชาชน 13 หลัก (สำหรับบุคคลธรรมดา)");
        assertEquals(TaxPayerIdTypeCode.PASSPORT_NUMBER.getTaxPlayerIdName(), "เลขหนังสือเดินทาง (Passport)");
        assertEquals(TaxPayerIdTypeCode.OTHER_ID.getTaxPlayerIdName(), "ตัวระบุอื่นๆใช้ในการระบุเอกลักษณ์ผู้ซื้อนอกเหนือจาก Scheme TXID NIDN CCPT หากไม่ต้องการระบุเป็น N/A");
    }
}
