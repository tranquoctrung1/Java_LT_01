/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author tqtr
 */
public class Fraction {
    
    // properties
    public int numerator;
    public int denominator;
    
    // setter
    public  void setFraction(int anotherNumerator, int anotherDenominator)
    {
        numerator = anotherNumerator;
        denominator  = anotherDenominator;
    }
    
    // getter
    public int getNumerator()
    {
        return numerator;
    }
    
    public int getDenominator()
    {
        return denominator;
    }
    
    //methods
    public  void Input()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ener numerator: ");
        numerator = scanner.nextInt();
        System.out.print("Ener denominator: ");
        scanner = new Scanner(System.in);
        denominator = scanner.nextInt();
    }
    
    
    public void Output()
    {
        System.out.print("Fraction is: " + numerator + "/" + denominator);
    }
    
    public Fraction Sum(Fraction b)
    {
        
        this.numerator = numerator * b.denominator + b.numerator * denominator;
        this.denominator = denominator * b.denominator;
        
        return this;
    }
    
    public Fraction Multiply(Fraction b)
    {
        numerator = numerator * b.numerator;
        denominator = denominator * b.denominator;
        
        return this;
    }
    
    public Fraction Subtraction(Fraction b)
    {
        numerator = numerator * b.denominator - b.numerator * denominator;
        denominator = denominator * b.denominator;
        
        return this;
    }
    
    public Fraction Division(Fraction b)
    {
        numerator = numerator * b.denominator;
        denominator = denominator * b.numerator;
        
        return this;
    }
    
    public int BiggestNumber()
    {
        int number = 1;
        int min = Math.abs(numerator);
        if(min < Math.abs(denominator))
            min = Math.abs(denominator);
        
        for(int i = 1; i <= min ;i++)
        {
            if(numerator % i == 0 && denominator % i == 0)
            {
                number = i;
            }
        }
        
        return number; 
    }
    
    public Fraction Reduce()
    {
        int temp = BiggestNumber();
        numerator = numerator / temp;
        denominator = denominator / temp;
        
        return this;
    }
    
    public Fraction parsePhanSo(String s)
    {
        String[] temp = s.split(" ");
        
        numerator = Integer.parseInt(temp[0]);
        denominator = Integer.parseInt(temp[1]);
        
        return this;
    }
    
    // constructor
    public Fraction()
    {
        numerator = 0;
        denominator = 0;
    }
    
    public Fraction(int anotherNumerator, int anotherDenominator)
    {
        numerator = anotherNumerator;
        denominator = anotherDenominator;
    }
    
}
