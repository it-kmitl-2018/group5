package th.ac.kmitl.it.soa.group5.etaxinvoice.forms;

import lombok.experimental.Builder;
import org.joda.time.DateTime;

@Builder(builderClassName = "Builder")
public class ProductInformationForm {

    public String productId;
    public String productGlobalId;
    public String productName;
    public String productBatchId;
    public DateTime productExpiryDate;

    public ProductInformationForm() {
    }

    public ProductInformationForm(String productId, String productGlobalId, String productName,
                                  String productBatchId, DateTime productExpiryDate) {

        this.productId = productId;
        this.productGlobalId = productGlobalId;
        this.productName = productName;
        this.productBatchId = productBatchId;
        this.productExpiryDate = productExpiryDate;
    }
}
