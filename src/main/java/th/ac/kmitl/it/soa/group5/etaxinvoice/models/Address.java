package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import lombok.experimental.Builder;

@Builder(builderClassName = "Builder")
public class Address {

    public String buildingNumber;
    public String alley;
    public String villageNo;
    public String streetName;
    public String district;
    public String area;
    public String province;
    public String country;
    public String postcode;
}
