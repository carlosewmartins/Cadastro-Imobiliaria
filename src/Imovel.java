class Imovel {
    private String endereco;
    private String tipo;
    private double valor;

    public Imovel(String endereco, double valor, String tipo) {
        this.endereco = endereco;
        this.valor = valor;
        this.tipo = tipo;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }
}
