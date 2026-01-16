public class Aula02 {
    public static void main(String[] args) throws Exception {
    Caneta c1 = new Caneta();
    c1.cor = "azul";
    c1.ponta = 0.5;
    c1.tampada = false;

    c1.destampar();
    c1.rabiscar();
    c1.status(); //com parentesis é metodo

    Caneta c2 = new Caneta();
    c2.modelo = "bic";
    c2.cor = "Preta";
    c2.destampar();
    c2.rabiscar();

    }
}
