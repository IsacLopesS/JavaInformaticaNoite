public class Carro {
    int potencia;
    int velocidade;
    String nome;

    public Carro(int p, String n){
        potencia = p;
        velocidade  =0;
        nome = n;
    }

    public void acelerar(){
        velocidade += potencia;

    }

    public void frear(){
        velocidade = velocidade/2;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public void imprimir(){
        System.out.println("O carro "+nome+"esta a "+velocidade+" km/h");
    }

}
