package aula11;

public class Aula11 {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); NAO FUNCIONA, ABSTRACT
    Visitante v1 = new Visitante();
    Aluno a1  = new Aluno();
    Bolsista b1 = new Bolsista();

    v1.setNome("Juvenal");
    a1.setCurso("TI");
    a1.setIdade(20);
    a1.setNome("Duda");
    a1.setMatricula(212718);
    a1.pagarMensalidade();
    b1.setBolsa(12.5);
    b1.pagarMensalidade(); //O BOLSISTA POSSUI O METODO DIFERENTE, ENTAO O RESULTADO DO METODO É SOBREPOSTO PARA UM RESULTADO DIFERENTE PARA ESTA CLASSE APENAS
    }
}
//O METODO FINAL NAO PODE SER SOBREPOSTO.
//CLASSE FINAL NAO PODE TER FILHOS TAMBEM. USAR ESSE FINAL PARA EVITAR FILHOS E SOBREPOSICAO
