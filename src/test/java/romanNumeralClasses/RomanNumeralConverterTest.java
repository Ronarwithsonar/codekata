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

  @DataProvider(name = "stringProvider")
  public Object[][] string() {
    return new Object[][]{
        {"I", 1},
        {"V", 5},
        {"IX", 9},
        {"XXVI", 26},
        {"XLVIII", 48},
        {"CL", 150},
        {"MCMXCII", 1992},
        {"MMXVII", 2017}
    };
  }

  @Test(dataProvider = "intProvider")
  public void testRomanNumeralConverterFromArabicToRoman(int arabicNumber, String romanNumber)
      throws Exception {
    assertThat(romanNumeralConverter.convert(arabicNumber),
               is(equalTo(romanNumber)));
  }

  @Test(dataProvider = "stringProvider")
  public void testRomanNumeralConverterFromRomanToArabic(String romanNumber, int arabicNumber)
      throws Exception {
    assertThat(romanNumeralConverter.convert(romanNumber),
               is(equalTo(arabicNumber)));
  }
}