package model.dao;

import connection.SingleConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.beans.ProdutoBeans;

/**
 *
 * @author Nasser-Othman
 */
public class DaoProduto {

    ProdutoBeans produtoBeans = new ProdutoBeans();
    private Connection connection;
    private int resposta = 0;

    public DaoProduto() {
        connection = SingleConnection.getConnection();
    }

    public void inserirProduto(ProdutoBeans beans) {
        try {
            String sql = "insert into produto(nomeProduto, precoProduto, stockProduto, estadoProduto)"
                    + "values (?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, beans.getNomeProduto());
            ps.setDouble(2, beans.getPrecoProduto());
            ps.setInt(3, beans.getQuantProduto());
            ps.setString(4, beans.getEstadoProduto());
            ps.execute();
            connection.commit();
            JOptionPane.showMessageDialog(null, "Dados Salvos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops\nErro ao Salvar Dados!");
        }
    }

    public List<ProdutoBeans> listarProduto() {
        List<ProdutoBeans> lista = new ArrayList<ProdutoBeans>();
        try {
            String sql = "select *from produto";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ProdutoBeans beans = new ProdutoBeans();
                beans.setIdProduto(rs.getInt("idProduto"));
                beans.setNomeProduto(rs.getString("nomeProduto"));
                beans.setPrecoProduto(rs.getDouble("precoProduto"));
                beans.setQuantProduto(rs.getInt("stockProduto"));
                beans.setEstadoProduto(rs.getString("estadoProduto"));
                lista.add(beans);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao Listar Dados!");
        }
        return lista;
    }

    public void actualizarProduto(ProdutoBeans beans) {
        try {
            String sql = "update produto set nomeProduto = ?, precoProduto = ?, stockProduto = ?,"
                    + "estadoProduto = ? where idProduto = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, beans.getNomeProduto());
            ps.setDouble(2, beans.getPrecoProduto());
            ps.setInt(3, beans.getQuantProduto());
            ps.setString(4, beans.getEstadoProduto());
            ps.setInt(5, beans.getIdProduto());
            ps.execute();
            connection.commit();
            JOptionPane.showMessageDialog(null, "Dados Editados com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao Editar Dados!");
        }
    }

    public void excluirProduto(ProdutoBeans beans) {
        try {
            String sql = "delete from produto where idProduto = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, beans.getIdProduto());
            ps.execute();
            connection.commit();
            JOptionPane.showMessageDialog(null, "Dados Excluidos com Sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao Excluir Dados!\n"+ex.getMessage());
        }
    }

    public boolean validaNomeProduto(String nomeProd) {
        try {
            String sql = "select count(1) as quant from produto where nomeProduto = '" + nomeProd + "'";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("quant") <= 0;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao Verificar Dados");
        }
        return false;
    }

    public boolean validaNomeProdutoUpdate(String nomeProd, int id) {
        try {
            String sql = "select count(1) as quant from produto where nomeProduto = '" + nomeProd + "'"
                    + "and idProduto <> " + id;
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("quant") <= 0;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao Verificar Dados");
        }
        return false;
    }

    public ProdutoBeans consultaProduto(int cod) {
        try {
            String sql = "select * from produto where idProduto = " + cod;
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ProdutoBeans beans = new ProdutoBeans();
                beans.setIdProduto(rs.getInt("idProduto"));
                beans.setNomeProduto(rs.getString("nomeProduto"));
                beans.setPrecoProduto(rs.getDouble("precoProduto"));
                beans.setQuantProduto(rs.getInt("stockProduto"));
                beans.setEstadoProduto(rs.getString("estadoProduto"));
                return beans;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Produto!");
        }
        return null;
    }

    public int actulizaStock(int stock, int id) {
        try {
            String sql = "update produto set stockProduto = " + stock + " where idProduto = " + id;
            PreparedStatement ps = connection.prepareStatement(sql);
            resposta = ps.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Actualizar Stock");
        }
        return resposta;
    }
}
