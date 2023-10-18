package dio.RealizadoEmVideo.facade;

import dio.RealizadoEmVideo.Subsistema1.CrmService;
import dio.RealizadoEmVideo.Subsistema1.Subsistema2.CepApi;

public class Facade {        
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
