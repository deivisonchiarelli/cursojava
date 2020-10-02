import java.util.Scanner;
public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
               
        int tempos, h, m, s, resto;
        
        tempos = teclado.nextInt();

        
        h = tempos / 3600;        //transformando a entrada do usuario que foi feita em segundos para horas
        resto = tempos % 3600;   //resto da divisao, os segundos que sobraram
        m = resto / 60;           // segundos para minutos
        s = resto % 60;           //resto da divisao, os segundos que sobraram


        System.out.println(h+":"+m+":"+s);
    }
}