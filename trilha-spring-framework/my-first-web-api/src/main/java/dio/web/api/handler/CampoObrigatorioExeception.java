package dio.web.api.handler;

public class CampoObrigatorioExeception extends BusinessException{

    public CampoObrigatorioExeception(String campo) {
        super("O campo %s é obrigatório", campo);
    }
}
