package th.ac.kmitl.it.soa.group5.etaxinvoice.definitions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LanguageTypeCodeTest {

    @Test
    public void shouldGetCorrectCode(){
        assertEquals(LanguageTypeCode.THAI, LanguageTypeCode.parse("tha"));
        assertEquals(LanguageTypeCode.ENGLISH, LanguageTypeCode.parse("eng"));
        assertEquals(LanguageTypeCode.CHINESE, LanguageTypeCode.parse("chi"));
        assertEquals(LanguageTypeCode.JAPAN, LanguageTypeCode.parse("jpn"));
        assertEquals(LanguageTypeCode.SPAIN, LanguageTypeCode.parse("spa"));
        assertEquals(LanguageTypeCode.GERMAN, LanguageTypeCode.parse("ger"));
    }

    @Test
    public void shouldGetCorrectName(){
        assertEquals(LanguageTypeCode.THAI.getLanguageName(), "ภาษาไทย");
        assertEquals(LanguageTypeCode.ENGLISH.getLanguageName(), "ภาษาอังกฤษ");
        assertEquals(LanguageTypeCode.CHINESE.getLanguageName(), "ภาษาจีน");
        assertEquals(LanguageTypeCode.JAPAN.getLanguageName(), "ภาษาญี่ปุ่น");
        assertEquals(LanguageTypeCode.SPAIN.getLanguageName(), "ภาษาสเปน");
        assertEquals(LanguageTypeCode.GERMAN.getLanguageName(), "ภาษาเยอรมัน");
    }

    @Test
    public void shouldThrowException(){
        IllegalArgumentException e = assertThrows(
                IllegalArgumentException.class, () -> LanguageTypeCode.parse("XXX"));
    }
}