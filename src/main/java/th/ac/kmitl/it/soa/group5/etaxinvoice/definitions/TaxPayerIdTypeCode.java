package th.ac.kmitl.it.soa.group5.etaxinvoice.definitions;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

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

    public static Map<String, TaxPayerIdTypeCode> mapper = new HashMap<>();
    static {
        for (TaxPayerIdTypeCode taxPayerIdTypeCode : TaxPayerIdTypeCode.values()) {
            mapper.put(taxPayerIdTypeCode.getTaxPlayerIdCode(), taxPayerIdTypeCode);
        }
    }

    public static TaxPayerIdTypeCode parse(String taxPlayerIdCode) {
        TaxPayerIdTypeCode taxPayerIdTypeCode = mapper.get(taxPlayerIdCode);

        if (taxPayerIdTypeCode == null) {
            throw new IllegalArgumentException("There is no value with name " + taxPlayerIdCode);
        }

        return mapper.get(taxPlayerIdCode);
    }
}

