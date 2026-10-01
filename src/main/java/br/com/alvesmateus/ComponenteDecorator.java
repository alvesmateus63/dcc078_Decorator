package br.com.alvesmateus;

public abstract class ComponenteDecorator implements Servidor {
    protected Servidor servidor;

    public ComponenteDecorator(Servidor servidor) { this.servidor = servidor; }

    @Override
    public String getEspecificacoes() {
        return servidor.getEspecificacoes();
    }

    @Override
    public double getCusto() {
        return servidor.getCusto();
    }
}
