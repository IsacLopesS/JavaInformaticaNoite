public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        Pizza p1 = new Pizza();
        p1.adicionaIngrediente("frango");
        p1.adicionaIngrediente("catupiry");
        p1.adicionaIngrediente("tomate");

        /*Pizza p2 = new Pizza();
        p2.adicionaIngrediente("frango");
        p2.adicionaIngrediente("catupiry");

        p2.qtdIngredientes();*/

        Pizza.printarHasmap();




    }
}
