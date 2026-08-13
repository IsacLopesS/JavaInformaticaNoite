public class Carro {

    //atrubutos
    int potencia;
    int velocidade;
    String nome;

    //construtor
    Carro(int potencia, String nome){
        this.potencia = potencia;
        velocidade = 0;
        this.nome = nome;
    }
    Carro(String n){
        velocidade = 0;
        nome = n;
    }


    //métodos

    void acelerar(){
        velocidade = velocidade + potencia;
    }
    void freiar(){
        velocidade = velocidade / 2;

    }

    int getVelocidade(){
        return velocidade;
    }

    void imprimir(){
        System.out.println("O carro "+nome+" esta na velocidade de "+ velocidade+" Km/h");
    }


}
