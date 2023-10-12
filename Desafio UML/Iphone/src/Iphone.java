interface AparelhoTelefonico {
    void ligar(long numero);
    void atender();
    void iniciarCorreioVoz();
}

interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}


class IPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    @Override
    public void ligar(long numero) {
        // Implementação para ligar o telefone
        System.out.println("Ligando para numero: " + numero);
    }

    @Override
    public void atender() {
        // Implementação para atender chamadas
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        // Implementação para iniciar correio de voz
        System.out.println("Iniciando correio de Voz!");
    }

    @Override
    public void tocar() {
        // Implementação para tocar música
        System.out.println("Tocando Musica");
    }

    @Override
    public void pausar() {
        // Implementação para pausar a reprodução de música
        System.out.println("Pausando Musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        // Implementação para selecionar uma música
        System.out.println("Musica selecionada: " + musica);
    }

    @Override
    public void exibirPagina(String url) {
        // Implementação para exibir uma página na internet
        System.out.println("Exibindo a pagina: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        // Implementação para adicionar uma nova aba no navegador
        System.out.println("Adicionando uma nova aba");
    }

    @Override
    public void atualizarPagina() {
        // Implementação para atualizar a página no navegador
        System.out.println("Atualizando a página...");
    }

        public static void main(String[] args) {
        IPhone myPhone = new IPhone();

        // Exemplo de uso das funcionalidades do iPhone
        myPhone.ligar(1211101210l);
        myPhone.tocar();
        myPhone.exibirPagina("https://www.example.com");
    }
}






