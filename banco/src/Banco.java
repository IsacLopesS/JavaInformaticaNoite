import java.util.ArrayList;
import java.util.List;

public class Banco {
    List<ContaCorrente> listaDeContasAtivas = new ArrayList<>();


    public void adicionarConta(ContaCorrente c){
        listaDeContasAtivas.add(c);
    }

    public double saldoTotal(){
        double saldoTotal=0;
        for (ContaCorrente conta : listaDeContasAtivas) {
            saldoTotal = saldoTotal + conta.saldo;
        }
        return saldoTotal;

    }

}
