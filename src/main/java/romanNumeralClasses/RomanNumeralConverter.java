package romanNumeralClasses;

import java.util.HashMap;
import java.util.Map;

/**
 * Class to convert Arabic numbers to Roman Numerals and back
 */
public class RomanNumeralConverter {

  private Map<Integer, String> rmMap;

  public String convert(int arabicNumber){
    if (arabicNumber < 0) {
      throw new IllegalArgumentException("Roman numerals were never negative values");
    } else {
      //populating hashmap
      rmMap = new HashMap<Integer, String>();
      rmMap.put(1, "I");
      rmMap.put(2, "II");
      rmMap.put(3, "III");
      rmMap.put(4, "IV");
      rmMap.put(5, "V");
      rmMap.put(10, "X");
      rmMap.put(50, "L");
      rmMap.put(100, "C");
      rmMap.put(500, "D");
      rmMap.put(1000, "M");
      rmMap.put(5000, "V_");
      rmMap.put(10000, "X_");
      rmMap.put(50000, "L_");
      rmMap.put(100000, "C_");
      rmMap.put(500000, "D_");
      rmMap.put(1000000, "M_");

      //splitting number into seperate characters
      char[] numberCharArray = String.valueOf(arabicNumber).toCharArray();

      int base10Log = numberCharArray.length;

      return "";
    }
  }

  public int convert(String romanNumeral){
    return 0;
  }

}
