package th.ac.kmitl.it.soa.group5.etaxinvoice.definitions;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public enum MessageFunctionTypeCode {

    INCREASE_PRODUCT_PRICE("DBNG01", "มีการเพิ่มราคาค่าสินค้า  (สินค้าเกินกว่าจำนวนที่ตกลงกัน)"),
    UNDER_CALCULATE_PRODUCT_PRICE("DBNG02", "คำนวณราคาสินค้า ผิดพลาดต่ำกว่าที่เป็นจริง"),
    OTHER_PRODUCT_REASON_DEBIT_NOTE("DBNG99", "เหตุอื่น (ระบุสาเหตุ)"),
    INCREASE_SERVICE_PRICE("DBNS01", "การเพิ่มราคาค่าบริการ (บริการเกินกว่าข้อกำหนดที่ตกลงกัน)"),
    UNDER_CALCULATE_SERVICE_PRICE("DBNS02", "คำนวณราคาค่าบริการ ผิดพลาดต่ำกว่าที่เป็นจริง"),
    OTHER_SERVICE_REASON_DEBIT_NOTE("DBNS99", "เหตุอื่น (ระบุสาเหตุ)"),
    DISCOUNT_PRODUCT_PRICE("DCNG01", "ลดราคาสินค้าที่ขาย (สินค้าผิดข้อกำหนดที่ตกลงกัน)"),
    PRODUCT_DAMAGED("DCNG02", "สินค้าชำรุดเสียหาย"),
    MISSING_PRODUCT_ITEMS("DCNG03", "สินค้าขาดจำนวนตามที่ตกลงซื้อขาย"),
    OVER_CALCULATE_PRODUCT_PRICE("DCNG04", "คำนวณราคาสินค้าผิดพลาดสูงกว่าที่เป็นจริง"),
    RETURN_PRODUCT("DCNG05", "รับคืนสินค้า (ไม่ตรงตามคำพรรณนา)"),
    OTHER_PRODUCT_REASON_CREDIT_NOTE("DCNG99", "เหตุอื่น (ระบุสาเหตุ)"),
    DISCOUNT_SERVICE_CHARGE("DCNS01", "ลดราคาค่าบริการ (บริการผิดข้อกำหนดที่ตกลงกัน)"),
    INCOMPLETE_SERVICE_CHARGE("DCNS02", "ค่าบริการขาดจำนวน"),
    OVER_CALCULATE_SERVICE_CHARGE("DCNS03", "คำนวณราคาค่าบริการผิดพลาดสูงกว่าที่เป็นจริง"),
    CONTRACT_CANCELLATION("DCNS04", "บอกเลิกสัญญาบริการ"),
    OTHER_SERVICE_REASON_CREDIT_NOTE("DCNS99", "เหตุอื่น (ระบุสาเหตุ)"),
    WRONG_NAME_AT_TAX_INVOICE("TIVC01", "ชื่อผิด"),
    WRONG_ADDRESS_AT_TAX_INVOICE("TIVC02", "ที่อยู่ผิด"),
    OTHER_REASON_AT_TAX_INVOICE("TIVC99", "เหตุอื่น (ระบุสาเหตุ)"),
    WRONG_NAME_AT_RECEIPT("RCTC01", "ชื่อผิด"),
    WRONG_ADDRESS_AT_RECEIPT("RCTC02", "ที่อยู่ผิด"),
    RETURN_PRODUCT_OR_SERVICE_CANCELLATION_ALL("RCTC03", "รับคืนสินค้า / ยกเลิกบริการ ทั้งจำนวน (ระบุจำนวนบาท)"),
    RETURN_PRODUCT_OR_SERVICE_CANCELLATION_SOME("RCTC04", "รับคืนสินค้า / ยกเลิกบริการ บางส่วนจำนวน (ระบุจำนวนบาท)"),
    OTHER_REASON_AT_RECEIPT("RCTC99", "เหตุอื่น (ระบุสาเหตุ)");

    private @Getter String messageFunctionCode;
    private @Getter String messageFunctionName;

    MessageFunctionTypeCode(String messageFunctionCode, String messageFunctionName) {
        this.messageFunctionCode = messageFunctionCode;
        this.messageFunctionName = messageFunctionName;
    }

    public static Map<String, MessageFunctionTypeCode> mapper = new HashMap<>();
    static {
        for (MessageFunctionTypeCode messageFunctionTypeCode : MessageFunctionTypeCode.values()) {
            mapper.put(messageFunctionTypeCode.getMessageFunctionCode(), messageFunctionTypeCode);
        }
    }

    public static MessageFunctionTypeCode parse(String messageFunctionCode) {
        MessageFunctionTypeCode messageFunctionTypeCode = mapper.get(messageFunctionCode);

        if (messageFunctionTypeCode == null) {
            throw new IllegalArgumentException("There is no value with name " + messageFunctionCode);
        }

        return mapper.get(messageFunctionCode);
    }
}
