import java.util.Scanner;

/**
 * Created by bruno on 11/10/16.
 */
public class Ex2 {
    public static double retornarModulo(double num1, double num2){
        double resto = (num1%num2);
        return resto;
    }
    public static double retornarMaior(double num1, double num2){
        double maior = 0;
        if (num1 > num2) {
            maior = num1;
        }else{
            maior = num2;
        }
        return maior;
    }
    public static double arredondarDecimal(double num){
        double aux = Math.round(num);
        //double aux = ("%2f"+num);
        return aux;
    }
    public static int fatorial(int n){
        int f = 1;
        for (int i = n; i > 0; i--) {
            f*=i;
        }
        return f;
    }
    static Scanner s = new Scanner(System.in);
    public static void main(String[]args){
        int n = 5;
        int fat = somatorio(n);
        System.out.print(fat);
    }

    public static int somatorio(int valor){
        if (valor == 1) {
            return 1;
        }else{
            return valor*somatorio(valor-1);
        }
    }
}
