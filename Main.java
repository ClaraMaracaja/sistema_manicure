import enums.TiposServico;
import model.*;
import service.AgendamentoService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibir os tipos de serviço disponíveis
        System.out.println("\nTipos de Serviço Disponíveis:");
        for (TiposServico tipo : TiposServico.values()) {
            System.out.println("- " + tipo);
        }

        System.out.print("\nDigite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Digite o seu número de telefone: ");
        String telefone = scanner.nextLine();
        Cliente cliente = new Cliente("3", nomeCliente, telefone);


        System.out.print("Digite o nome do serviço: ");
        String nomeServico = scanner.nextLine();
        System.out.print("Digite o valor do serviço: ");
        double valorServico = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner
        Servico servico = new Servico("6", nomeServico, valorServico);

        System.out.print("Digite a data e hora do agendamento (dd/MM/yyyy HH:mm): ");
        String dataHoraAgendamento = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dataHora = LocalDateTime.parse(dataHoraAgendamento, formatter);
        Agendamento agendamento = new Agendamento("6", cliente, servico, dataHora);

        AgendamentoService agendamentoService = new AgendamentoService();

        agendamentoService.agendar(agendamento);

        System.out.print("Digite a forma de pagamento (1 - Cartão de Crédito, 2 - Cartão de Débito, 3 - Dinheiro, 4 - Pix): ");
        int opcaoPagamento = scanner.nextInt();
        scanner.nextLine();

        Pagamento pagamento;
        switch (opcaoPagamento) {
            case 1:
                System.out.print("Digite o número do cartão de crédito: ");
                String numeroCartaoCredito = scanner.nextLine();
                pagamento = new PagamentoCartaoCredito(numeroCartaoCredito);
                break;
            case 2:
                System.out.print("Digite o número do cartão de débito: ");
                String numeroCartaoDebito = scanner.nextLine();
                pagamento = new PagamentoCartaoDebito(numeroCartaoDebito);
                break;
            case 3:
                pagamento = new PagamentoDinheiro();
                break;
            case 4:
                System.out.print("Digite a chave Pix: ");
                String chavePix = scanner.nextLine();
                pagamento = new PagamentoPix(chavePix);
                break;
            default:
                throw new IllegalArgumentException("Forma de pagamento inválida.");
        }

        pagamento.realizarPagamento(servico.getValor());
        System.out.println(pagamento.obterDetalhesPagamento());

        System.out.println("\nLista de Agendamentos:");
        for (Agendamento a : agendamentoService.listarAgendamentos()) {
            System.out.println(a);
        }
    }
}