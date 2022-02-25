package model.dao;

import connection.SingleConnection;
import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.beans.ClienteBeans;
import model.beans.EnderecoBeans;

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
            String sql = "insert into cliente(nomeCliente, dtNasCliente, cpfCliente,"
                    + " rgCliente, foneCliente, fone2Cliente, emailCliente,"
                    + "compleEnderecoCliente, idCep) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setString(1, beans.getNomeCliente());
            java.sql.Date d = new java.sql.Date (beans.getDtNasCliente().getTime());
            pst.setDate(2, d);
            pst.setString(3, beans.getCpfCliente());
            pst.setString(4, beans.getRgCliente());
            pst.setString(5, beans.getFoneCliente());
            pst.setString(6, beans.getFone2Cliente());
            pst.setString(7, beans.getEmailCliente());
            pst.setString(8, beans.getCompleEnderecoCliente());
            pst.setInt(9, beans.getCep().getIdCep());
            
            pst.execute();
            connection.commit();
            JOptionPane.showMessageDialog(null, "Cliente Salvo com Sucesso");
        } catch (SQLException ex) {
            System.out.println(ex);
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
                beans.setNomeCliente(rs.getString("nomeCliente"));
                beans.setDtNasCliente(rs.getDate("dtNasCliente"));
                beans.setCpfCliente(rs.getString("cpfCliente"));
                beans.setRgCliente(rs.getString("rgCliente"));
                beans.setFoneCliente(rs.getString("foneCliente"));
                beans.setFone2Cliente(rs.getString("fone2Cliente"));
                beans.setEmailCliente(rs.getString("emailCliente"));
                beans.setCompleEnderecoCliente(rs.getString("compleEnderecoCliente"));
                beans.setCep(new EnderecoBeans(rs.getInt("idCep")));
                
                lista.add(beans);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao listar cliente");
        }
        return lista;
    }

    //Metodo para a actualizacao de dados
    public void actualizarCliente(ClienteBeans beans) {
        try {
            String sql = "update cliente set nomeCliente = ?, dtNasCliente = ?, cpfCliente = ?,"
                    + "rgCliente = ?, foneCliente = ?, fone2Cliente = ?, emailCliente = ?, compleEnderecoCliente = ?,"
                    + "idCep = ? where idCliente = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, beans.getNomeCliente());
            ps.setDate(2, new Date(beans.getDtNasCliente().getTime()));
            ps.setString(3, beans.getCpfCliente());
            ps.setString(4, beans.getRgCliente());
            ps.setString(5, beans.getFoneCliente());
            ps.setString(6, beans.getFone2Cliente());
            ps.setString(7, beans.getEmailCliente());
            ps.setString(8, beans.getCompleEnderecoCliente());
            ps.setInt(9, beans.getCep().getIdCep());
            

            ps.setInt(10, beans.getIdCliente());
            ps.execute();
            connection.commit();
            JOptionPane.showMessageDialog(null, "Dados Editados com Sucesso");
        } catch (SQLException ex) {
            System.out.println(ex);
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
            String sql = "select *from cliente where idCliente ='"+cod+"'";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                ClienteBeans beans = new ClienteBeans();
                beans.setIdCliente(rs.getInt("idCliente"));
                beans.setNomeCliente(rs.getString("nomeCliente"));
                beans.setDtNasCliente(rs.getDate("dtNasCliente"));
                beans.setCpfCliente(rs.getString("cpfCliente"));
                beans.setRgCliente(rs.getString("rgCliente"));
                beans.setFoneCliente(rs.getString("foneCliente"));
                beans.setFone2Cliente(rs.getString("fone2Cliente"));
                beans.setEmailCliente(rs.getString("emailCliente"));
                beans.setCompleEnderecoCliente(rs.getString("compleEnderecoCliente"));
                beans.setCep(new EnderecoBeans(rs.getInt("idCep")));
                idCliente = rs.getInt("idCliente");
                return beans;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Cliente");
        }
        return null;
    }
}
