import java.util.Scanner;
public class Uri1018a{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
               
        int valor, nota100, nota50, nota20, nota10, nota5, nota2, nota1, resto;
        
        valor = teclado.nextInt();

        
        nota100 = valor / 100;      
        resto = valor % 100;          

        nota50 = resto / 50;
        resto = resto % 50;

        nota20 = resto / 20;
        resto = resto % 20;

        nota10 = resto / 10;
        resto = resto % 10;

        nota5 = resto / 5;
        resto = resto % 5;

        nota2 = resto / 2;
        resto = resto % 2;

        nota1 = resto / 1;
        resto = resto % 1;


        System.out.println(nota100+" nota (s) de R$ 100,00");
        System.out.printf(nota50+" nota (s) de R$ 50,00");
        System.out.printf(nota20+" nota (s) de R$ 20,00");
        System.out.printf(nota10+" nota (s) de R$ 10,00");
        System.out.printf(nota1+" nota (s) de R$ 1,00");
        System.out.printf(nota5+" nota (s) de R$ 5,00");
        System.out.printf(nota2+" nota (s) de R$ 2,00");

    }
}