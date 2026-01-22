package aula06;

public class ControleRemoto  implements Controlador {
    //ATRIBUTOS
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //METODOS ESPECIAIS: CONSTRUTOR
    public ControleRemoto(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }
    //METODOS ESPECIAIS: GETTER E SETTER
    private int getVolume(){
        return this.volume;
    }

    private void setVolume(int n) {
        this.volume = n;
    }

    private boolean getLigado(){
        return this.ligado;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }
    private boolean getTocando(){
        return this.tocando;
    }
    private void setTocando(boolean t) {
        this.tocando = t;
    }

   
    public void ligar() {
        this.setLigado(true);
    }
    
    public void desligar() {
        this.setLigado(false);
    }
    
    public void abrirMenu() {
        System.out.println("está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
            for (int i=0; i<this.getVolume(); i+=10){
                System.out.print("!");
            }
    }
    
    public void fecharMenu() {
       System.out.println("Fechando menu");
    }
   
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 1);
        }
    }
    
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 1);
        }
    }
    
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume()>0) {
            this.setVolume(0);
        }

    }
    
    public void desligarMudo() {
       if (this.getLigado() && this.getVolume()==0) {
            this.setVolume(50);
        }
    }
    
    public void play() {
        if (this.getTocando() && !this.getTocando()) {
            this.setTocando(true);
        }
    }
    public void pause() {
       if (this.getTocando() && this.getLigado()){
            this.setTocando(false);
       }
    }

   

}
