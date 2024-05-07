import phone.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println("Navegador");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina();
        System.out.println("musicas");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
    }
}
