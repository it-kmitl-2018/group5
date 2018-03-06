package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import lombok.Getter;

public class ReasonDescription {

    public enum DiscountOrChargeIndentificationCode {
        STAMP_DUTY ("28", "ค่าอากรสแตมป์"),
        BANK_CHARGES ("30", "ค่าธรรมเนียมที่เกิดจากการทำุรกรรมกับธนาคาร"),
        MIN_COMMISSION ("52", "ค่าดำเนินการขั้นต่ำ"),
        TRANSFER_CHARGES ("55", "ค่าธรรมเนียมจากการโอนเงิน"),
        MISCELLANEOUS_CHARGE ("57", "ค่าเบ็ดเตล็ด"),
        FOREIGN_EXCHANGE_CHARGE ("58", "ค่าธรรมเนียมจากการเปลี่ยนสกุลเงิน"),
        DISCOUNT_OR_CHARGE_SPECIFIED_IN_SPE_AGREEMENT
                ("65", "ส่วนลดหรือค่าธรรมเนียมที่เกิดจากข้อตกลงพิเศษทางการค้า"),
        SAMPLE_DISCOUNT ("66", "ส่วนลดจากการขายสินค้าส าหรับทดลองตลาด"),
        RUSH_DELIV_SURCHARGE ("77", "ค่าธรรมเนียมจากการขนส่งสินค้าให้เร็วขึ้นกว่าปกติ"),
        LOADING_CHARGE ("82", "ค่าธรรมเนียมจากการบรรทุกสินค้า"),
        WAREHOUSING_CHARGE ("85", "ค่าธรรมเนียมในการจัดเก็บสินค้า"),
        REDUCTION_FROM_USUAL_OR_LIST_PRICE ("95", "ส่วนลดในราคาปกติ"),
        CHARGE_FOR_INSURANCE ("96", "ค่าประกันสินค้าหรือบริการ");

        @Getter
        public String reasonCode;
        public String descriptionReason;

        DiscountOrChargeIndentificationCode(String reasonCode, String descriptionReason) {
            this.reasonCode = reasonCode;
            this.descriptionReason = descriptionReason;
        }
    }
}