public class Smartphone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Reprodutor Musical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        System.out.println();

        // Aparelho Telefônico
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioDeVoz();
        System.out.println();

        // Navegador de Internet
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}