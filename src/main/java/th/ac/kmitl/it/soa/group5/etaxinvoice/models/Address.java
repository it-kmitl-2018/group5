package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

public class Address {
    private String buildingNumber;
    private String alley;
    private String villageNo;
    private String streetName;
    private String citySubDivisionID;
    private String cityID;
    private String countrySubDivisionID;
    private String countryID;
    private String postcodeCode;

    public Address() {
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getAlley() {
        return alley;
    }

    public void setAlley(String alley) {
        this.alley = alley;
    }

    public String getVillageNo() {
        return villageNo;
    }

    public void setVillageNo(String villageNo) {
        this.villageNo = villageNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCitySubDivisionID() {
        return citySubDivisionID;
    }

    public void setCitySubDivisionID(String citySubDivisionID) {
        this.citySubDivisionID = citySubDivisionID;
    }

    public String getCityID() {
        return cityID;
    }

    public void setCityID(String cityName) {
        this.cityID = cityName;
    }

    public String getCountrySubDivisionID() {
        return countrySubDivisionID;
    }

    public void setCountrySubDivisionID(String countrySubDivisionID) {
        this.countrySubDivisionID = countrySubDivisionID;
    }

    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    public String getPostcodeCode() {
        return postcodeCode;
    }

    public void setPostcodeCode(String postcodeCode) {
        this.postcodeCode = postcodeCode;
    }
}
