class Corretor {
    private String nome;
    private String creci;
    private String email;
    private String telefone;

    public Corretor(String nome, String creci, String email, String telefone) {
        this.nome = nome;
        this.creci = creci;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCreci() {
        return creci;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}
