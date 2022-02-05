package model.dao;

import connection.SingleConnection;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.beans.ClienteBeans;

/**
 *
 * @author Nasser-Othman
 */
public class DaoCliente {

    private Connection connection;
    public static int idCliente;

    public DaoCliente() {
        connection = SingleConnection.getConnection();
    }

    //Metodo para salvar os dados na base de dados 
    public void salvarCliente(ClienteBeans beans) {
        try {
            String sql = "insert into cliente(codCliente, biCliente, nomeCliente,"
                    + " enderecoCliente, estadoCliente) values(?,?,?,?,?)";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, beans.getCodCliente());
            pst.setString(2, beans.getBiCliente());
            pst.setString(3, beans.getNomeCliente());
            pst.setString(4, beans.getEnderecoCliente());
            pst.setString(5, beans.getEstadoCliente());
            pst.execute();
            connection.commit();
            JOptionPane.showMessageDialog(null, "Cliente Salvo com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao salvar cliente");
        }
    }

    //Metodo de consulta para listar os dados   
    public List<ClienteBeans> listarCliente() {
        List<ClienteBeans> lista = new ArrayList<ClienteBeans>();
        try {
            String sql = "select * from cliente";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ClienteBeans beans = new ClienteBeans();
                beans.setIdCliente(rs.getInt("idCliente"));
                beans.setCodCliente(rs.getString("codCliente"));
                beans.setBiCliente(rs.getString("biCliente"));
                beans.setNomeCliente(rs.getString("nomeCliente"));
                beans.setEnderecoCliente(rs.getString("enderecoCliente"));
                beans.setEstadoCliente(rs.getString("estadoCliente"));
                lista.add(beans);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao listar cliente");
        }
        return lista;
    }

    //Metodo para a actualizacao de dados
    public void actualizarCliente(ClienteBeans beans) {
        try {
            String sql = "update cliente set codCliente = ?, biCliente = ?, nomeCliente = ?,"
                    + "enderecoCliente = ?, estadoCliente = ? where idCliente = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, beans.getCodCliente());
            ps.setString(2, beans.getBiCliente());
            ps.setString(3, beans.getNomeCliente());
            ps.setString(4, beans.getEnderecoCliente());
            ps.setString(5, beans.getEstadoCliente());
            ps.setInt(6, beans.getIdCliente());
            ps.execute();
            connection.commit();
            JOptionPane.showMessageDialog(null, "Dados Editados com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao actualizar cliente!!!");
        }

    }

    //Metodo para a exclusao de dados
    public void excluirCliente(ClienteBeans beans) {
        try {
            String sql = "delete from cliente where idCliente = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, beans.getIdCliente());
            ps.execute();
            connection.commit();
            JOptionPane.showMessageDialog(null, "Dados Excluidos com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao Excluir Cliente!!!\n"+ex.getMessage());
        }
    }

    //Metodo responsavel por verificar se ja existe o codigo inserido 
    public boolean validaCodigo(String cod) {
        try {
            String sql = "select count(1) as quant from cliente where codCliente = '" + cod + "'";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("quant") <= 0;
            }
            //JOptionPane.showMessageDialog(null, "Oops!\nCodigo ja existe, Tente Outro!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\n Erro ao verificar dados");
        }
        return false;
    }

    //O mesmo que o metodo acima mas verifica na  
    public boolean validaCodigoUpdate(String cod, int id) {
        try {
            String sql = "select count(1) as quant from cliente where codCliente = '" + cod + "'"
                    + "and idCliente <> " + id;
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("quant") <= 0;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao verificar dados");
        }
        return false;
    }
    
    public ClienteBeans consultaCliente(String cod){
        try {
            String sql = "select *from cliente where codCliente ='"+cod+"'";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                ClienteBeans beans = new ClienteBeans();
                beans.setIdCliente(rs.getInt("idCliente"));
                beans.setCodCliente(rs.getString("codCliente"));
                beans.setBiCliente(rs.getString("biCliente"));
                beans.setNomeCliente(rs.getString("nomeCliente"));
                beans.setEnderecoCliente(rs.getString("enderecoCliente"));
                beans.setEstadoCliente(rs.getString("estadoCliente"));
                idCliente = rs.getInt("idCliente");
                return beans;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Cliente");
        }
        return null;
    }
}
