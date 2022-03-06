package br.dio.pedro.bootcamp;

public abstract class Conteudo {
    protected String nome;
    protected String descricao;

    private static final int XP_PADRAO = 10;

    public Conteudo (String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public abstract int calculaXp();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getXp() {
        return XP_PADRAO;
    }
}
