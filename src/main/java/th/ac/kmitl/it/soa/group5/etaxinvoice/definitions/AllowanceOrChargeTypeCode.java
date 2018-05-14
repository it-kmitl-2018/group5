package th.ac.kmitl.it.soa.group5.etaxinvoice.definitions;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public enum AllowanceOrChargeTypeCode {

    STAMP_DUTY ("28", "ค่าอากรแสตมป์"),
    BANK_CHARGES ("30", "ค่าธรรมเนียมที่เกิดจากการทำธุรกรรมกับธนาคาร"),
    MIN_COMMISSION ("52", "ค่าดำเนินการขั้นต่ำ"),
    TRANSFER_CHARGES ("55", "ค่าธรรมเนียมจากการโอนเงิน"),
    MISCELLANEOUS_CHARGES ("57", "ค่าเบ็ดเตล็ด"),
    FOREIGN_EXCHANGE_CHARGES ("58", "ค่าธรรมเนียมจากการเปลี่ยนสกุลเงิน"),
    ALLOWANCE_OR_CHARGES ("65", "ส่วนลดหรือค่าธรรมเนียมที่เกิดจากข้อตกลงพิเศษทางการค้า"),
    SAMPLE_DISCOUNT ("66", "ส่วนลดสำหรับการขายสินค้าสำหรับทดลองตลาด"),
    RUSH_DELIVERY_SURCHARGE ("77", "ค่าธรรมเนียมจากการขนส่งสินค้าให้เร็วขึ้นกว่าปกติ"),
    LOADING_CHARGE ("82", "ค่าธรรมเนียมจากการบรรทุกสินค้า"),
    WAREHOUSING_CHARGE ("85", "ค่าธรรมเนียมในการจัดเก็บสินค้า"),
    REDUCTION_PRICE ("95", "ส่วนลดจากราคาปกติ"),
    INSURANCE_CHARGE ("96", "ค่าประกันสินค้าหรือบริการ");

    private @Getter String allowanceOrChargeCode;
    private @Getter String allowanceOrChargeName;

    AllowanceOrChargeTypeCode(String allowanceOrChargeCode, String allowanceOrChargeName) {
        this.allowanceOrChargeCode = allowanceOrChargeCode;
        this.allowanceOrChargeName = allowanceOrChargeName;
    }


    public static Map<String, AllowanceOrChargeTypeCode> mapper = new HashMap<>();
    static {
        for (AllowanceOrChargeTypeCode allowanceOrChargeTypeCode : AllowanceOrChargeTypeCode.values()) {
            mapper.put(allowanceOrChargeTypeCode.getAllowanceOrChargeCode(), allowanceOrChargeTypeCode);
        }
    }

    public static AllowanceOrChargeTypeCode parse(String allowanceOrChargeCode) {
        AllowanceOrChargeTypeCode allowanceOrChargeTypeCode = mapper.get(allowanceOrChargeCode);

        if (allowanceOrChargeTypeCode == null) {
            throw new IllegalArgumentException("There is no value with name " + allowanceOrChargeCode);
        }

        return mapper.get(allowanceOrChargeCode);
    }
}


