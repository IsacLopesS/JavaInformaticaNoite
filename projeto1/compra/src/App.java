public class App {
    public static void main(String[] args) throws Exception {
        
        Compra c1 = new Compra(200);

        Compra c2 = new Compra(20, 20);


        System.out.println("valor da compra: "+ c1.getValorTotal() + 
        "\nparcelas: "+c1.numeroParcelas);

        System.out.println("valor da compra: "+ c2.valorTotal + 
        "\nparcelas: "+c2.numeroParcelas);
    }
}
