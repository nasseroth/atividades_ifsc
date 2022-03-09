package model.dao;

import connection.SingleConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.beans.BairroBeans;

/**
 *
 * @author Nasser-Othman
 */
public class DaoBairro {

    BairroBeans bairroBeans = new BairroBeans();
    private Connection connection;
    private int resposta = 0;

    public DaoBairro() {
        connection = SingleConnection.getConnection();
    }

    public void inserirBairro(BairroBeans beans) {
        try {
            String sql = "insert into bairro(nomeBairro)"
                    + "values (?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, beans.getNomeBairro());
            ps.execute();
            connection.setAutoCommit(false);
            connection.commit();
            JOptionPane.showMessageDialog(null, "Dados Salvos com Sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Oops\nErro ao Salvar Dados!");
        }
    }

    public List<BairroBeans> listarBairro() {
        List<BairroBeans> lista = new ArrayList<BairroBeans>();
        try {
            String sql = "select * from bairro";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BairroBeans beans = new BairroBeans();
                beans.setIdBairro(rs.getInt("idBairro"));
                beans.setNomeBairro(rs.getString("nomeBairro"));
                lista.add(beans);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao Listar Dados!");
        }
        return lista;
    }

    public void atualizarBairro(BairroBeans beans) {
        try {
            String sql = "update bairro set nomeBairro = ? where idBairro = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, beans.getNomeBairro());
            ps.setInt(2, beans.getIdBairro());
            ps.execute();
            connection.commit();
            JOptionPane.showMessageDialog(null, "Dados Editados com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao Editar Dados!");
        }
    }

    public void excluirBairro(BairroBeans beans) {
        try {
            String sql = "delete from bairro where idBairro = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, beans.getIdBairro());
            ps.execute();
            connection.commit();
            JOptionPane.showMessageDialog(null, "Dados Excluidos com Sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao Excluir Dados!\n"+ex.getMessage());
        }
    }

    public boolean validaNomeBairro(String nomeProd) {
        try {
            String sql = "select count(1) as quant from bairro where nomeBairro = '" + nomeProd + "'";
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

    public boolean validaNomeBairroUpdate(String nomeProd, int id) {
        try {
            String sql = "select count(1) as quant from bairro where nomeBairro = '" + nomeProd + "'"
                    + "and idBairro <> " + id;
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

    public BairroBeans consultaBairro(int cod) {
        try {
            String sql = "select * from bairro where idBairro = " + cod;
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                BairroBeans beans = new BairroBeans();
                beans.setIdBairro(rs.getInt("idBairro"));
                beans.setNomeBairro(rs.getString("nomeBairro"));
                return beans;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Erro ao buscar Bairro!");
        }
        return null;
    }
}
