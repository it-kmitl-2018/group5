package th.ac.kmitl.it.soa.group5.etaxinvoice.forms;

import lombok.experimental.Builder;
import org.joda.time.DateTime;

@Builder(builderClassName = "Builder")
public class ProductInformationForm {

    public String productID;
    public String productGlobalID;
    public String productName;
    public String productBatchId;
    public DateTime productExpiryDate;

    public ProductInformationForm() {
    }

    public ProductInformationForm(String productID, String productGlobalID, String productName,
                                  String productBatchId, DateTime productExpiryDate) {

        this.productID = productID;
        this.productGlobalID = productGlobalID;
        this.productName = productName;
        this.productBatchId = productBatchId;
        this.productExpiryDate = productExpiryDate;
    }
}
