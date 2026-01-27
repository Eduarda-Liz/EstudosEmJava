public class Caneta {
    private String modelo;
    private double ponta;
    private boolean tampada;
    private String cor;
 
    public Caneta(String m, String c, double p) { //METODO CONSTRUTOR == MESMO NOME DA CLASSE!!!
        this.modelo = m;  
        this.ponta = p;  
        this.tampar();
        this.cor = c;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }


    public double getPonta() {
        return this.ponta;
    }

    public void setPonta(double p) {
        this.ponta = p; 
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String c) {
        cor = c;
    }

    public boolean getTampada() {
        return this.tampada;
    }

    public void setTampada(boolean t){
        tampada = t;
    
    }

        
    public void status() {
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Está tampada? " + this.getTampada());
    }
}
