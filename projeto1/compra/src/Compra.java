public class Compra {
    int valorTotal;
    int numeroParcelas;

    // a vista
    Compra(int valor){
         
        valorTotal = valor;
        numeroParcelas = 1;
    }
    Compra(int valorParcela, int qtdParcelas){
        numeroParcelas =qtdParcelas;
        valorTotal = valorParcela*numeroParcelas;

    }
    
    //getters gerados automaticamente
    public int getValorTotal() {
        return valorTotal;
    }
    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public int getValorParcela(){
        return valorTotal/numeroParcelas;
    }

    




}
