import org.gerson.bancoDigital.banco.Banco;
import org.gerson.bancoDigital.cliente.Cliente;
import org.gerson.bancoDigital.conta.Conta;
import org.gerson.bancoDigital.conta.Corrente.ContaCorrente;
import org.gerson.bancoDigital.conta.Poupanca.ContaPoupanca;

public class Main {
    public static void main(String[] args)  {
        // Criando um banco
        Banco banco = new Banco();
        // Criando clientes
        Cliente cliente1 = new Cliente("João", "123.456.789-10", "Endereço do João", "123456789");
        Cliente cliente2 = new Cliente("Maria", "987.654.321-00", "Endereço da Maria", "987654321");

        // Criando contas para os clientes
        ContaCorrente contaCorrente1 = new ContaCorrente(cliente1);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca(cliente2);

        banco.criarConta(cliente1, contaCorrente1);
        banco.criarConta(cliente2, contaPoupanca2);

        // Realizando operações bancárias
        contaCorrente1.depositar(1000);
        contaPoupanca2.depositar(500);
        contaCorrente1.transferir(200, contaPoupanca2);

        // Teste para ver informações das contas criadas no banco

        System.out.println("----- Contas Bancárias -----");
        for (Conta conta : banco.listarContas()) {
            System.out.println("Cliente: " + conta.getCliente().getNome());
            conta.informacao();
            System.out.println();
        }


        // Teste pra ver se os clientes estão salvos de maneira correta

        System.out.println("----- Clientes -----");
        for (Cliente cliente : banco.listarClientes()) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Endereço: " + cliente.getEndereco());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println();
        }
    }
}
