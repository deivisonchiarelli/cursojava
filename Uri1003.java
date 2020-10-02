import java.util.Scanner;
public class Uri1003{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int A, B, SOMA;

        //System.out.println("A");
        A = teclado.nextInt();
       
        //System.out.println("B");
        B = teclado.nextInt();
       
        SOMA = A+B;
        System.out.println("SOMA = "+SOMA);
    }
}