import java.util.Scanner;
class TwoDimentionalArray 
{
    public static void main(String[] args) 
        {
            int i,j,k,l;
            int a [][] = new int [5][];
            Scanner sc = new Scanner (System.in);
            for (i=0; i<5; i++)

            {
                a[i] = new int[i+1];
                for (j=0; j<=i; j++)
                {
                    System.out.println ("Enter the number");
                    a[i][j] = sc.nextInt();
        
                } 
            }
            for (k=0; k<a.length; k++)
            {
                for (l=0; l<a[k].length; l++)
                {
                    System.out.print(a[k][l]+" ");
                }
                System.out.println();
            }
        }
    }
    

