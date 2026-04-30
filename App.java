public class App {
    public static void main(String[] args) {
        ClienteService service = new ClienteService();

        service.cadastrar("João", "joao@email.com");
        service.cadastrar("Maria", "maria@email.com");

        System.out.println("Total de clientes: " + service.total());
    }
}
