import java.util.Scanner;
public class Leitura{
    public static void main(String args[]){
        Scanner teclado;

        teclado = new Scanner(System.in);

        int valor1;
        valor1 = teclado.nextInt();

        System.out.println("Digitou o valor"+valor1);
    }
}