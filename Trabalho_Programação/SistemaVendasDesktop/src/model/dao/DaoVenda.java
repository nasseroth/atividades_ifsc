package model.dao;

import connection.SingleConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.beans.DetalheVendaBeans;
import model.beans.VendaBeans;

/**
 *
 * @author Nasser-Othman
 */
public class DaoVenda {

    private Connection connection;
    private int resposta = 0;

    public DaoVenda() {
        connection = SingleConnection.getConnection();
    }

    public String idVendas() {
        String idVendas = "";
        try {
            String sql = "select max(idVenda) from vendas";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                idVendas = rs.getString(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro\n" + ex.getMessage());
        }
        return idVendas;
    }

    public String NroSerie() {
        String serie = "";
        try {
            String sql = "select max(numeroVendas) from vendas";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                serie = rs.getString(1);
            }
        } catch (SQLException e) {
        }
        return serie;
    }

    public int salvarVenda(VendaBeans beans) {
        try {
            String sql = "insert into vendas(vendedor_idVendedor, cliente_idCliente, numeroVendas,"
                    + "dataVenda, valorVenda, estadoVenda) values(?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, beans.getVendedor().getIdVendedor());
            ps.setInt(2, beans.getCliente().getIdCliente());
            ps.setString(3, beans.getNumeroVendas());
            ps.setString(4, beans.getDataVenda());
            ps.setDouble(5, beans.getValorVenda());
            ps.setString(6, beans.getEstadoVenda());
            resposta = ps.executeUpdate();
            connection.commit();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Realizar Venda!\n" + ex.getMessage());
            ex.printStackTrace();
        }
        return resposta;
    }

    public int salvarDetalheVenda(DetalheVendaBeans beans) {
        try {
            String sql = "insert into detalhesvenda(venda_idVenda, produto_idProduto, "
                    + "quantidade, valorTotal) values(?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, beans.getVenda().getIdVenda());
            ps.setInt(2, beans.getProduto().getIdProduto());
            ps.setInt(3, beans.getQuantidade());
            ps.setDouble(4, beans.getValorTotal());
            ps.executeUpdate();
            connection.commit();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Realizar Venda!!!\n" + ex.getMessage());
        }
        return resposta;
    }
}
