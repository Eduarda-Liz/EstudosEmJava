package aula11;
//HERANCA PRA DIFERENCA: ALUNO TEM TUDO O QUE PESSOA TEM E MAIS.
public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public void pagarMensalidade(){
        System.out.println("Mensalidade paga, aluno: " + this.nome);
    }


    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

}
