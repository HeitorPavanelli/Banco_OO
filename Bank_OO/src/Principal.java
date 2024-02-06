public class Principal {
    public static void main(String[] args) throws Exception {
        Conta cc = new ContaCorrente();
        cc.depositar(100);
    
        Conta pp = new ContaPoupanca();

        cc.transferir(100, cc);
    }
}
