package th.ac.kmitl.it.soa.group5.etaxinvoice.forms;

import lombok.experimental.Builder;

import java.sql.Timestamp;

@Builder(builderClassName = "Builder")
public class ETaxInvoiceHeaderForm {

    public String subject;
    public String content;
    public String id;
    public String name;
    public String typeCode;
    public Timestamp issueDateTime;
    public Timestamp createDateTime;

    public ETaxInvoiceHeaderForm() {
    }

    public ETaxInvoiceHeaderForm(String subject, String content, String id, String name, String typeCode, Timestamp issueDateTime, Timestamp createDateTime) {
        this.subject = subject;
        this.content = content;
        this.id = id;
        this.name = name;
        this.typeCode = typeCode;
        this.issueDateTime = issueDateTime;
        this.createDateTime = createDateTime;
    }
}
