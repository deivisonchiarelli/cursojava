import java.util.Scanner;
public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double SALARIO, REAJUSTE, NOVOSALARIO;
        SALARIO = teclado.nextDouble();
        
        if (SALARIO <= 400) {
            REAJUSTE = SALARIO * 0.15;
            NOVOSALARIO = REAJUSTE + SALARIO;
            System.out.printf("Novo salario: %.2f\n", SALARIO);
            System.out.printf("Reajuste ganho: %.2f\n", REAJUSTE);
            System.out.println("Em percentual: 15 %");
        }
        else if (SALARIO > 400 && SALARIO <= 800) {
            REAJUSTE = SALARIO * 0.12;
            NOVOSALARIO = REAJUSTE + SALARIO;
            System.out.printf("Novo salario: %.2f\n", SALARIO);
            System.out.printf("Reajuste ganho: %.2f\n", REAJUSTE);
            System.out.println("Em percentual: 12 %");
        }
        else if (SALARIO > 800 && SALARIO <= 1200) {
            REAJUSTE = SALARIO * 0.10;
            NOVOSALARIO = REAJUSTE + SALARIO;
            System.out.printf("Novo salario: %.2f\n", SALARIO);
            System.out.printf("Reajuste ganho: %.2f\n", REAJUSTE);
            System.out.println("Em percentual: 15 %");
        }
        else if (SALARIO > 1200 && SALARIO <= 2000) {
            REAJUSTE = SALARIO * 0.7;
            NOVOSALARIO = REAJUSTE + SALARIO;
            System.out.printf("Novo salario: %.2f\n", SALARIO);
            System.out.printf("Reajuste ganho: %.2f\n", REAJUSTE);
            System.out.println("Em percentual: 7 %");
        }
        else if (SALARIO > 2000) {
            REAJUSTE = SALARIO * 0.4;
            NOVOSALARIO = REAJUSTE + SALARIO;
            System.out.printf("Novo salario: %.2f\n", SALARIO);
            System.out.printf("Reajuste ganho: %.2f\n", REAJUSTE);
            System.out.println("Em percentual: 4 %");
        }

    }
}