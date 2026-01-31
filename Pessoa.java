package aula11;

public abstract class Pessoa { //CLASSE ABSTRATA NAO PODE SER INSTANCIADA DIRETAMENTE
    protected String nome; //ACESSO PROTEGIDO DA ACESSO A PROPRIA CLASSE  E A CLASSE IMEDIATAMENTE ANTERIOR, SUA SUBCLASSE
    protected int idade;
    protected String sexo; 

    public void fazerAniver(){
        this.idade++;
    }



    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
