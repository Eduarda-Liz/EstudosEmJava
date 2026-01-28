package aula07;
import java.util.*;

public class Luta {
    private Lutador desafiado; //o Desafiado vai ser uma instancia de Lutador
    private Lutador desafiante;// O desafiante é uma instancia de Lutador
    private int rounds;
    private boolean aprovada;

    //Metodos Especiais
    public void setDesafiado(Lutador dd) {
    desafiado = dd;
    }
    
    public Lutador getDesafiado(){
        return desafiado;
    }
    
    public void setDesafiante(Lutador ds) {
        desafiante = ds;
    }

    public Lutador getDesafiante(){
        return desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    //Metodos Publicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1!=l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
            }
    }

    public void lutar(){
        if (this.aprovada) {
            System.out.println("DESAFIADO: ");
            this.desafiado.apresentar();
            System.out.println("DESAFIANTE: ");
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            switch (vencedor){
                case 0: //Empate
                System.out.println("Empatou!");
                desafiado.empatarLuta();
                desafiante.empatarLuta();
                break;


                case 1: // ganhou o desafiado
                System.out.println("Ganhou: " + desafiado.getNome());
                desafiado.ganharLuta();
                desafiante.perderLuta();
                break;
                
                case 2: //ganhou o desafiante
                System.out.println("Ganhou: " + desafiante.getNome());
                desafiante.ganharLuta();
                desafiado.perderLuta();
                break;
            
            }
        
        } else {
            System.out.println("A luta não pode acontecer");
            }


    }

}
