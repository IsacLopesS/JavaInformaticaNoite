public class App {
    public static void main(String[] args) throws Exception {
        ContaCorrente contaDeBrenda = new ContaCorrente(588);
        ContaCorrente contaDeCinthia = new ContaCorrente(588);
        contaDeCinthia.depositar(150000);
        contaDeBrenda.depositar(10000);

        contaDeBrenda.verSaldo();

        contaDeBrenda.sacar(1000);

        contaDeBrenda.verSaldo();

        contaDeBrenda.sacar(11000);

        contaDeBrenda.verSaldo();

        Banco nubank = new Banco();

        nubank.adicionarConta(contaDeBrenda);
        nubank.adicionarConta(contaDeCinthia);

        double s = nubank.saldoTotal();

        System.out.println("Saldo total do nubank: "+ s);

    }
}
