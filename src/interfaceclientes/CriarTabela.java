package interfaceclientes;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class CriarTabela {

    public void criarTabela() {
        try (Connection conn = new ConexaoSQLite().conectar()) {
            if (conn != null) {
                String sql = "CREATE TABLE IF NOT EXISTS clientes (" +
                             "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                             "nome TEXT, " +
                             "telefone TEXT, " +
                             "descricao TEXT, " +
                             "data TEXT, " +
                             "valor REAL" +
                             ")";
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sql);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
