public class AppTest {

    public static void main(String[] args) {
        ClienteService service = new ClienteService();

        service.cadastrar("Teste", "teste@email.com");

        assertEquals(1, service.total(), "Total de clientes deveria ser 1");

        System.out.println("Teste passou com sucesso!");
    }

    private static void assertEquals(int esperado, int atual, String mensagem) {
        if (esperado != atual) {
            throw new AssertionError(
                mensagem + " | esperado: " + esperado + ", atual: " + atual
            );
        }
    }
}
