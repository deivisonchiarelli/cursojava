import java.util.Scanner;
public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor;
        int numPares; numImpares; 
        numPares=0; 
        numImpares=0;
             
        for (int contador = 1; contador <= 5; contador++){
            valor = teclado.nextInt();
            if (valor % 2 == 0){
                numPares++;
            }
              
        }
        System.out.println(numPares+" valores pares");
    
    }
    
}