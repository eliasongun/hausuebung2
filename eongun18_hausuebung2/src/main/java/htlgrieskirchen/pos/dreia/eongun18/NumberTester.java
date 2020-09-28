/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htlgrieskirchen.pos.dreia.eongun18;

/**
 *
 * @author eongu
 */
public class NumberTester {

    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;
    
    
    
    
    public NumberTester(String fileName)
    {
         
    }
    
    public void setOddEvenTester(NumberTest oddTester)
    {
      this.oddTester = oddTester;
    
    }
    
    public void setPrimeTester(NumberTest primeTester)
    {
      this.primeTester = primeTester;
    
    }
    
    public void setPalindromeTester(NumberTest palindromeTester)
    {
      this.palindromeTester = palindromeTester;
    
    
    }
    
    
    public void testFile()
    {
    
    
    }
    
     public interface NumberTest
    {
      boolean testNumber(int number);
    
    
    }
    
}
