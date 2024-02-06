public class ContaPoupanca extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("EXTRATO DA CONTA POUPANÇA");
        System.out.println("AGENCIA: " + super.getAgencia());
    }
    
}
