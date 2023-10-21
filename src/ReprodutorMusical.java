import java.util.ArrayList;

public class ReprodutorMusical implements iPlaylist {
    private String musicaAtual;
    private ArrayList<String> playlist;

    public ReprodutorMusical() {
        playlist = new ArrayList<>();
    }

    public void reproduzir() {  System.out.println("Reproduzir musica"); }
    public void pausar() {  System.out.println("Pausar musica"); }
    public String proximaMusica() {  System.out.println("Proxima musica"); return "Proxima Musica"; }

    public void adicionarMusica(String musica) { System.out.println("Adicionar musica: " + musica); }
    public void removerMusica(String musica) { System.out.println("Remover musica: " + musica); }
}