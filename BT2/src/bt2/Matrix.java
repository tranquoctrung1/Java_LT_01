/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

import java.util.Scanner;

/**
 *
 * @author tqtr
 */
public class Matrix {
    
    //properties
    static int[][] matrix;
    static int nRow;
    static int nCol;
    
    //getter
    public static int[][] getMatrix()
    {
        return matrix;
    }
    
    //setter
    public static void setMatrix(int[][] anotherMatrix)
    {
        matrix = anotherMatrix;
    }
    
    //methods
    public static void Input()
    {
        System.out.print("Enter amount of row:");
        Scanner scanner = new Scanner(System.in);
        nRow = scanner.nextInt();
        System.out.print("Enter amount of column:");
        scanner = new Scanner(System.in);
        nCol = scanner.nextInt();
        
        matrix = new int[nRow][nCol];
        
        for(int i = 0; i < nRow; i++)
        {
            for(int j = 0; j< nCol; j++)
            {
                System.out.print("Enter a["+i+"]"+"["+j+"]:");
                scanner = new Scanner(System.in);
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    
    public static void Output()
    {
        System.out.println("Matrix is:");
        
        for(int i = 0; i < nRow; i++)
        {
            for(int j = 0; j< nCol; j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    
    public static void sortUpByRow()
    {
        for(int i = 0; i < nRow; i++)
        {
            for(int j = 0; j< nCol - 1; j++)
            {
                for(int k = j + 1 ; k < nCol ; k++)
                {
                    if(matrix[i][j] > matrix[i][k])
                    {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i][k];
                        matrix[i][k] = temp;
                    }
                }
            }
        }
    }
    
    public static void sortDownByCol()
    {
        for(int j = 0 ; j < nCol; j++)
        {
            for(int i = 0; i < nRow - 1; i++)
            {
                for(int k = i + 1; k < nRow; k++)
                {
                    if(matrix[i][j] < matrix[k][j])
                    {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[k][j];
                        matrix[k][j] = temp;
                    }
                }
            }
        }
    }
    
    public static int Sum()
    {
        int s = 0;
        
        for(int i = 0; i < nRow; i++)
        {
            for(int j = 0; j< nCol; j++)
            {
                s += matrix[i][j];
            }
        }
        return s;
    }
    
    public static int Multiply()
    {
        int m = 1;
        
        for(int i = 0; i < nRow; i++)
        {
            for(int j = 0; j< nCol; j++)
            {
                m *= matrix[i][j];
            }
        }
        return m;
    }
    
    public static int Max()
    {
        int max = matrix[0][0];
        
        for(int i = 0; i < nRow; i++)
        {
            for(int j = 0; j < nCol ; j++)
            {
                if(matrix[i][j] > max )
                {
                    max = matrix[i][j];
                }
            }
        }
        
        return max;
    }
    
    public static int PositiveMin()
    {
        int min = matrix[0][0];
        
        for(int i = 0; i < nRow; i++)
        {
            for(int j = 0; j < nCol ; j++)
            {
                if(matrix[i][j] < min &&  matrix[i][j] > 0)
                {
                    min = matrix[i][j];
                }
            }
        }
        
        return min;
    }
    
    public static int NegativeMax()
    {
        int max = matrix[0][0];
        
        for(int i = 0; i < nRow; i++)
        {
            for(int j = 0; j < nCol ; j++)
            {
                if(matrix[i][j] > max  && matrix[i][j] < 0)
                {
                    max = matrix[i][j];
                }
            }
        }
        
        return max;
    }
    
    public static int findRowMaxSum()
    {
        int location = 0;
       
        int temp = 0;
        
        for(int j = 0; j < nCol ; j++)
        {
            temp += matrix[0][j];
        }
        
        for(int i = 1; i < nRow; i++)
        {
            int s = 0;
            for(int j = 0; j < nCol; j++)
            {
                s += matrix[i][j];
            }

            if(s > temp)
            {
                location = i;
                temp = s;
            }
        }
        return location + 1;
    }
    
    public static int findColMaxSum()
    {
        int location = 0;
        
        int temp = 0;
        
        for(int i = 0 ; i < nRow; i++)
        {
            temp += matrix[i][0];
        }
       
        for(int j = 1; j < nCol; j++)
        {
            int s = 0;
            for(int i = 0; i< nRow; i++)
            {
                s += matrix[i][j];
            }
            if(s > temp)
            {
                location = j;
                temp = s;
            }
        }
        return location + 1;
    }
    
    public static void insertHead(int[] arr)
    {
        int[][] temp = matrix;
        matrix = new int[++nRow][nCol];
        
        for(int i = 0; i < nRow; i++)
        {
            for(int j = 0; j < nCol ; j++)
            {
                if(i == 0)
                {
                    matrix[i][j] = arr[j]; 
                }
                else
                {
                    matrix[i][j] = temp[i -1][j];
                }
            }
        }
    }
    
    public static void insertTail(int[] arr)
    {
        int[][] temp = matrix;
        matrix = new int[++nRow][nCol];
        
        for(int i = 0; i < nRow; i++)
        {
            for(int j = 0; j < nCol ; j++)
            {
                if(i == nRow - 1)
                {
                    matrix[i][j] = arr[j]; 
                }
                else
                {
                    matrix[i][j] = temp[i][j];
                }
            }
        }
    }
    
    public static void insertWithKLocation(int[] arr , int location)
    {
        if(location > nRow)
        {
            System.out.print("Cannot insert!");
            return;
        }
        
        int[][] temp = matrix;
        matrix = new int[++nRow][nCol];
        
        for(int i = 0; i < nRow; i++)
        {
            for(int j = 0; j < nCol ; j++)
            {
                if(i == location)
                {
                    matrix[i][j] = arr[j];
                }
                else if(i > location )
                {
                    matrix[i][j] = temp[i - 1][j];
                }
                else 
                {
                    matrix[i][j] = temp[i][j];
                }
            }       
        }
    }
    
    public static void removeRowWithKLocation(int location)
    {
        if(location > nRow)
        {
            System.out.print("Cannot remove!");
            return;
        }
        
        for(int i = location -1 ; i < nRow -1; i++)
        {
            for(int j= 0; j < nCol; j++)
            {
                matrix[i][j] = matrix[i+ 1][j];
            }
        }
        --nRow;
    }
    
    public static void removeColWithKLocation(int location)
    {
        if(location > nCol)
        {
            System.out.print("Cannot remove!");
            return;
        }
         
        for(int j = location - 1 ; j < nCol -1; j++)
        {
            for(int i = 0; i < nRow ; i++)
            {
               matrix[i][j] = matrix[i][j+1];
            }
        }
        --nCol;
    }
    
    public static void parseMangHaiChieu()
    {
        String s;
        System.out.print("Enter s: ");
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        try{
            String[] temp = s.split(" ");
            nRow = temp.length;
            nCol = temp[0].length();

            matrix = new int[nRow][nCol];

            for(int i =0; i< nRow; i++)
            {
                for(int j = 0; j< nCol; j++)
                {
                    matrix[i][j] = Integer.parseInt(String.valueOf(temp[i].charAt(j)));
                }
            }
            
            Output();
        }
        catch(Exception e)
        {
            System.out.print("Cannot convert!");
        }
        
       
    }
    
    // constructor
    Matrix()
    {
        matrix = null;
        nRow = 0;
        nCol = 0;
    }
}
