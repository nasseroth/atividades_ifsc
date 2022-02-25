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
import model.beans.CidadeBeans;
import model.beans.EnderecoBeans;

/**
 *
 * @author Nasser-Othman
 */
public class DaoEndereco {

    EnderecoBeans enderecoBeans = new EnderecoBeans();
    private Connection connection;
    private int resposta = 0;

    public DaoEndereco() {
        connection = SingleConnection.getConnection();
    }

    public void inserirEndereco(EnderecoBeans beans) {
        try {
            String sql = "insert into endereco(cep, logradouroCep, idBairro, idCidade)"
                    + "values (?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, beans.getCep());
            ps.setString(2, beans.getLogradouroCep());
            ps.setInt(3, beans.getBairro().getIdBairro());
            ps.setInt(4, beans.getCidade().getIdCidade());
            ps.execute();
            connection.setAutoCommit(false);
            connection.commit();
            JOptionPane.showMessageDialog(null, "Dados Salvos com Sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Oops\nErro ao Salvar Dados!");
        }
    }

    public List<EnderecoBeans> listarEndereco() {
        List<EnderecoBeans> lista = new ArrayList<EnderecoBeans>();
        try {
            String sql = "select * from endereco";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                EnderecoBeans beans = new EnderecoBeans();
                beans.setIdCep(rs.getInt("idCep"));
                beans.setCep(rs.getString("cep"));
                beans.setLogradouroCep(rs.getString("logradouroCep"));
                beans.setBairro(new BairroBeans(rs.getInt("idBairro")));
                beans.setCidade(new CidadeBeans(rs.getInt("idCidade")));
                lista.add(beans);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao Listar Dados!");
        }
        return lista;
    }

    public void actualizarEndereco(EnderecoBeans beans) {
        try {
            String sql = "update endereco set cep = ?, logradouroCep = ?, idBairro = ?, idCidade = ? where idCep = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, beans.getCep());
            ps.setString(2, beans.getLogradouroCep());
            ps.setInt(3, beans.getBairro().getIdBairro());
            ps.setInt(4, beans.getCidade().getIdCidade());
            ps.setInt(5, beans.getIdCep());
            ps.execute();
            connection.commit();
            JOptionPane.showMessageDialog(null, "Dados Editados com Sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao Editar Dados!");
        }
    }

    public void excluirEndereco(EnderecoBeans beans) {
        try {
            String sql = "delete from endereco where idCep = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, beans.getIdCep());
            ps.execute();
            connection.commit();
            JOptionPane.showMessageDialog(null, "Dados Excluidos com Sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao Excluir Dados!\n"+ex.getMessage());
        }
    }

    public EnderecoBeans consultaEndereco(int cod) {
        try {
            String sql = "select * from endereco where idCep = " + cod;
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                EnderecoBeans beans = new EnderecoBeans();
                beans.setIdCep(rs.getInt("idCep"));
                beans.setCep(rs.getString("cep"));
                beans.setLogradouroCep(rs.getString("logradouroCep"));
                beans.setBairro(new BairroBeans(rs.getInt("idBairro")));
                beans.setCidade(new CidadeBeans(rs.getInt("idCidade")));
                return beans;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Endereco!");
        }
        return null;
    }
}
