import java.util.ArrayList;

public class AparelhoTelefonico {
    private ArrayList<String> ligacoesAtivas;

    public AparelhoTelefonico() {
        ligacoesAtivas = new ArrayList<>();
    }

    public void receberLigacao(String ligacao) {  System.out.println("Receber Ligacao");}
    public void fazerLigacao(String numero) { System.out.println("Fazer Ligacao"); }
    public void encerrarLigacao(String ligacao) { System.out.println("Encerrar Ligacao"); }
}