package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import lombok.experimental.Builder;
import org.joda.time.DateTime;

@Builder(builderClassName = "Builder")
public class ProductInformation {

    public String productID;
    public String productGlobalID;
    public String productName;
    public String productBatchId;
    public DateTime productExpiryDate;
}
