package romanNumeralClasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Tests for roman numeral converter
 */
public class RomanNumeralConverterTest {

  private RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();

  @DataProvider(name = "intProvider")
  public Object[][] integer() {
    return new Object[][]{
        {1, "I"},
        {5, "V"},
        {9, "IX"},
        {26, "XXVI"},
        {48, "XLVIII"},
        {150, "CL"},
        {1992, "MCMXCII"},
        {2017, "MMXVII"}
    };
  }

  @Test(dataProvider = "intProvider")
  public void testRomanNumeralConverterFromArabicToRoman(int arabicNumber, String romanNumber)
      throws Exception {
    assertThat(romanNumeralConverter.convert(arabicNumber),
               is(equalTo(romanNumber)));
  }

}