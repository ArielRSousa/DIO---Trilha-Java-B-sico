public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    @Override
    public void tocar(){
        System.out.print("Tocando");
    }

    @Override
    public void pausar() {
        System.out.print("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica){
        System.out.printf("Selecionando música: %s \n", musica);
    }

    @Override
    public void ligar(String numero){
        System.out.printf("Ligando para %s\n", numero);
    }

    @Override
    public void  atender(){
        System.out.print("Atendendo chamada");
    }

    @Override
    public void desligar(String numero){
        System.out.printf("Desligando para %s\n", numero);
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void finalizarCorreioVoz() {
        System.out.println("Finalizando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();
        meuIphone.selecionarMusica("DEATH");
        meuIphone.tocar();
    }
}