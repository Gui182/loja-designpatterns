package br.com.alura.loja.pedido;

import java.math.BigDecimal;

public class GeraPedido {
    
    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeDeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeDeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public void executa() {
        
    }

    public String getCliente() {
        return cliente;
    }

    public int getQuantidadeDeItens() {
        return quantidadeDeItens;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

}
