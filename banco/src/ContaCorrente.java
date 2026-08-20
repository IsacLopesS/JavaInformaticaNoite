public class ContaCorrente {
    //atributos
    int numeroConta;
    Double saldo;
    
    //construtor
    ContaCorrente(int numeroConta){
        this.numeroConta = numeroConta;
        saldo = 0.0;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public double sacar(double valor){
        if(valor<=saldo){
            saldo = saldo - valor;
            return valor;
        }
        System.out.println("saldo insuficiente!!");
        return 0;
    }

    public void verSaldo(){
        System.out.println("Saldo: "+saldo);

    }

    

    

}
