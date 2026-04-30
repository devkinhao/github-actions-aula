import java.util.ArrayList;
import java.util.List;

class Cliente {
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Email: " + email;
    }
}

public class App {

    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        System.out.println("=== INICIANDO APLICAÇÃO ===");

        // Simulando cadastro
        cadastrarCliente(clientes, "João", "joao@email.com");
        cadastrarCliente(clientes, "Maria", "maria@email.com");

        // Listando clientes
        listarClientes(clientes);

        System.out.println("=== FINALIZADO ===");
    }

    private static void cadastrarCliente(List<Cliente> clientes, String nome, String email) {
        clientes.add(new Cliente(nome, email));
        System.out.println("Cliente cadastrado: " + nome);
    }

    private static void listarClientes(List<Cliente> clientes) {
        System.out.println("\n=== CLIENTES ===");

        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }
}
