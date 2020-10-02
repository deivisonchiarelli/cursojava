import java.util.Scanner;
public class Trapezio{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        Double basema, baseme, altura, area;
        System.out.println("Digite o valor da maior base do trapezio");
        basema = teclado.nextDouble();
        
        System.out.println("Agora digite o valor da menor base");
        baseme = teclado.nextDouble();
        
        System.out.println("Informe a altura");
        altura = teclado.nextDouble();

        area = (basema * baseme) * altura / 2.0;
        System.out.println("Area do trapezio:" +area);
    }
}