package br.com.alvesmateus;

public class PlacaRede10G extends ComponenteDecorator {
    public PlacaRede10G(Servidor servidor) {
        super(servidor);
    }

    @Override
    public String getEspecificacoes() {
        return super.getEspecificacoes() + " + Placa de Rede 10Gbps";
    }

    @Override
    public double getCusto() {
        return super.getCusto() + 389.90;
    }
}
