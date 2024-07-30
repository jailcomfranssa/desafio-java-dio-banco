public class Main {
    public static void main(String[] args) {
        System.out.println("########");
        Cliente c1 = new Cliente();
        c1.setNome("Jailson");
        Conta cc = new ContaCorrente(c1);
        Conta pp = new ContaPoupanca(c1);
        cc.depositar(100);

        cc.imprimir();

        pp.imprimir();

        System.out.println("########");
    }
}