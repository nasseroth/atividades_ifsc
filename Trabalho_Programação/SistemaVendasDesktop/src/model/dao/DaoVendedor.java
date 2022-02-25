package model.dao;

import connection.SingleConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.beans.VendedorBeans;

/**
 *
 * @author Nasser-Othman
 */
public class DaoVendedor {

    VendedorBeans vendedorBeans = new VendedorBeans();
    private Connection connection;

    public DaoVendedor() {
        connection = SingleConnection.getConnection();
    }

    public void inserirVendedor(VendedorBeans beans) {
        try {
            String sql = "insert into vendedor(nomeUsuario, codVendedor,"
                    + "nomeVendedor, telefoneVendedor, estado) values(?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, beans.getNomeUsuario());
            ps.setString(2, beans.getCodVendedor());
            ps.setString(3, beans.getNomeVendedor());
            ps.setString(4, beans.getTelefoneVendedor());
            ps.setString(5, beans.getEstadoVendedor());
            ps.execute();
            connection.commit();
            JOptionPane.showMessageDialog(null, "Dados Salvos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao salvar Vendedor!!!");
        }
    }

    public List<VendedorBeans> listarVendedor() {
        List<VendedorBeans> lista = new ArrayList<VendedorBeans>();
        try {
            String sql = "select * from vendedor";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                VendedorBeans vendedorBeans = new VendedorBeans();
                vendedorBeans.setIdVendedor(rs.getInt("idVendedor"));
                vendedorBeans.setNomeUsuario(rs.getString("nomeUsuario"));
                vendedorBeans.setCodVendedor(rs.getString("codVendedor"));
                vendedorBeans.setNomeVendedor(rs.getString("nomeVendedor"));
                vendedorBeans.setTelefoneVendedor(rs.getString("telefoneVendedor"));
                vendedorBeans.setEstadoVendedor(rs.getString("estado"));
                lista.add(vendedorBeans);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao Listar Vendedor!");
        }
        return lista;
    }

    public void actualizaVendedor(VendedorBeans beans) {
        try {
            String sql = "update vendedor set nomeUsuario = ?, codVendedor = ?,"
                    + "nomeVendedor = ?, telefoneVendedor = ?, estado = ? where idVendedor = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, beans.getNomeUsuario());
            ps.setString(2, beans.getCodVendedor());
            ps.setString(3, beans.getNomeVendedor());
            ps.setString(4, beans.getTelefoneVendedor());
            ps.setString(5, beans.getEstadoVendedor());
            ps.setInt(6, beans.getIdVendedor());
            ps.execute();
            connection.commit();
            JOptionPane.showMessageDialog(null, "Dados Editados com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao Editar Dados!\n" + ex.getMessage());
        }

    }

    public void excluirVendedor(VendedorBeans beans) {
        try {
            String sql = "delete from vendedor where idVendedor = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, beans.getIdVendedor());
            ps.execute();
            connection.commit();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao Excluir Dados!\n"+ex.getMessage());
        }
    }

    public boolean validaNomeUsuario(String nomeUsuario) {
        try {
            String sql = "select count(1) as quant from vendedor where nomeUsuario = '" + nomeUsuario + "'";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("quant") <= 0;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao verificar Dados!");
        }
        return false;
    }

    public boolean validaNomeUsuarioUpdate(String nomeUsuario, int id) {
        try {
            String sql = "select count(1) as quant from vendedor where nomeUsuario = '" + nomeUsuario + "'"
                    + "and idVendedor <> " + id;
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("quant") <= 0;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao verificar Dados!");
        }
        return false;
    }

    public boolean validaCodVendedor(String cod) {
        try {
            String sql = "select count(1) as quant from vendedor where codVendedor = '" + cod + "'";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("quant") <= 0;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao verificar Dados!");
        }
        return false;
    }

    public boolean validaCodVendedorUpdate(String cod, int id) {
        try {
            String sql = "select count(1) as quant from vendedor where codVendedor = '" + cod + "'"
                    + "and idVendedor <> " + id;
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("quant") <= 0;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Oops!\nErro ao verificar Dados");
        }
        return false;
    }

    public VendedorBeans consultaVendedor(int id) {
        try {
            String sql = "select *from vendedor where idVendedor = " + id;
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                VendedorBeans vendedorBeans = new VendedorBeans();
                vendedorBeans.setIdVendedor(rs.getInt("idVendedor"));
                vendedorBeans.setNomeUsuario(rs.getString("nomeUsuario"));
                vendedorBeans.setCodVendedor(rs.getString("codVendedor"));
                vendedorBeans.setNomeVendedor(rs.getString("nomeVendedor"));
                vendedorBeans.setTelefoneVendedor(rs.getString("telefoneVendedor"));
                vendedorBeans.setEstadoVendedor(rs.getString("estado"));
                return vendedorBeans;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Cliente");
        }
        return null;
    }

    public String idVendedor() {
        String idVendedor = "";
        try {
            String sql = "select max(idVendedor) from vendedor";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                idVendedor = rs.getString(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro\n" + ex.getMessage());
        }
        return idVendedor;
    }
}
