package br.dio.pedro.bootcamp;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria(String nome, String descricao, LocalDate data) {
        super(nome, descricao);
        this.data = data;
    }

    @Override
    public int calculaXp() {
        return getXp() * 4;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
