package br.com.alefe.bytebank.domain.conta;

import br.com.alefe.bytebank.domain.cliente.DadosCadastroCliente;

public record DadosAberturaConta(Integer numero, DadosCadastroCliente dadosCliente) {
}
