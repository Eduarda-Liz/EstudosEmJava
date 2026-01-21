public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("Numero da Conta: " + this.getnumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono da Conta: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    //Metodo Construtor
    public ContaBanco(){ //METODO CONSTRUTOR
        this.setStatus(false);
        this.setSaldo(0);
    }
    //Getters e Setters
    public int getnumConta() {
        return this.numConta;
    }

    public void setnumConta(int nc) {
        this.numConta = nc;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d){
        this.dono = d;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double s) {
        //s = 0;
        this.saldo = s;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }

    //Metodos
    public void abrirConta(String t) {
        this.setStatus(true);
        this.setTipo(t);
            if (this.tipo.equalsIgnoreCase("cc")){
                this.setSaldo(50);
            } else {
                this.setSaldo(150);
            }
            System.out.println("Conta aberta com sucesso! Saldo: " + this.getSaldo());
    }

    public void fecharConta(){
        if (this.getSaldo()!=0) {
            System.out.println("ERROR: Conta com débitos e/ou saldo não pode ser encerrada");
        } else {
            this.setStatus(false);
        }
    }

    public void depositar(double d){
        if (this.getStatus()){
           this.setSaldo(getSaldo() + d);
           System.out.println("Sucesso");
        } else {
            System.out.println("ERROR: Conta precisa estar aberta para depositar");
        }
    }

    public void sacar(double s){
        if (this.saldo>=s && this.status==true) {
            this.setSaldo(getSaldo() - s);
            System.out.println("Sucesso");
        } else {
            System.out.println("ERROR");
        }
    }

    public void pagarMensal(double pm) {
        if (this.status==true) {

            if (this.tipo.equalsIgnoreCase("cc")) {
                pm = 12;
            } else {
                pm = 20;
            }

            if (this.getSaldo()>pm){
                this.setSaldo(this.getSaldo() - pm);
            System.out.println("Pagamento mensal realizado");
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("ERROR");
        }
    }

}

