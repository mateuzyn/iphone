public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorDeInternet {

    // Reprodutor Musical
    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }
    public void pausar() {
        System.out.println("PAUSANDO MUSICA");
    }
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MUSICA");
    }

    // Aparelho Telefônico
    public void ligar() {
        System.out.println("LIGANDO");
    }
    public void atender() {
        System.out.println("ATENDENDO");
    }
    public void iniciarCorreioDeVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    // Navegador de Internet
    public void exibirPagina() {
        System.out.println("EXIBINDO PAGINA");
    }
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA");
    }
}