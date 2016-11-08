/**
 * Created by bruno on 25/10/16.
 */
public class Conta {
    public static int numConta;
    public String nome;
    public double saldo;
    public double limite;

    public Conta(){
            limite = 1000.0;
            numConta = 0;
    }
    //metodo Sacar: O metodo abaixo quando invocado ele irá
    //verificar se você tem em saldo o valor que deseja ser retirado.
    public void sacar(double valor){
        if (saldo < valor) {
            System.out.println("Valor maior que seu saldo.");
        }else {
            this.saldo = this.saldo - valor;
        }
    }
    //metodo Depositar: O metodo abaixo realiza o deposito na sua conta quando invocado.
    public void depositar(double valorDeposito){
        this.saldo += valorDeposito;
    }
    //metodo gerar codigo: ele vai gerar um numero de conta para o usuário.
    public static int gerarNumConta(int numero){
            numero = 1;
            return numConta+=numero;
    }
}
