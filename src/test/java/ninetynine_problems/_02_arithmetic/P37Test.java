package ninetynine_problems._02_arithmetic;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class P37Test {

  @Test
  public void gcdOf36And63Is9() throws Exception {
    int gcd = P37.gcd(36, 63);
    assertThat(gcd, equalTo(9));
  }
}