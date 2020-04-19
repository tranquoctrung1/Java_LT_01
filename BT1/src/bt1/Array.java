/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.Scanner;

/**
 *
 * @author tqtr
 */
public class Array {
    
    //properties
    static int[] arr;
    static int n;
    
    
    //setter
    public static void setArray(int[] anotherArr)
    {
        arr = anotherArr;
    }
    
    //geter
    public static int[] getArray()
    {
        return arr;
    }
    
    
    //methods
    public static void Input()
    {
        System.out.print("Enter length of Array: ");
        Scanner scanner = new Scanner(System.in);
        n =  scanner.nextInt();
        arr = new int[n];
        
        for(int i = 0; i< n; i++)
        {
            System.out.print("Enter a["+i+"]: ");
            arr[i] = scanner.nextInt();
        }
    }
    
    public static void Output()
    {
        System.out.print("Array is: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]);
        }
    }
    
    public static void sortUp()
    {
        for(int i = 0; i< n -1; i++)
        {
            for(int j= i + 1; j< n; j++ )
            {
                if(arr[j] < arr[i])
                { 
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;      
                }
            }
        }
    }
    
    public static void sortDown()
    {
        for(int i = 0; i< n -1; i++)
        {
            for(int j= i + 1; j< n; j++ )
            {
                if(arr[j] > arr[i])
                { 
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;      
                }
            }
        }
    }
    
    public static int Sum()
    {
        int s = 0;
        
        for(int i = 0; i< n; i++)
        {
            s += arr[i];
        }
        return s;
    }
    
    public static int Multiply()
    {
        int m = 1;
        for(int i = 0; i< n; i++)
        {
            m *= arr[i];
        }
        return m;
    }
    
    public static int Max()
    {
        int max = arr[0];
        
        for(int i = 1; i< n; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        
        return max;
    }
    
    
    public static int Min()
    {
        int min = arr[0];
        
        for(int i = 1; i< n; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        
        return min;
    }
    
    public static int NavigateMax()
    {
        int max = arr[0];
        
        for(int i = 1; i< n; i++)
        {
            if(arr[i] > max && arr[i] < 0)
            {
                max = arr[i];
            }
        }
        
        return max;
    }
    
    
    public static void insertHead(int NewElement)
    {
        int[] temp = arr;
        arr = new int[++n];
        
        arr[0] = NewElement;
        
        for(int i = 1 ; i < n; i++)
        {
            arr[i] = temp[i -1];
        }
    }
    
    public static void insertTail(int NewElement)
    {
        int[] temp = arr;
        arr = new int[++n];
        
        arr[arr.length - 1] = NewElement;
        for(int i = 0 ; i < n -1; i++)
        {
            arr[i] = temp[i];
        }
        
    }
    
    public static void insertWithKLocation(int NewElement, int location)
    {
        if(location > n)
        {
            System.out.println("Cannot insert!");
            return;
        }
        int[] temp = arr;
        arr = new int[++n];
        
        for(int i = 0; i < n ;i++ )
        {
            if(i == location - 1)
            {
                arr[i] = NewElement;
            }
            else if(i < location - 1)
            {
                arr[i] = temp[i];
            }
            else 
            {
                arr[i] = temp[i - 1];
            }
        }
        

    }
    
    public static void removeWithKLocation(int location)
    {
        if(location > n)
        {
            System.out.println("Cannot remove!");
            return;
        }
        for(int i = location - 1; i < n -1 ;i++)
        {
            arr[i] = arr[i + 1];
        }
        --n;
    }
    
    public static void removeWithXValue(int value)
    {
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == value)
            {
                removeWithKLocation(i + 1);
                --i;
            }
        }
    }
    
    public static void  updateWithKLocation(int value, int location)
    {
        if(location > n)
        {
            System.out.println("Cannot update!");
            return;
        }
        arr[location - 1] = value;
    }
    
    public static void updateAtoB(int oldValue , int newValue)
    {
        for(int i= 0 ; i < n;i++)
        {
            if(arr[i] == oldValue)
            {
                arr[i] = newValue;
            }
        }
    }
    
    public static void parseMangSoNguyen()
    {
        String s;
    
        System.out.print("Enter string s: ");
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        
        try
        {
            n = s.length();
            arr = new int[n];
            
            for(int i = 0; i < s.length(); i++)
            {
                arr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
            }
            
            Output();
        }
        catch(Exception e)
        {
            System.out.print("Error: cannot convert! ");
        }
    }
    
    public static void parseMangSoNguyen(String s)
    {
        try
        {
            n = s.length();
            arr = new int[n];
            
            for(int i = 0; i < s.length(); i++)
            {
                arr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
            }
            Output();
        }
        catch(Exception e)
        {
            System.out.print("Error: cannot convert! ");
        }
    }
    
    // constructor
    Array()
    {
        this.arr = null;
        this.n = 0;
    }
    
    
    
}
