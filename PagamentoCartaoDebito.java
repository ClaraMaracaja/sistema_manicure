package model;

public class PagamentoCartaoDebito implements Pagamento{
    private double valorPago;
    private String numeroCartao;

    public PagamentoCartaoDebito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void realizarPagamento(double valor) {
        this.valorPago = valor;
        System.out.println("Pagamento de R$ " + valor + " realizado com cartão de débito: " + numeroCartao);
    }

    @Override
    public String obterDetalhesPagamento() {
        return "Pagamento com cartão de débito: R$ " + valorPago + ", Número do cartão: " + numeroCartao;
    }
}