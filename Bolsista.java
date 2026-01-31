package aula11;

public class Bolsista extends Aluno{
    private double bolsa;

    public void renovarBolsa()    {
        System.out.println("bolsa renovada");
    }

    @Override //SIGNIFICA SOBREPOSICAO DE METODOS
    public void pagarMensalidade(){
            System.out.println("Aluno bolsista");
    }

    


    public double getBolsa() {
        return bolsa;
    }
    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

}
