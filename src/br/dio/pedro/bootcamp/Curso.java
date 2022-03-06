package br.dio.pedro.bootcamp;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso(String nome, String descricao, int cargaHoraria) {
        super(nome, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public int calculaXp() {
        return this.getXp() * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
