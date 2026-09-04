
// programação estruturada
public class App {
    public static double media(Aluno a){

            double m;
            m = (a.bimestre1 + a.bimestre2 + a.bimestre3 + a.bimestre4)/4;
            
            return m;
    }
    
    public static void main(String[] args) throws Exception {
        Aluno a = new Aluno(25, 15, 10, 5);

        double mediaALunoA = media(a);

        System.out.println("Media do aluno a: "+ mediaALunoA);
        
    }
}
