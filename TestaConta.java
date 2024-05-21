public class TestaConta {
    public static void main(String[] args) {
        // Testando construtor sem argumentos
        Conta conta1 = new Conta();
        System.out.println("Conta 1 (sem especificar titular):");
        System.out.println(conta1);

        // Testando construtor que aceita apenas o nome do titular
        Conta conta2 = new Conta("Alice");
        System.out.println("\nConta 2 (apenas com titular):");
        System.out.println(conta2);

        // Testando construtor completo
        Data dataAberturaConta3 = new Data(15, 6, 2023);
        Conta conta3 = new Conta("Bob", 12345, 678, 1000.0, dataAberturaConta3);
        System.out.println("\nConta 3 (com todos os detalhes):");
        System.out.println(conta3);

        // Testando os métodos da classe Conta
        conta3.deposita(500.0);
        System.out.println("\nApós depósito de 500.0 na Conta 3:");
        System.out.println(conta3);

        boolean sacou = conta3.saca(200.0);
        if (sacou) {
            System.out.println("\nApós saque de 200.0 na Conta 3:");
        } else {
            System.out.println("\nSaldo insuficiente para saque na Conta 3.");
        }
        System.out.println(conta3);

        double rendimento = conta3.calculaRendimento(0.05);
        System.out.println("\nRendimento com taxa de 5% na Conta 3: " + rendimento);
    }
}
