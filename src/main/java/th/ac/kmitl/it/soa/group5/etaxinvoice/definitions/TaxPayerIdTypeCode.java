package th.ac.kmitl.it.soa.group5.etaxinvoice.definitions;

import lombok.Getter;

public enum TaxPayerIdTypeCode {

    TAX_ID ("TXID", "เลขประจำตัวผู้เสียภาษีอากรสำหรับนิติบัคคล 13 หลัก รวมเลขสาขาอีก 5 หลัก"),
    ID_CARD_NUMBER ("NIDN", "เลขประจำตัวประชาชน 13 หลัก (สำหรับบุคคลธรรมดา)"),
    PASSPORT_NUMBER ("CCPT", "เลขหนังสือเดินทาง (Passport)"),
    OTHER_ID ("OTHR", "ตัวระบุอื่นๆใช้ในการระบุเอกลักษณ์ผู้ซื้อนอกเหนือจาก Scheme TXID NIDN CCPT หากไม่ต้องการระบุเป็น N/A");
    private @Getter String taxPlayerIdCode;
    private @Getter String taxPlayerIdName;

    TaxPayerIdTypeCode(String taxPlayerIdCode, String taxPlayerIdName) {
        this.taxPlayerIdCode = taxPlayerIdCode;
        this.taxPlayerIdName = taxPlayerIdName;
    }
}

