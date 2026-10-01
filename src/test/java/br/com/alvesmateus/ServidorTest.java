package br.com.alvesmateus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServidorTest {

    @Test
    public void deveRetornarCustoEEspecificacoesDoServidorBase() {
        Servidor servidor = new ServidorBase();

        assertEquals(3500.00, servidor.getCusto(), 0.001);
        assertEquals("Servidor Rack 1U: (CPU 8-core, 16GB RAM)", servidor.getEspecificacoes());
    }

    @Test
    public void deveAdicionarCustoEEspecificacoesDoNVMe() {
        Servidor servidor = new ArmazenamentoNVMe(new ServidorBase());

        assertEquals(4280.00, servidor.getCusto(), 0.001);
        assertEquals("Servidor Rack 1U: (CPU 8-core, 16GB RAM) + SSD NVMe 2TB", servidor.getEspecificacoes());
    }

    @Test
    public void deveAcumularCustoEEspecificacoesComMultiplosDecorators() {
        Servidor servidor = new PlacaRede10G(
                new ArmazenamentoNVMe(
                        new FonteRedundante(new ServidorBase())
                )
        );

        assertEquals(5269.90, servidor.getCusto(), 0.001);
        String especificacaoEsperada = "Servidor Rack 1U: (CPU 8-core, 16GB RAM) " +
                "+ Fonte de Alimentação Redundante " +
                "+ SSD NVMe 2TB " +
                "+ Placa de Rede 10Gbps";

        assertEquals(especificacaoEsperada, servidor.getEspecificacoes());
    }
}
