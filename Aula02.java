public class Aula02 {
    public static void main(String[] args) throws Exception {
    Caneta c1 = new Caneta();
    c1.modelo = "BIC Cristal";
    c1.cor = "azul";
    c1.ponta =  0.5;
    c1.carga = 80;
    //c1.tampada = true; PRIVADO

    c1.status();
    c1.destampar(); //PUBLICO

    }
}
