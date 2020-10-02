import java.util.Scanner;
public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor;
        int numPares; 
        int numImpares, negativos, positivos;
        numPares=0; 
        numImpares=0;
        negativos=0;
        positivos=0;       
        for (int contador = 1; contador <= 5; contador++){
            valor = teclado.nextInt();
            if (valor % 2 == 0){
                numPares++;
            }
            else {
                numImpares++;
            }
            
            if (valor >= 1){
                positivos++;
            }
            else if (valor <0) {
                negativos++;
            }
        }
        System.out.println(numPares+" valores (es) par (es)");
        System.out.println(numImpares+" valores (es) impar (es)");
        System.out.println(positivos+" valores (es) positivo (s)");
        System.out.println(negativos+" valores (es) negativo (s)");
    }
    
}