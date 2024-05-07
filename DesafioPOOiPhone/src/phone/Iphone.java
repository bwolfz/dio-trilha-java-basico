package phone;
import phone.AparelhoTelefonico;
import phone.NavegadorInternet;
import phone.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void tocar() {
       System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina no navegador");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando aba no navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina no navegador");
    }

    @Override
    public void ligar() {
        System.out.println("Discando");
    }

    @Override
    public void atender() {
        System.out.println("Alo?");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Caixa Postal");
    }

    
}
