import java.util.Scanner;
public class Uri1037{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double I;
        I = teclado.nextDouble();

        if ((I >= 0) && (I <= 25)) {
            System.out.println ("Intervalo [0,25]");
        }
        else if ((I > 25) && (I <= 50)) {
            System.out.println ("Intervalo (25,50]");
        }
        else if ((I > 50) && (I <= 75)) {
            System.out.println ("Intervalo (50,75]");
        }
        else if ((I > 50) && (I <= 100)) {
            System.out.println ("Intervalo (75,100]");
        }
        else {
            System.out.println ("Fora de Intervalo");
        }
    }
}