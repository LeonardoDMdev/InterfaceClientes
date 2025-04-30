package interfaceclientes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirDados {

    public static void inserir(String nome, String telefone, String descricao, String data, double valor) {
        try (Connection conn = new ConexaoSQLite().conectar()) {
            if (conn != null) {
                String sql = "INSERT INTO clientes (nome, telefone, descricao, data, valor) VALUES (?, ?, ?, ?, ?)";
                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                    pstmt.setString(1, nome);
                    pstmt.setString(2, telefone);
                    pstmt.setString(3, descricao);
                    pstmt.setString(4, data);
                    pstmt.setDouble(5, valor);
                    pstmt.executeUpdate();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

