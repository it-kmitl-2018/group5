package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import lombok.experimental.Builder;

@Builder(builderClassName = "Builder")
public class ProductCountryOfOrigin {

    public String country;
    public int countryId;
}
