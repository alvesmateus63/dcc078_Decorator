package br.com.alvesmateus;

public class FonteRedundante extends ComponenteDecorator {
    public FonteRedundante(Servidor servidor) {
        super(servidor);
    }

    @Override
    public String getEspecificacoes() {
        return super.getEspecificacoes() + " + Fonte de Alimentação Redundante";
    }

    @Override
    public double getCusto() {
        return super.getCusto() + 600;
    }
}
