package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class EnviarEmail implements AcaoAposGerarPedido {
    
    public void executa(Pedido pedido) {
        System.out.println("Enviando email com os dados do pedido");
    }
}
