package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {

        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void doubleBracketFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void oneBracketFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void noBracketsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void sameNumberOfBracketsButNotSquaredFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]][["));
    }

    @Test
    public void nestedBracketsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void integersTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("1"));
    }

    @Test
    public void curlyBracketsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("{}"));
    }


}
