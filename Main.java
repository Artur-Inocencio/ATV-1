public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(123456, "Laís","12345678900");
        Cliente cliente2 = new Cliente(123457, "Lígia","12345678911");

        System.out.println("nome: " + cliente1.getNome());
        System.out.println("nome: " + cliente2.getNome());
        cliente1.setNome("Laís Queiroz");
        System.out.println("nome: " + cliente1.getNome());

        Conta conta1 = new Conta(123456, 1000.0);
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

        Agencia agencia1 = new Agencia(1, "Rua A, 123");
        Agencia agencia2 = new Agencia(2, "Rua B, 456");

        System.out.println("endereco: " + agencia1.endereco);
        agencia1.setEndereco("Rua C, 789");
        System.out.println("endereco: " + agencia2.endereco);
        System.out.println("endereco: " + agencia1.endereco);

        Cartao cartao1 = new Cartao(123456, 10000);
        Cartao cartao2 = new Cartao(654321, 7000);

        System.out.println("limite: " + cartao1.limite);
        cartao1.setLimite(14000);
        System.out.println("limite: " + cartao2.limite);
        System.out.println("limite: " + cartao1.limite);




    }
}

