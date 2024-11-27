package model;

public class PagamentoDinheiro implements Pagamento {
    private double valorPago;


    @Override
    public void realizarPagamento(double valor) {
        this.valorPago = valor;
        System.out.println("Pagamento de R$ " + valor + " realizado em dinheiro.");
    }

    @Override
    public String obterDetalhesPagamento() {
        return "Pagamento em dinheiro: R$ " + valorPago;

    }
}