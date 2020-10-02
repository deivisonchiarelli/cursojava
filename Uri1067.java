import java.util.Scanner;
public class Uri1067
{
    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);
        
        int X;
        int P;
        P=1;
        X = teclado.nextInt();

        if (X % 2 == 0)
        {
            for (int C = 1; C <= X; C++){
                if (P % 2!= 0){
                System.out.println(P);
                }
                P=P+1;
                }    

        else
        {
            X=X+1;
        }  
        }
    }
}