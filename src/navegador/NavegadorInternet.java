package navegador;

public interface NavegadorInternet {
    void abrirNavegador();
    void abrirPaginaWeb(String url);
    void voltarPagina();
    void avancarPagina();
    void fecharNavegador();
}
