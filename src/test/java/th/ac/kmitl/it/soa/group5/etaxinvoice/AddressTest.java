package th.ac.kmitl.it.soa.group5.etaxinvoice;

import org.junit.Test;
import th.ac.kmitl.it.soa.group5.etaxinvoice.models.Address;

import static org.junit.Assert.assertEquals;

public class AddressTest {

    private String buildingNumber = "657";
    private String alley = "ฉลองกรุง1";
    private String villageNo = "-";
    private String streetName = "ฉลองกรุง";
    private String citySubDivisionID = "101101";
    private String cityID = "1011";
    private String countrySubDivisionID = "10";
    private String countryID = "TH";
    private String postcode = "10520";

    @Test
    public void getValueFormAddressModel() {

        Address address = new Address();
        address.setBuildingNumber(this.buildingNumber);
        address.setAlley(this.alley);
        address.setVillageNo(this.villageNo);
        address.setStreetName(this.streetName);
        address.setCitySubDivisionID(this.citySubDivisionID);
        address.setCityID(this.cityID);
        address.setCountrySubDivisionID(this.countrySubDivisionID);
        address.setCountryID(this.countryID);
        address.setPostcode(this.postcode);

        assertEquals(buildingNumber, address.getBuildingNumber());
        assertEquals(alley, address.getAlley());
        assertEquals(villageNo, address.getVillageNo());
        assertEquals(streetName, address.getStreetName());
        assertEquals(citySubDivisionID, address.getCitySubDivisionID());
        assertEquals(cityID, address.getCityID());
        assertEquals(countrySubDivisionID, address.getCountrySubDivisionID());
        assertEquals(countryID, address.getCountryID());
        assertEquals(postcode, address.getPostcode());
    }
}
