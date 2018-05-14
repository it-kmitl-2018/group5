package th.ac.kmitl.it.soa.group5.etaxinvoice.models;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionProductNoteTests {

    private String productSubjectNote = "ข้อมูลสำหรับผู้แพ้อาหาร";
    private String productContentNote = "มีส่วมผสมของถั่วเหลือง, กุ้งและแป้งสาลี";

    @Test
    public void getValuesFromAdditionProductNoteModel() {

        AdditionProductNote.Builder builder = new AdditionProductNote.Builder();
        AdditionProductNote exdoc = builder
                .productSubjectNote(this.productSubjectNote)
                .productContentNote(this.productContentNote)
                .build();

        assertEquals(this.productSubjectNote, exdoc.productSubjectNote);
        assertEquals(this.productContentNote, exdoc.productContentNote);
    }
}
