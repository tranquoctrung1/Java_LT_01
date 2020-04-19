/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt5;
import bt4.Fraction;
/**
 *
 * @author tqtr
 */
public class BT5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       FractionArray a = new FractionArray();
       a.Input();
//       a.reduceFractionArray();
//       a.sortUp();
//       a.sortDown();
       a.Output();
       Fraction b = new Fraction(3,4);
//       a.updateFractionInKLocation(b, 2);
       a.insertFractionInAnyLocation(b, 2);
       a.Output();
       
       System.out.println("");
//       Fraction c =  a.Sum();
//       System.out.print("Sum: "+ c.numerator +"/"+c.denominator);
//       Fraction c = a.Multiply();
//       System.out.print("Multiply: "+ c.numerator +"/"+c.denominator);
//       Fraction c = a.Max();
//       System.out.print("Max: "+ c.numerator +"/"+c.denominator+"and location: "+ a.LocationMax());
        
        
    }
    
}
