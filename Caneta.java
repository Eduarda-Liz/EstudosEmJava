public class Caneta {
    String cor;
    String modelo;
    double ponta;
    int carga; 
    boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("está tampada? " + this.tampada);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ponta: " + this.ponta);
    }
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Não posso rabiscar estou tampada");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    void tampar() {
        this.tampada = true; //THIS é o NOME do objeto que chamou, no nosso caso, C1.
    } //se quiser modificar um atributo dentro da propria classe, colocar o this na frenre

    void destampar() {
        this.tampada = false;
    }
}
