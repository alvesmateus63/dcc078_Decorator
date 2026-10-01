package br.com.alvesmateus;

public class ArmazenamentoNVMe extends ComponenteDecorator {
    public ArmazenamentoNVMe(Servidor servidor) {
        super(servidor);
    }

    @Override
    public String getEspecificacoes() {
        return super.getEspecificacoes() + " + SSD NVMe 2TB";
    }

    @Override
    public double getCusto() {
        return super.getCusto() + 780;
    }
}
