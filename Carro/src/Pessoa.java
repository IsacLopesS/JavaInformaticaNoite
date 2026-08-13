public class Pessoa {
    //atributos: caracteristicas 
    String nome;
    double peso;
    double h;
    int idade;
    double IMC;

    public Pessoa(String n, double p, double h, int i){
        nome = n;
        peso = p;
        this.h = h;
        idade = i;
    }

    //metodo
    public void calculaIMC(){
        IMC = peso/(h*h);
    }

    public double calculaIMC2(){
        return peso/(h*h);
    }


    
}
