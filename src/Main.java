public class Main {
    public static void main(String args[]) {
        Banco[] banco = new Banco[] {
                new Banco("Bradesco"),
                new Banco("Itau"),
        };

        ContaCorrente[] cc = new ContaCorrente[]{
                new ContaCorrente(banco[0]),
                new ContaCorrente(banco[1]),
                new ContaCorrente(banco[0]),
                new ContaCorrente(banco[1]),
        };

        // POUPANÇA
        ContaPoupanca cp = new ContaPoupanca(banco[0]);
        cp.depositar(400);
        System.out.println(cp.getInfo());

        System.out.println();

        // CONTA CORRENTE
        for (Conta c : cc) {
            c.depositar(100);
        }
        cc[0].transferir(50, cc[3]);
        cc[1].transferir(50, cc[3]);
        cc[2].transferir(50, cc[3]);

        for (Conta c : cc) {
            System.out.println(c.getInfo());
        }
    }
}
