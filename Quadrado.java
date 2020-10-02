import java.util.Scanner;
public class Quadrado{
    public static void main(String args[]){
        Scanner teclado;

        teclado = new Scanner(System.in);

        Float lado;
        System.out.println("Digite o valor de um dos lados do quadrado: ");
        lado = teclado.nextFloat();
        
        Float valor;
        valor = lado * lado;
        System.out.println("Area do quadrado e: " +valor);
    }
}

