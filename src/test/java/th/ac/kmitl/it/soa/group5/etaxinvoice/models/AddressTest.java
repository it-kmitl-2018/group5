package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddressTest {

    private String buildingNumber = "657";
    private String alley = "ฉลองกรุง1";
    private String villageNo = "-";
    private String streetName = "ฉลองกรุง";
    private String district = "ลาดกระบัง";
    private String area = "ลาดกระบัง";
    private String province = "ลาดกระบัง";
    private String country = "ไทย";
    private String postcode = "10520";

    @Test
    public void getValueFromAddressModel() {
        Address.Builder builder = new Address.Builder();
        Address address = builder
                .buildingNumber(this.buildingNumber)
                .alley(this.alley)
                .villageNo(this.villageNo)
                .streetName(this.streetName)
                .district(this.district)
                .area(this.area)
                .province(this.province)
                .country(this.country)
                .postcode(this.postcode)
                .build();

        assertEquals(this.buildingNumber, address.buildingNumber);
        assertEquals(this.alley, address.alley);
        assertEquals(this.villageNo, address.villageNo);
        assertEquals(this.streetName, address.streetName);
        assertEquals(this.district, address.district);
        assertEquals(this.area, address.area);
        assertEquals(this.province, address.province);
        assertEquals(this.country, address.country);
        assertEquals(this.postcode, address.postcode);
    }
}
