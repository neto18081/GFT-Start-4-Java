public class ContaCorrente extends Conta {

    public ContaCorrente(Banco banco) {
        super(banco);
    }

    protected void transferir(double valor, Conta conta) {
        if (saldo >= valor) {
            setSaldo(saldo-=valor);
            double targetSaldo = conta.getSaldo();
            conta.setSaldo(targetSaldo += valor);
        } else {
            System.out.println("Saldo indisponível!");
        }
    }
}
