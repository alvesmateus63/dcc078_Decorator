package br.com.alvesmateus;

public class ServidorBase implements Servidor {
    @Override
    public String getEspecificacoes() {
        return "Servidor Rack 1U: (CPU 8-core, 16GB RAM)";
    }

    @Override
    public double getCusto() {
        return 3500;
    }
}
