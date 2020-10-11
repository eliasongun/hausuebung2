/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htlgrieskirchen.pos.dreia.eongun18;

import htlgrieskirchen.pos.dreia.eongun18.CalculateOperation;

/**
 *
 * @author eongu
 */
public abstract class AbstractCalculator {

    protected CalculateOperation add;
    protected CalculateOperation substract;
    protected CalculateOperation multiply;
    protected CalculateOperation divide;

    public AbstractCalculator(CalculateOperation add, CalculateOperation substract, CalculateOperation multiply, CalculateOperation divide) {
        this.add = add;
        this.substract = substract;
        this.multiply = multiply;
        this.divide = divide;
    }
    
    
    
    
    
    
    
    
    public abstract Number add (Number a , Number b );
    public abstract Number substract (Number a , Number b );
    public abstract Number multiply (Number a , Number b );
    public abstract Number divide (Number a , Number b );
}
