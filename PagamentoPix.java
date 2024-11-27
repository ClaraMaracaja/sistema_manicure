package model;

public class PagamentoPix implements Pagamento{
    private double valorPago;
    private String chavePix;

    public PagamentoPix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void realizarPagamento(double valor) {
        this.valorPago = valor;
        System.out.println("Pagamento de R$ " + valor + " realizado via Pix: " + chavePix);
    }

    @Override
    public String obterDetalhesPagamento() {
        return "Pagamento via Pix: R$ " + valorPago + ", Chave Pix: " + chavePix;
    }
}