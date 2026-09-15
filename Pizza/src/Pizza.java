import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pizza {
    private List<String> ingredientes = new ArrayList<>();
    private static Map<String, Integer> ingredientesPizzaria = new HashMap<>();


    public void adicionaIngrediente(String ingrediente){
        ingredientes.add(ingrediente);
        contabilizaIngrediente(ingrediente);
    }

    public void qtdIngredientes(){
               
        int qtd = ingredientes.size();
        System.out.println("quantidade de ingredientes: "+qtd);
    }

    public static void contabilizaIngrediente(String ingrediente){
        ingredientesPizzaria.put(ingrediente, 1);

    }

    public static void printarHasmap(){
        System.out.println(ingredientesPizzaria);
    }



}
