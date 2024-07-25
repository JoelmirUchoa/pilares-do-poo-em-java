import dispositivo.iPhone;
import musica.ReprodutorMusical;
import navegador.NavegadorInternet;
import telefone.AparelhoTelefonico;

public class Usuario {
    public static void main(String[] args) {
        iPhone  iphone = new iPhone();

        ReprodutorMusical musica = iphone;
        AparelhoTelefonico telefone = iphone;
        NavegadorInternet net = iphone;

        musica.tocar();
        musica.pausar();
        musica.selecionarMusica("Som 1");

        telefone.ligar("123-456-7890");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        net.exibirPagina("http://example.com");
        net.adicionarNovaAba();
        net.atualizarPagina();
    }
}
