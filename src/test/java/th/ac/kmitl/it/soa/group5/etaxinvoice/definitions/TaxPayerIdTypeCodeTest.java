package th.ac.kmitl.it.soa.group5.etaxinvoice.definitions;

import org.junit.Test;
import th.ac.kmitl.it.soa.group5.etaxinvoice.definitions.TaxPayerIdTypeCode;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TaxPayerIdTypeCodeTest {

    @Test
    public void shouldGetCorrectCode(){
        assertEquals(TaxPayerIdTypeCode.TAX_ID , TaxPayerIdTypeCode.parse("TXID"));
        assertEquals(TaxPayerIdTypeCode.ID_CARD_NUMBER, TaxPayerIdTypeCode.parse("NIDN"));
        assertEquals(TaxPayerIdTypeCode.PASSPORT_NUMBER, TaxPayerIdTypeCode.parse("CCPT"));
        assertEquals(TaxPayerIdTypeCode.OTHER_ID, TaxPayerIdTypeCode.parse("OTHR"));
    }

    @Test
    public void shouldGetCorrectName(){
        assertEquals(TaxPayerIdTypeCode.TAX_ID.getTaxPlayerIdName(), "เลขประจำตัวผู้เสียภาษีอากรสำหรับนิติบัคคล 13 หลัก รวมเลขสาขาอีก 5 หลัก");
        assertEquals(TaxPayerIdTypeCode.ID_CARD_NUMBER.getTaxPlayerIdName(), "เลขประจำตัวประชาชน 13 หลัก (สำหรับบุคคลธรรมดา)");
        assertEquals(TaxPayerIdTypeCode.PASSPORT_NUMBER.getTaxPlayerIdName(), "เลขหนังสือเดินทาง (Passport)");
        assertEquals(TaxPayerIdTypeCode.OTHER_ID.getTaxPlayerIdName(), "ตัวระบุอื่นๆใช้ในการระบุเอกลักษณ์ผู้ซื้อนอกเหนือจาก Scheme TXID NIDN CCPT หากไม่ต้องการระบุเป็น N/A");
    }

    @Test
    public void shouldThrowException(){
        IllegalArgumentException e = assertThrows(
                IllegalArgumentException.class, () -> TaxPayerIdTypeCode.parse("XXX"));
    }
}
