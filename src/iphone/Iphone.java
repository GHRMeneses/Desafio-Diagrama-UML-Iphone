package iphone;

import navegador.NavegadorInternet;
import reprodutor.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    private String modelo;
    private int armazenamento;

    public Iphone(String modelo, int armazenamento) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
    }

    public void ligar() {
    }

    public void desligar() {
    }

    public void reproduzirMusica() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música...");
    }

    @Override
    public void avancarMusica() {
        System.out.println("Avançando música...");
    }

    @Override
    public void voltarMusica() {
        System.out.println("Voltando música...");
    }

    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero);
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Encerrando chamada...");

    }

    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }

    public void abrirNavegador() {
        System.out.println("Abrindo navegador...");
    }

    @Override
    public void abrirPaginaWeb(String url) {
        System.out.println("Abrindo página web: " + url);
    }

    @Override
    public void voltarPagina() {
        System.out.println("Voltando página...");
    }

    @Override
    public void avancarPagina() {
        System.out.println("Avançando página...");

    }

    @Override
    public void fecharNavegador() {
        System.out.println("Fechando navegador...");
    }
}