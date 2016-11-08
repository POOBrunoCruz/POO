import java.util.Scanner;

/**
 * Created by bruno on 26/10/16.
 */
public class MainConta {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String []args){
        Conta acc = new Conta();
        double depositar = 0;
        System.out.println("informe o valor do deposito");
        depositar = teclado.nextDouble();
        acc.nome = "Bruno";
        acc.saldo = 0;
        acc.depositar(depositar);
        System.out.println("Seu numero de cont :"+  acc.gerarNumConta(0));
        System.out.println("Seu numero de cont :"+  acc.gerarNumConta(1));
        System.out.println("Seu numero de cont :"+  acc.gerarNumConta(2));
        System.out.println("Seu Saldo: "+acc.saldo);



    }
}
