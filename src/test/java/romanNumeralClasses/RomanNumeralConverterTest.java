package romanNumeralClasses;

import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Ronan on 30/04/2017.
 */
@Test
public class RomanNumeralConverterTest {

  RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();

  public void testRomanNumeralConverterFromArabicToRoman() throws Exception {
    assertThat(romanNumeralConverter.convert(1),
               is(equalTo("I")));
  }

}