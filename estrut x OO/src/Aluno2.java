//programação OO
public class Aluno2 {
    public int bimestre1;
    public int bimestre2;
    public int bimestre3;
    public int bimestre4;


    public Aluno2(int bimestre1, int bimestre2, int bimestre3, int bimestre4) {
        this.bimestre1 = bimestre1;
        this.bimestre2 = bimestre2;
        this.bimestre3 = bimestre3;
        this.bimestre4 = bimestre4;
    }

    public double calcularMedia(){

        return (bimestre1 + bimestre2 + bimestre3 + bimestre4)/4;

    }

    



}
