package ninetynine_problems._02_arithmetic;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class P31Test {

  @Test
  public void shouldSay7IsAPrimeNumber() throws Exception {
    boolean prime = P31.isPrime(7);
    assertTrue(prime);
  }

  @Test
  public void shouldSay10IsNotAPrimeNumber() throws Exception {
    boolean prime = P31.isPrime(10);
    assertFalse(prime);
  }

}