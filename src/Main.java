import iphone.Iphone;
import navegador.NavegadorInternet;
import reprodutor.ReprodutorMusical;
import telefone.AparelhoTelefonico;

import java.awt.image.ImageProducer;

public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone("iPhone 13", 256);

        System.out.println("Ligando o iPhone...");
        meuIphone.ligar();

        System.out.println("\nReproduzindo música no iPhone...");
        meuIphone.reproduzirMusica();

        System.out.println("\nFazendo uma chamada no iPhone...");
        meuIphone.fazerChamada("123-456-789");

        System.out.println("\nEnviando uma mensagem do iPhone...");
        meuIphone.enviarMensagem("123-456-789", "Olá, como você está?");

        System.out.println("\nAbrindo o navegador no iPhone...");
        meuIphone.abrirNavegador();

        ReprodutorMusical reprodutor = meuIphone;
        System.out.println("\nReproduzindo música usando o ReprodutorMusical...");
        reprodutor.reproduzirMusica();
        reprodutor.pausarMusica();
        reprodutor.avancarMusica();
        reprodutor.voltarMusica();

        AparelhoTelefonico telefone = meuIphone;
        System.out.println("\nFazendo uma chamada usando o AparelhoTelefonico...");
        telefone.fazerChamada("987-654-321");
        telefone.atenderChamada();
        telefone.encerrarChamada();
        telefone.enviarMensagem("987-654-321", "Tudo bem?");

        NavegadorInternet navegador = meuIphone;
        System.out.println("\nAbrindo o navegador usando o NavegadorInternet...");
        navegador.abrirNavegador();
        navegador.abrirPaginaWeb("https://www.exemplo.com");
        navegador.voltarPagina();
        navegador.avancarPagina();
        navegador.fecharNavegador();
    }
}