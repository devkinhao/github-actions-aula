import java.util.ArrayList;
import java.util.List;

public class ClienteService {
    private List<Cliente> clientes = new ArrayList<>();

    public void cadastrar(String nome, String email) {
        clientes.add(new Cliente(nome, email));
    }

    public List<Cliente> listar() {
        return clientes;
    }

    public int total() {
        return clientes.size();
    }
}