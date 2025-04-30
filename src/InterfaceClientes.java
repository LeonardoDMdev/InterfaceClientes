
import interfaceclientes.Interface;
import interfaceclientes.CriarTabela;

public class InterfaceClientes {

    public static void main(String[] args) {
        // Criando a tabela no banco de dados, caso ainda não exista
        new CriarTabela().criarTabela();

        // Exibindo a interface
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }
}

