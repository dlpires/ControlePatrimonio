/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import bean.Patrimonio;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matheus Henrique
 */
public class PatrimonioDAO {

    public static Patrimonio load(Patrimonio patrimonio) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT * FROM patrimonio WHERE cod_patrimonio = ? OR num_proc_entrada = ? OR nome_patrimonio = ?");
            stmt.setInt(1, patrimonio.getCodPatrimonio());
            stmt.setInt(2, patrimonio.getNumProcEntrada());
            stmt.setString(3, patrimonio.getNomePatrimonio());
            rs = stmt.executeQuery();
            rs.next();
            return PatrimonioDAO.createInstance(rs);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Leitura: " + ex.getMessage());
            return null;
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    }
    
    public static boolean exists(Patrimonio patrimonio) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        boolean valid = false;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM patrimonio WHERE cod_patrimonio = ? OR num_proc_entrada = ? OR nome_patrimonio = ?");
            stmt.setInt(1, patrimonio.getCodPatrimonio());
            stmt.setInt(2, patrimonio.getNumProcEntrada());
            stmt.setString(3, patrimonio.getNomePatrimonio());
            rs = stmt.executeQuery();
            while(rs.next()){
                valid = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Leitura: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return valid;
    }

    public static ArrayList<Patrimonio> readAll() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Patrimonio> patrimoniosList = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM patrimonio");
            rs = stmt.executeQuery();
            while (rs.next()) {
                patrimoniosList.add(PatrimonioDAO.createInstance(rs));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Leitura: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return patrimoniosList;
    }
    
    public static int countRows(int statusBaixa) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int count = 0;
        try {
            stmt = con.prepareStatement("SELECT * FROM patrimonio WHERE baixa_patrimonio = ?");
            stmt.setInt(1, statusBaixa);
            rs = stmt.executeQuery();
            while (rs.next()) {
                count++;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Leitura: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return count;
    }
    
    public static DefaultTableModel readAll(int statusBaixa, DefaultTableModel aModel) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Object[] patrimoniosList = null;
        try {
            stmt = con.prepareStatement("SELECT cod_patrimonio,num_proc_entrada,num_nota_fiscal,nome_patrimonio,marca_patrimonio,modelo_patrimonio,num_serie_patrimonio,descricao_patrimonio,mod_aqu_patrimonio,valor_patrimonio,local_patrimonio FROM patrimonio WHERE baixa_patrimonio = ?");
            stmt.setInt(1, statusBaixa);
            rs = stmt.executeQuery();
            
            patrimoniosList = new Object[rs.getMetaData().getColumnCount()];
            while (rs.next()) {
                for(int i = 0; i < rs.getMetaData().getColumnCount(); i++){
                    patrimoniosList[i] = rs.getObject(i+1);
                }
                aModel.addRow(patrimoniosList);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Leitura: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return aModel;
    }
    
    public static void update(Patrimonio patrimonio) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE patrimonio SET  num_proc_entrada = ?, num_nota_fiscal = ?, nome_patrimonio = ?, marca_patrimonio = ?, modelo_patrimonio = ?, descricao_patrimonio = ?, num_serie_patrimonio = ?, valor_patrimonio = ?, mod_aqu_patrimonio = ?, local_patrimonio = ?, baixa_patrimonio = ? WHERE cod_patrimonio= ?");
            stmt.setInt(1, patrimonio.getNumProcEntrada());
            stmt.setInt(2, patrimonio.getNumNotaFiscal());
            stmt.setString(3, patrimonio.getNomePatrimonio());
            stmt.setString(4, patrimonio.getMarcaPatrimonio());
            stmt.setString(5, patrimonio.getModeloPatrimonio());
            stmt.setString(6, patrimonio.getDescricaoPatrimonio());
            stmt.setInt(7, patrimonio.getNumSeriePatrimonio());
            stmt.setFloat(8, patrimonio.getValorPatrimonio());
            stmt.setString(9, patrimonio.getModAquPatrimonio());
            stmt.setString(10, patrimonio.getLocalPatrimonio());
            stmt.setBoolean(11, patrimonio.isBaixaPatrimonio());
            stmt.setInt(12, patrimonio.getCodPatrimonio());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Atualização: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public static void create(Patrimonio patrimonio) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO patrimonio (num_proc_entrada,num_nota_fiscal,nome_patrimonio,marca_patrimonio,modelo_patrimonio,descricao_patrimonio,num_serie_patrimonio,valor_patrimonio,mod_aqu_patrimonio,local_patrimonio,baixa_patrimonio) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, patrimonio.getNumProcEntrada());
            stmt.setInt(2, patrimonio.getNumNotaFiscal());
            stmt.setString(3, patrimonio.getNomePatrimonio());
            stmt.setString(4, patrimonio.getMarcaPatrimonio());
            stmt.setString(5, patrimonio.getModeloPatrimonio());
            stmt.setString(6, patrimonio.getDescricaoPatrimonio());
            stmt.setInt(7, patrimonio.getNumSeriePatrimonio());
            stmt.setFloat(8, patrimonio.getValorPatrimonio());
            stmt.setString(9, patrimonio.getModAquPatrimonio());
            stmt.setString(10, patrimonio.getLocalPatrimonio());
            stmt.setBoolean(11, patrimonio.isBaixaPatrimonio());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Gravação: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public static void delete(Patrimonio patrimonio) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM patrimonio WHERE cod_patrimonio = ?");
            stmt.setInt(1, patrimonio.getCodPatrimonio());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Exclusão: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public static Patrimonio createInstance(ResultSet result) {
        Patrimonio patrimonio = new Patrimonio();

        try {
            patrimonio.setCodPatrimonio(result.getInt("cod_patrimonio"));
            patrimonio.setNumProcEntrada(result.getInt("num_proc_entrada"));
            patrimonio.setNumNotaFiscal(result.getInt("num_nota_fiscal"));
            patrimonio.setNomePatrimonio(result.getString("nome_patrimonio"));
            patrimonio.setMarcaPatrimonio(result.getString("marca_patrimonio"));
            patrimonio.setModeloPatrimonio(result.getString("modelo_patrimonio"));
            patrimonio.setDescricaoPatrimonio(result.getString("descricao_patrimonio"));
            patrimonio.setNumSeriePatrimonio(result.getInt("num_serie_patrimonio"));
            patrimonio.setValorPatrimonio(result.getFloat("valor_patrimonio"));
            patrimonio.setModAquPatrimonio(result.getString("mod_aqu_patrimonio"));
            patrimonio.setLocalPatrimonio(result.getString("local_patrimonio"));
            patrimonio.setBaixaPatrimonio(result.getBoolean("baixa_patrimonio"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao criar instância de Patrimônio: " + ex.getMessage());
        }

        return patrimonio;
    }
}
