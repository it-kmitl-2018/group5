package th.ac.kmitl.it.soa.group5.etaxinvoice.definitions;

import lombok.Getter;

public enum ReferenceTypeCode {
    
    INVOICE_NUMBER ("IV", "เลขใบแจ้งหนี้"),
    REFERENCE_NUMBER_OF_DOCUMENT ("LC", "เลขอ้างอิงระบุเอกสาร"),
    BARCODE_SERIAL_NUMBER ("LS", "เลขบาร์โค้ด"),
    ORDER_NUMBER ("ON", "เลขที่สั่งซื้อออกโดยผู้ซื้อ"),
    IDENTICAL_ITEM_NUMBER ("SE", "เลขระบสุินค้า"),
    PREVIOUS_TAX_NUMBER ("ALT", "เลขใบกากับภาษีใบเดิม"),
    DEBIT_NOTE_NUMBER ("DL", "หมายเลขใบเพิ่มหนี้"),
    CREDIT_NOTE_NUMBER ("CD", "หมายเลขใบลดหนี้"),
    ORTHER_REFERENCE_NUMBER ("ZZZ", "เอกสารอื่นๆ");

    private @Getter String referenceCode;
    private @Getter String referenceName;

    ReferenceTypeCode(String referenceCode, String referenceName) {
        this.referenceCode = referenceCode;
        this.referenceName = referenceName;
    }
}
