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
public class RationalCalculator extends AbstractCalculator {

    public RationalCalculator(CalculateOperation add, CalculateOperation substract, CalculateOperation multiply, CalculateOperation divide) {
        super(add, substract, multiply, divide);
    }

    @Override
    public Number add(Number a, Number b) {
        return this.add.cale(a, b);
    }

    @Override
    public Number substract(Number a, Number b) {
       return this.substract.cale(a, b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        return this.multiply.cale(a, b);
    }

    @Override
    public Number divide(Number a, Number b) {
      return this.divide.cale(a, b);
    }

}
