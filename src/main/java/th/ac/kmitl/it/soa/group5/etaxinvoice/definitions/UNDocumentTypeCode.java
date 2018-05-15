package th.ac.kmitl.it.soa.group5.etaxinvoice.definitions;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public enum UNDocumentTypeCode {

    METERED_SERVICES_INVOICE ("82", "Metered services invoice"),
    CREDIT_NOTE_FINANCIAL ("83", "Credit note releted to financial adjustments"),
    DEBIT_NOTE_FINANCIAL ("84", "Debit note releted to financial adjustments"),
    SELF_BILLED_CREDIT_NOTE ("261", "Self billed credit note"),
    CONSOLIDATED_CREDIT_NOTE ("262", "Consolidated credit note - goods and services"),
    PROFORMA_INVOICE ("325", "Proforma invoice"),
    COMMERCIAL_INVOICE ("380", "Commercial invoice"),
    CREDIT_NOTE ("381", "Credit note"),
    DEBIT_NOTE ("383", "Debit note"),
    CORRECTED_INVOICE ("384", "Corrected invoice"),
    CONSOLIDATED_INVOICE ("385", "Consolidated invoice"),
    PREPAYMENT_INVOICE ("386", "Prepayment invoice"),
    SELF_BILLED_INVOICE ("389", "Self-billed invoice"),
    CONSIGNMENT_INVOICE ("395", "Consignment invoice"),
    FACTORED_CREDIT_NOTE("396", "Factored credit note");

    private @Getter String unDocumentCode;
    private @Getter String unDocumentName;

    UNDocumentTypeCode(String unDocumentCode, String unDocumentName) {
        this.unDocumentCode = unDocumentCode;
        this.unDocumentName = unDocumentName;
    }

    public static Map<String, UNDocumentTypeCode> mapper = new HashMap<>();
    static {
        for (UNDocumentTypeCode unDocumentTypeCode : UNDocumentTypeCode.values()) {
            mapper.put(unDocumentTypeCode.getUnDocumentCode(), unDocumentTypeCode);
        }
    }

    public static UNDocumentTypeCode parse(String unDocumentCode) {
        UNDocumentTypeCode taxPayerIdTypeCode = mapper.get(unDocumentCode);

        if (taxPayerIdTypeCode == null) {
            throw new IllegalArgumentException("There is no value with name " + unDocumentCode);
        }

        return mapper.get(unDocumentCode);
    }
}
