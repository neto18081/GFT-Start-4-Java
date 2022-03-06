package br.pedro.facade;

import br.pedro.facade.subsistema.cep.CepApi;
import br.pedro.facade.subsistema.crm.CrmService;

public class Facade {

    public void MigrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome ,cep, cidade, estado);
    }
}
