package th.ac.kmitl.it.soa.group5.etaxinvoice.forms;

import lombok.experimental.Builder;

@Builder(builderClassName = "Builder")
public class AdditionProductNoteForm {

    public String productSubjectNote;
    public String productContentNote;

    public AdditionProductNoteForm() {

    }

    public AdditionProductNoteForm(String productSubjectNote, String productContentNote) {

        this.productSubjectNote = productSubjectNote;
        this.productContentNote = productContentNote;
    }
}
