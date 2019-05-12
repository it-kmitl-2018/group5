package th.ac.kmitl.it.soa.group5.etaxinvoice.forms;

import lombok.experimental.Builder;

@Builder(builderClassName = "Builder")
public class AssociatedDocumentLineDocumentForm {

    public String lineID;

    public AssociatedDocumentLineDocumentForm(){
    }

    public AssociatedDocumentLineDocumentForm(String lineID) {
        this.lineID = lineID;
    }
}
