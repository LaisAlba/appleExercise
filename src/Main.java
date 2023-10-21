public class Main {
    public static void main(String[] args) {
        NavegadorInternet ni = new NavegadorInternet();
        ni.abrirPagina("google");
        ni.recarregarPagina();
        ni.voltarPagina();
        ni.registrarAcesso("novoUser");
        ni.recuperarHistorico();

        ReprodutorMusical rm = new ReprodutorMusical();
        rm.reproduzir();
        rm.pausar();
        rm.proximaMusica();
        rm.adicionarMusica("MusicaTeste");
        rm.removerMusica("MusicaTeste");
    }
}