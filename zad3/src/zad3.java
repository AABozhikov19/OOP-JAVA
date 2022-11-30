import java.util.Scanner;
public class zad3 {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n;
n=Integer.parseInt(sc.nextLine());
int[][] arr = new int[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j]=Integer.parseInt(sc.nextLine());
            }
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }
}
