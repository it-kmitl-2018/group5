package th.ac.kmitl.it.soa.group5.etaxinvoice.definitions;

import lombok.Getter;

public enum ReasonForDiscountOrCharge {
    STAMP_DUTY ("28", "ค่าอากรสแตมป์"),
    BANK_CHARGES ("30", "ค่าธรรมเนียมที่เกิดจากการทำุรกรรมกับธนาคาร"),
    MINIMUM_COMMISSION ("52", "ค่าดำเนินการขั้นต่ำ"),
    TRANSFER_CHARGES ("55", "ค่าธรรมเนียมจากการโอนเงิน"),
    MISCELLANEOUS_CHARGES ("57", "ค่าเบ็ดเตล็ด"),
    FOREIGN_EXCHANGE_CHARGES ("58", "ค่าธรรมเนียมจากการเปลี่ยนสกุลเงิน"),
    AN_ALLOWANCE_OR_CHARGE_AS_SPECIFIED_IN_A_SPECIAL_AGREEMENT
            ("65", "ส่วนลดหรือค่าธรรมเนียมที่เกิดจากข้อตกลงพิเศษทางการค้า"),
    SAMPLE_DISCOUNT ("66", "ส่วนลดจากการขายสินค้าสำหรับทดลองตลาด"),
    RUSH_DELIVERY_SURCHARGE ("77", "ค่าธรรมเนียมจากการขนส่งสินค้าให้เร็วขึ้นกว่าปกติ"),
    LOADING_CHARGE ("82", "ค่าธรรมเนียมจากการบรรทุกสินค้า"),
    WAREHOUSING_CHARGE ("85", "ค่าธรรมเนียมในการจัดเก็บสินค้า"),
    A_REDUCTION_FROM_A_USUAL_OR_LIST_PRICE ("95", "ส่วนลดในราคาปกติ"),
    CHARGE_FOR_INSURANCE ("96", "ค่าประกันสินค้าหรือบริการ");

    private @Getter String reasonCode;
    private @Getter String reason;

    ReasonForDiscountOrCharge(String reasonCode, String reason) {
        this.reasonCode = reasonCode;
        this.reason = reason;
    }
}