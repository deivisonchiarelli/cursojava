import java.util.Scanner;
public class Triangulo{
    public static void main(String args[]){
        Scanner teclado;

        teclado = new Scanner(System.in);

        int base;
        System.out.println("Digite o valor da base do triangulo");
        base = teclado.nextInt();
       
        int altura;
        System.out.println("Agora digite a altura");
        altura = teclado.nextInt();
       
        int area;
        area = (base * altura)/2;
        System.out.println("A area do triangulo: " +area);
    }
}