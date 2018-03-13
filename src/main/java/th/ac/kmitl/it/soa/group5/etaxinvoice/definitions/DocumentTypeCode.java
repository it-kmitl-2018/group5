package th.ac.kmitl.it.soa.group5.etaxinvoice.definitions;

import lombok.Getter;

public enum DocumentTypeCode {

    DEBIT_NOTE ("80", "ใบเพิ่มหนี้ (Debit note)"),
    CREDIT_NOTE ("81", "ใบลดหนี้ (Credit note)"),
    INVOICE ("380", "ใบแจ้งหนี้ (Invoice)"),
    TAX_INVOICE ("388", "ใบกำกับภาษี (Tax Invoice)"),
    RECEIPT ("T01", "ใบรับ (Receipt)"),
    INVOICE_AND_TAX_INVOICE ("T02", "ใบแจ้งหนี้/ใบกำกับภาษี (Invoice/ Tax Invoice)"),
    RECEIPT_TAX_INVOICE ("T03", "ใบเสร็จรับเงิน/ใบกํากับภาษี (Receipt/ Tax Invoice)"),
    DELIVERY_AND_TAX_INVOICE ("T04", "ใบส่งของ/ใบกํากับภําษี (Delivery order/ Tax Invoice)"),
    ABBREVIATED_TAX_INVOICE ("T05", "ใบกํากับภําษีอย่ํางย่อ (Abbreviated Tax Invoice)"),
    RECEIPT_AND_ABBREVIATED_TAX_INVOICE ("T06", "ใบเสร็จรับเงิน/ใบกํากับภําษีอย่างย่อ (Receipt/Abbreviated Tax Invoice)"),
    CANCELLATION_NOTE ("T07", "ใบแจ้งยกเลิก (Cancellation note)");

    private @Getter String documentCode;
    private @Getter String documentName;

    DocumentTypeCode(String documentCode, String documentName) {
        this.documentCode = documentCode;
        this.documentName = documentName;
    }
}
