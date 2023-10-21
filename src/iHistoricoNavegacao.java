public interface iHistoricoNavegacao {
    void registrarAcesso(String pagina);
    String recuperarHistorico();
}