import java.util.ArrayList;

public class NavegadorInternet implements iHistoricoNavegacao {
    private ArrayList<String> historicoNavegacao;

    public NavegadorInternet() {
        historicoNavegacao = new ArrayList<>();
    }

    public void abrirPagina(String url) { System.out.println("Abrir Pagina: " + url); }
    public void recarregarPagina() { System.out.println("Recarregar Pagina"); }
    public void voltarPagina() { System.out.println("Voltar Pagina"); }

    public void registrarAcesso(String pagina) { System.out.println("Registrar Acesso: " + pagina); }
    public String recuperarHistorico() { System.out.println("Recuperar Historico"); return "Historico"; }
}