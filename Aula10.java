package aula10;

public class Aula10 {
    public static void main(String[] args) {
    Pessoa p1 = new Pessoa();
    Aluno p2 = new Aluno();
    Funcionario p4 = new Funcionario();
    Professor p3 = new Professor();

    p1.setNome("Pedro");
    p2.setNome("Maria");
    p3.setNome("Claudio");
    p4.setNome("Fabiana");

    p1.setSexo("masculino");
    p4.setSexo("Feminino");
    p2.setIdade(18);

    p2.setCurso("TI");
    p3.setSalario(2500.75);
    p4.setSetor("Estoque");

    System.out.println(p1.toString());
    System.out.println(p2.toString());
    System.out.println(p3.toString());
    System.out.println(p4.toString()); //Mesmo quem é aluno, professor ou funcionário, possui os atributos de PESSOA por conta da herança (extends)

    //p1.receberAum(550); MOSTRA UM ERRO: A classe principal não realiza metodos de uma subclasse, apenas o contrário
    }

}