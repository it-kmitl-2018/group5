package th.ac.kmitl.it.soa.group5.etaxinvoice.usecases;

public class NetValueCalculate {
    // TODO

    NetValueCalculate netVal = new NetValueCalculate();
    float totalProductValue = netVal.totalProductValue();
    float calculateDiscount = netVal.calculateDiscount();
    float calculateCharge = netVal.calculateCharge();
    float vatRate = netVal.vatRate();
    float calculateNetAmountNoneVat = netVal.calculateNetAmountNoneVat();
    float calculateVat = netVal.calculateVat();
    float calculateNetValue = netVal.calculateNetValue();

    public float totalProductValue() {
        //TODO
        float totalproductValue = 0;
        return totalproductValue;
    }

    public float calculateDiscount() {
        // TODO
        float discount = 0;
        float discountCal = (discount * totalProductValue)/100;
        return discountCal;
    }

    public float calculateCharge() {
        // TODO
        float charge = 0;
        float chargeCal = (charge * totalProductValue)/100;
        return chargeCal;
    }

    public float vatRate() {
        //TODO
        float vatRate = 0;
        return vatRate;
    }

    public float calculateNetAmountNoneVat() {
        float netAmountNoneVatCal = (totalProductValue - calculateDiscount) + calculateCharge;
        return netAmountNoneVatCal;
    }

    public float calculateVat() {
        float vatCal = (vatRate * calculateNetAmountNoneVat)/100;
        return vatCal;
    }

    public float calculateNetValue() {
        float netValueCal = calculateNetAmountNoneVat + calculateVat;
        return netValueCal;
    }
}