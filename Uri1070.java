import java.util.Scanner;
public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int X;
        X = teclado.nextInt();
        if (X % 2 ==0){
            X++;
        }           
        for (int C = 1; C <= 6; C++){
                           
                System.out.println(X);
                X=X+2;
            
        }
   }
}