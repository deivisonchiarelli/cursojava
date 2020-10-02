import java.util.Scanner;
public class Uri1001{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int A, B, X;

        //System.out.println("A");
        A = teclado.nextInt();
       
        //System.out.println("B");
        B = teclado.nextInt();
       
        X = A+B;
        System.out.println("X = "+X);
    }
}