public class Conta {
    private static int AGENCIA = 0;
    private static int NUMERO = 0;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Banco banco;

    public Conta(Banco banco) {
        this.agencia = AGENCIA == 3 ? AGENCIA=0 : ++AGENCIA;
        this.numero = NUMERO++;
        this.banco = banco;
    }

    protected void sacar(double valor) {
        if (saldo >= valor) {
            setSaldo(saldo - valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    protected void depositar(double valor) {
        setSaldo(saldo += valor);
    }


    public String getInfo() {
        String info = getBanco() + " -> Número: " + getNumero() + ", Agência: " + getAgencia() + ", Saldo: R$ " + getSaldo();
        return info;
    }

    public String getBanco() {
        return banco.nome;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
