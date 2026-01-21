public class Aula05 {
    public static void main(String[] args) {
    ContaBanco p1 = new ContaBanco();
    p1.setnumConta(12345);
    p1.setDono("Jubileu");
    p1.abrirConta("cc");
    
    
    ContaBanco p2 = new ContaBanco();
    p2.setnumConta(654987);
    p2.abrirConta("cp");
    p2.setDono("Creuza");
    
    p1.estadoAtual();
    p2.estadoAtual();

    }
}
