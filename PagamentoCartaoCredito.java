public class PagamentoCartaoCredito implements Pagamento{
    private double valorPago;
    private String numeroCartao;

    public PagamentoCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void realizarPagamento(double valor) {
        this.valorPago = valor;
        System.out.println("Pagamento de R$ " + valor + " realizado com cartão de crédito: " + numeroCartao);
    }

    @Override
    public String obterDetalhesPagamento() {
        return "Pagamento com cartão de crédito: R$ " + valorPago + ", Número do cartão: " + numeroCartao;
    }
}
