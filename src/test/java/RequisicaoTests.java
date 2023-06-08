import apiSpotify.RequisicaoMusica;
import apiSpotify.RequisicaoPlaylist;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RequisicaoTests {

    @Test
    void deveRetornarGetMusica(){
        RequisicaoMusica req = new RequisicaoMusica("nome-musica", null);
        assertEquals("Resposta do request\nGET - spotify.musica/api/nome-musica", req.RealizarGET());
    }

    @Test
    void deveRetornarPostPlaylist(){
        RequisicaoPlaylist req = new RequisicaoPlaylist("", "Nome: Playlist01; Musicas: [Musica1, Musica2]");
        assertEquals("Resposta do request\nPOST - spotify.playlists/api/\nBody: Nome: Playlist01; Musicas: [Musica1, Musica2]", req.RealizarPOST());
    }
}
