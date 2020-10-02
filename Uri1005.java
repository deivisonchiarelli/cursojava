import java.util.Scanner;
public class Uri1005{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double A, B, MEDIA;

        //System.out.println("A");
        A = teclado.nextDouble();
       
        //System.out.println("B");
        B = teclado.nextDouble();
       
        MEDIA = (A*3.5+B*7.5)/11;
        System.out.printf("MEDIA = %.5f\n", MEDIA);
    }
}