package br.pedro.facade.subsistema.cep;

import br.pedro.singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Ponta Grossa";
    }
    public String recuperarEstado(String cep) {
        return "PR";
    }

}
