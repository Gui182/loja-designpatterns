package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.EnviarEmail;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDados;

public class GeraPedidoHandler {
    
    //construtor com injeção de depencias

    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeDeItens());
        LocalDateTime data = LocalDateTime.now();

        Pedido pedido = new Pedido(dados.getCliente(), data, orcamento);

        EnviarEmail email = new EnviarEmail();
        SalvarPedidoNoBancoDados salvarPedidoNoBancoDados = new SalvarPedidoNoBancoDados();

        email.executar(pedido);
        salvarPedidoNoBancoDados.executar(pedido);
    }
}
