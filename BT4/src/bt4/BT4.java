/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4;

/**
 *
 * @author tqtr
 */
public class BT4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fraction a = new Fraction();
        Fraction b = new Fraction(3,4);
        
//        a.Input();
        a.parsePhanSo("12 4");
        a.Output();
        
        System.out.println("");
        
//        System.out.print("Sum: ");
//        a.Sum(b);
//        System.out.print("Multiply: ");
//        a.Multiply(b);
//        System.out.print("Subtraction: ");
//        a.Subtraction(b);
//        System.out.print("Division: ");
//        a.Division(b);
        a.Reduce();
        a.Output();
    }
    
}
