public class Caneta {
    public String cor;
    public String modelo;
    public double ponta;
    protected int carga; 
    private boolean tampada; //PRIVADO - SÓ QUEM MEXE É A PROPRIA CLASSE!!!

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("está tampada? " + this.tampada);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ponta: " + this.ponta);
    }
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Não posso rabiscar estou tampada");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    public void tampar() {
        this.tampada = true; //No "Private" só quem pode mexer é a própria classe, por isso é possível tampar e destampar
    } 

    public void destampar() {
        this.tampada = false;
    }
}
