import java.util.Scanner;
public class zad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int a = 0;
        int b = 1;
        int c = 0;
        while (c < n)
        {
            c = a + b;
            a = b;
            b = c;
        }
        if(c == n)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        }
    }
