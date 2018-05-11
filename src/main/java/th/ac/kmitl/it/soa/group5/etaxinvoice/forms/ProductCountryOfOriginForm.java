package th.ac.kmitl.it.soa.group5.etaxinvoice.forms;

import lombok.experimental.Builder;

@Builder(builderClassName = "Builder")
public class ProductCountryOfOriginForm {

    public String country;
    public int countryId;

    public ProductCountryOfOriginForm() {
    }

    public ProductCountryOfOriginForm(String country, int countryId) {

        this.country = country;
        this.countryId = countryId;
    }
}
