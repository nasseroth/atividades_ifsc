package model.dao;

import connection.SingleConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.beans.CorBeans;

/**
 *
 * @author Nasser-Othman
 */
public class DaoCor {

    CorBeans corBeans = new CorBeans();
    private Connection connection;
    private int resposta = 0;

    public DaoCor() {
        connection = SingleConnection.getConnection();
    }

    public void inserirCor(CorBeans beans) {
        try {
            String sql = "insert into cor(nomeCor)"
                    + "values (?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, beans.getNomeCor());
            ps.execute();
            connection.setAutoCommit(false);
            connection.commit();
            JOptionPane.showMessageDialog(null, "Dados Salvos com Sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Oops\nErro ao Salvar Dados!");
        }
    }

    public List<CorBeans> listarCor() {
        List<CorBeans> lista = new ArrayList<CorBeans>();
        try {
            String sql = "select * from cor";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CorBeans beans = new CorBeans();
                beans.setIdCor(rs.getInt("idCor"));
                beans.setNomeCor(rs.getString("nomeCor"));
                lista.add(beans);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao Listar Dados!");
        }
        return lista;
    }

    public void atualizarCor(CorBeans beans) {
        try {
            String sql = "update cor set nomeCor = ? where idCor = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, beans.getNomeCor());
            ps.setInt(2, beans.getIdCor());
            ps.execute();
            connection.commit();
            JOptionPane.showMessageDialog(null, "Dados Editados com Sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao Editar Dados!");
        }
    }

    public void excluirCor(CorBeans beans) {
        try {
            String sql = "delete from cor where idCor = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, beans.getIdCor());
            ps.execute();
            connection.commit();
            JOptionPane.showMessageDialog(null, "Dados Excluidos com Sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao Excluir Dados!\n"+ex.getMessage());
        }
    }

    public boolean validaNomeCor(String nomeProd) {
        try {
            String sql = "select count(1) as quant from cor where nomeCor = '" + nomeProd + "'";
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

    public boolean validaNomeCorUpdate(String nomeProd, int id) {
        try {
            String sql = "select count(1) as quant from cor where nomeCor = '" + nomeProd + "'"
                    + "and idCor <> " + id;
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

    public CorBeans consultaCor(int cod) {
        try {
            String sql = "select * from cor where idCor = " + cod;
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                CorBeans beans = new CorBeans();
                beans.setIdCor(rs.getInt("idCor"));
                beans.setNomeCor(rs.getString("nomeCor"));
                return beans;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Erro ao buscar Cor!");
        }
        return null;
    }
}
