public class Main {
    public static void main(String[] args) throws Exception {
        
        double h = 1.8;
        double peso = 80.5;
        String nome = "Joao da Silva";
        double imc;
        imc = peso/h*h;

        Pessoa p1 = new Pessoa("Joao", 80.0,1.8,25);
        System.out.println(p1.nome + " tem IMC = "+p1.IMC);
        p1.calculaIMC();
        System.out.println(p1.nome + " tem IMC = "+p1.IMC);
        //Pessoa p2 = new Pessoa("Arnaldo", 90.0,1.7,25);
        //Pessoa p3 = new Pessoa("Pato", 120,1.6,48);
        
        System.out.println(p1.nome + " tem IMC = "+p1.calculaIMC2());

        
        
        

    }
}
