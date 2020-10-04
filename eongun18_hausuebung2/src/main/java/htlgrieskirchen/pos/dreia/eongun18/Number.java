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
public class Number {
  
    private double b;
    private double a;
  
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    public interface CalculationOperation
    {
      Number cale (Number x, Number y);
      
      
    
    }
}
