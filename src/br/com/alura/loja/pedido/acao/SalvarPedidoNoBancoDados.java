package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDados implements AcaoAposGerarPedido {
    
    public void executa(Pedido pedido) {
        System.out.println("Salvando Pedido no banco de dados");
    }
}
