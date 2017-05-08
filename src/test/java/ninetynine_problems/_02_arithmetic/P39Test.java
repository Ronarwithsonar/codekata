package ninetynine_problems._02_arithmetic;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class P39Test {

  @Test
  public void shouldSayPhiOf10Is4() throws Exception {
    long phi = P39.phi(10);
    assertThat(phi, equalTo(4L));
  }
}