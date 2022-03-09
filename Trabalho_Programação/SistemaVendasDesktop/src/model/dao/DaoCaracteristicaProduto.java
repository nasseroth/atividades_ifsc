package model.dao;

import connection.SingleConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.beans.CaracteristicaProdutoBeans;
import model.beans.CorBeans;
import model.beans.ProdutoBeans;

/**
 *
 * @author Nasser-Othman
 */
public class DaoCaracteristicaProduto {

    CaracteristicaProdutoBeans caracteristicaProdutoBeans = new CaracteristicaProdutoBeans();
    private Connection connection;
    private int resposta = 0;

    public DaoCaracteristicaProduto() {
        connection = SingleConnection.getConnection();
    }

    public void inserirCaracteristicaProduto(CaracteristicaProdutoBeans beans) {
        try {
            String sql = "insert into caracteristicaProduto(idProduto, idCor, tamanhoProduto, barraProduto, qtdEstoqueProduto)"
                    + "values (?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, beans.getProduto().getIdProduto());
            ps.setInt(2, beans.getCor().getIdCor());
            ps.setString(3, beans.getTamanhoProduto());
            ps.setString(4, beans.getBarraProduto());
            ps.setDouble(5, beans.getQtdEstoqueProduto());
            
            ps.execute();
            connection.setAutoCommit(false);
            connection.commit();
            JOptionPane.showMessageDialog(null, "Dados Salvos com Sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Oops\nErro ao Salvar Dados!");
        }
    }

    public List<CaracteristicaProdutoBeans> listarCaracteristicaProduto() {
        List<CaracteristicaProdutoBeans> lista = new ArrayList<CaracteristicaProdutoBeans>();
        try {
            String sql = "select * from caracteristicaProduto";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CaracteristicaProdutoBeans beans = new CaracteristicaProdutoBeans();
                beans.setIdCaracteristicaProduto(rs.getInt("idCaracteristicaProduto"));
                beans.setProduto(new ProdutoBeans(rs.getInt("idProduto")));
                beans.setCor(new CorBeans(rs.getInt("idCor")));
                beans.setTamanhoProduto(rs.getString("tamanhoProduto"));
                beans.setBarraProduto(rs.getString("barraProduto"));
                beans.setQtdEstoqueProduto(rs.getDouble("qtdEstoqueProduto"));
                
                lista.add(beans);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao Listar Dados!");
        }
        return lista;
    }

    public void atualizarCaracteristicaProduto(CaracteristicaProdutoBeans beans) {
        try {
            String sql = "update caracteristicaProduto set idProduto = ?, idCor = ?, tamanhoProduto = ?, "
                    + " barraProduto = ?, qtdEstoqueProduto = ? where idCaracteristicaProduto = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, beans.getProduto().getIdProduto());
            ps.setInt(2, beans.getCor().getIdCor());
            ps.setString(3, beans.getTamanhoProduto());
            ps.setString(4, beans.getBarraProduto());
            ps.setDouble(5, beans.getQtdEstoqueProduto());
            ps.setInt(6, beans.getIdCaracteristicaProduto());
            
            ps.execute();
            connection.commit();
            JOptionPane.showMessageDialog(null, "Dados Editados com Sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao Editar Dados!");
        }
    }

    public void excluirCaracteristicaProduto(CaracteristicaProdutoBeans beans) {
        try {
            String sql = "delete from caracteristicaProduto where idCaracteristicaProduto = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, beans.getIdCaracteristicaProduto());
            ps.execute();
            connection.commit();
            JOptionPane.showMessageDialog(null, "Dados Excluidos com Sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao Excluir Dados!\n"+ex.getMessage());
        }
    }

    public CaracteristicaProdutoBeans consultaCaracteristicaProduto(int cod) {
        try {
            String sql = "select * from caracteristicaProduto where barraProduto = " + cod;
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                CaracteristicaProdutoBeans beans = new CaracteristicaProdutoBeans();
                beans.setIdCaracteristicaProduto(rs.getInt("idCaracteristicaProduto"));
                beans.setProduto(new ProdutoBeans(rs.getInt("idProduto")));
                beans.setCor(new CorBeans(rs.getInt("idCor")));
                beans.setTamanhoProduto(rs.getString("tamanhoProduto"));
                beans.setBarraProduto(rs.getString("barraProduto"));
                beans.setQtdEstoqueProduto(rs.getDouble("qtdEstoqueProduto"));
                return beans;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Erro ao buscar CaracteristicaProduto!");
        }
        return null;
    }
}
