public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(789456, "Artur","12345678910");
        Cliente cliente2 = new Cliente(123457, "Delzira","11109876543");

        System.out.println("nome: " + cliente1.getNome());
        System.out.println("nome: " + cliente2.getNome());
        cliente1.setNome("Artur Santos");
        System.out.println("nome: " + cliente1.getNome());

        Conta conta1 = new Conta(789456, 1000.0);
        Conta conta2 = new Conta(123457, 500.0);

        System.out.println("saldo: " + conta1.saldo);
        conta1.setSaldo(5000.0);
        System.out.println("saldo: " + conta2.saldo);
        System.out.println("saldo: " + conta1.saldo);

        Transacao transacao1 = new Transacao(1, 200.0);
        Transacao transacao2 = new Transacao(2, 50.0);

        System.out.println("valor: " + transacao1.valor);
        transacao1.setValor(150.0);
        System.out.println("valor: " + transacao2.valor);
        System.out.println("valor: " + transacao1.valor);

        Agencia agencia1 = new Agencia(1, "Rua Trator, 178");
        Agencia agencia2 = new Agencia(2, "Rua Carro, 321");

        System.out.println("endereco: " + agencia1.endereco);
        agencia1.setEndereco("Rua aretuza, 234");
        System.out.println("endereco: " + agencia2.endereco);
        System.out.println("endereco: " + agencia1.endereco);

        Cartao cartao1 = new Cartao(23156, 10000);
        Cartao cartao2 = new Cartao(45621, 7000);

        System.out.println("limite: " + cartao1.limite);
        cartao1.setLimite(2000);
        System.out.println("limite: " + cartao2.limite);
        System.out.println("limite: " + cartao1.limite);




    }
}

