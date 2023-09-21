package telefone;

public interface AparelhoTelefonico {
    void fazerChamada(String numero);
    void atenderChamada();
    void encerrarChamada();
    void enviarMensagem(String numero, String mensagem);
}
