public class AppTest {
    public static void main(String[] args) {
        ClienteService service = new ClienteService();

        service.cadastrar("Teste", "teste@email.com");

        if (service.total() != 1) {
            throw new RuntimeException("Teste falhou!");
        }

        System.out.println("Teste passou com sucesso!");
    }
}