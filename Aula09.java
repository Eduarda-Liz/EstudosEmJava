package aula09;

public class Aula09 {
    public static void main(String[] args) {
    Pessoa[] p = new Pessoa[2];
    Livro[] l = new Livro[3];

    p[0] = new Pessoa("Rodrigo", 27, "Masculino");
    p[1] = new Pessoa("Eduarda", 25, "Feminino");

    l[0] = new Livro("Aprendendo Java", "Guanabara", 15, p[0]);
    l[1] = new Livro("Outro Livreo", "Jose de Alencar", 25, p[1]);
    l[2] = new Livro("Livro3", "Autor 3", 500, p[0]);

    l[0].detalhes();
    l[0].abrir();
    l[0].folhear(14);
    l[0].detalhes();

    }
}
