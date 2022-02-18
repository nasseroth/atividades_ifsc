package model.dao;

import connection.SingleConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.beans.CidadeBeans;

/**
 *
 * @author Nasser-Othman
 */
public class DaoCidade {

    CidadeBeans cidadeBeans = new CidadeBeans();
    private Connection connection;
    private int resposta = 0;

    public DaoCidade() {
        connection = SingleConnection.getConnection();
    }

    public void inserirCidade(CidadeBeans beans) {
        try {
            String sql = "insert into cidade(nomeCidade, ufCidade)"
                    + "values (?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, beans.getNomeCidade());
            ps.setString(2, beans.getUfCidade());
            ps.execute();
            connection.setAutoCommit(false);
            connection.commit();
            JOptionPane.showMessageDialog(null, "Dados Salvos com Sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Oops\nErro ao Salvar Dados!");
        }
    }

    public List<CidadeBeans> listarCidade() {
        List<CidadeBeans> lista = new ArrayList<CidadeBeans>();
        try {
            String sql = "select * from cidade";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CidadeBeans beans = new CidadeBeans();
                beans.setIdCidade(rs.getInt("idCidade"));
                beans.setNomeCidade(rs.getString("nomeCidade"));
                beans.setUfCidade(rs.getString("ufCidade"));
                lista.add(beans);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao Listar Dados!");
        }
        return lista;
    }

    public void actualizarCidade(CidadeBeans beans) {
        try {
            String sql = "update cidade set nomeCidade = ?, ufCidade = ? where idCidade = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, beans.getNomeCidade());
            ps.setString(2, beans.getUfCidade());
            ps.setString(3, String.valueOf(beans.getIdCidade()));
            ps.execute();
            connection.commit();
            JOptionPane.showMessageDialog(null, "Dados Editados com Sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao Editar Dados!");
        }
    }

    public void excluirCidade(CidadeBeans beans) {
        try {
            String sql = "delete from cidade where idCidade = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, beans.getIdCidade());
            ps.execute();
            connection.commit();
            JOptionPane.showMessageDialog(null, "Dados Excluidos com Sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao Excluir Dados!\n"+ex.getMessage());
        }
    }

    public boolean validaNomeCidade(String nomeProd) {
        try {
            String sql = "select count(1) as quant from cidade where nomeCidade = '" + nomeProd + "'";
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

    public boolean validaNomeCidadeUpdate(String nomeProd, int id) {
        try {
            String sql = "select count(1) as quant from cidade where nomeCidade = '" + nomeProd + "'"
                    + "and idCidade <> " + id;
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

    public CidadeBeans consultaCidade(int cod) {
        try {
            String sql = "select * from cidade where idCidade = " + cod;
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                CidadeBeans beans = new CidadeBeans();
                beans.setIdCidade(rs.getInt("idCidade"));
                beans.setNomeCidade(rs.getString("nomeCidade"));
                beans.setUfCidade(rs.getString("ufCidade"));
                return beans;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Cidade!");
        }
        return null;
    }
}
