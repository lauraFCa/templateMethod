package apiSpotify;

public abstract class Requisicao {
    public abstract String endpoint();
    public abstract String conteudo();

    public String RealizarGET(){
        return "Resposta do request\nGET - " + endpoint();
    }

    public String RealizarPOST(){
        return "Resposta do request\nPOST - " + endpoint() + "\nBody: " + conteudo();
    }

}
