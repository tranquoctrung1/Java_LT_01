/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt5;
import bt4.Fraction;
import java.util.Scanner;

/**
 *
 * @author tqtr
 */
public class FractionArray {
    
        //properties
        Fraction[] arr;
        int n;
        
        //getter
        public Fraction[] getFractionArray()
        {
            return arr;
        }
        
        //setter 
        public void setFractionArray(Fraction[] anotherFractionArray)
        {
            arr = anotherFractionArray;
        }
        
        //methods 
        public void Input()
        {
            System.out.print("Enter lenght of Fraction Array: ");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            
            arr = new Fraction[n];
            
            for(int i = 0; i < n ; i++)
            {
                arr[i] = new Fraction();
                System.out.println("Enter a["+i+"]");
                System.out.print("Numerator: ");
                scanner = new Scanner(System.in);
                arr[i].numerator = scanner.nextInt();
                System.out.print("Denominator: ");
                scanner = new Scanner(System.in);
                arr[i].denominator = scanner.nextInt();   
            }
        }
        
        public void Output()
        {
            System.out.print("Fraction Array: ");
            for(int i = 0; i < n ; i++)
            {
                System.out.print(arr[i].numerator +"/"+ arr[i].denominator +"\t");
            }
        }
        
        
        public Fraction Sum()
        {
           Fraction c = arr[0]; 
           
           for(int i = 1; i < n; i++)
           {
               c.Sum(arr[i]);
           }
           
           return c;
        }
        
        public Fraction Multiply()
        {
             Fraction c = arr[0];
            
            for(int i = 1; i < n; i++)
            {
                c.Multiply(arr[i]);
            }

           return c;
        }
        
        public Fraction Max()
        {
            Fraction max = arr[0];
            
            for(int i = 1;i < n ;i++)
            {
                double divisionMax = (max.numerator * 1.0) / (max.denominator *1.0);
                double divisionArrInI  = (arr[i].numerator * 1.0) / (arr[i].denominator *1.0);
                
                if(divisionMax < divisionArrInI)
                {
                    max = arr[i];
                }
            }
            
            return max;
        }
        
        public int LocationMax()
        {
            Fraction max = Max();
            
            int i =0 ;
            
            for(; i < n; i++)
            {
                if(arr[i] == max)
                {
                    break;
                }
            }
            
            return i + 1;
        }
        
        public void reduceFractionArray()
        {
            for(int i =0 ;i <n;i++)
            {
                arr[i].Reduce();
            }
        }
        
        public void sortUp()
        {
            for(int i = 0; i< n -1 ;i++)
            {
                for(int j = i +1 ; j< n ;j++)
                {
                    double division1 = (arr[i].numerator * 1.0) / (arr[i].denominator *1.0);
                    double division2  = (arr[j].numerator * 1.0) / (arr[j].denominator *1.0);  
                    if(division1 > division2)
                    {
                        Fraction temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        
        public void sortDown()
        {
            for(int i = 0; i< n -1 ;i++)
            {
                for(int j = i +1 ; j< n ;j++)
                {
                    double division1 = (arr[i].numerator * 1.0) / (arr[i].denominator *1.0);
                    double division2  = (arr[j].numerator * 1.0) / (arr[j].denominator *1.0);  
                    if(division1 < division2)
                    {
                        Fraction temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        
        public void updateFractionInKLocation(Fraction NewFraction ,int location)
        {
            if(location > n)
            {
                System.out.print("Cannot update!");
                return;
            }
            
            arr[location -1 ] = NewFraction;
        }
        
        public void insertFractionInAnyLocation(Fraction NewFraction, int location)
        {
            if(location > n)
            {
                System.out.print("Cannot update!");
                return;
            }
            
            Fraction[] temp = arr;
            arr = new Fraction[++n];
            
            for(int i = 0; i<n ;i++)
            {
                if(i < location)
                {
                    arr[i] = temp[i];
                }
                else if(i == location)
                {
                    arr[i] = NewFraction;
                }
                else
                {
                    arr[i] = temp[i-1];
                }
            }
        }
        
        
        
        //constructor
        FractionArray()
        {
            arr = null;
            n = 0;
        }
}
