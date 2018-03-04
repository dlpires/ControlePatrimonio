/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Matheus Henrique
 */
public class PatrimonioDAO {
     /* private void load(Patrimonio patrimonio){
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try{
			stmt = con.prepareStatement("SELECT * FROM patrimonio WHERE cod_patrimonio = ?");
			stmt.setInt(1, patrimonio.getCodPatrimonio());
			rs = stmt.executeQuery();
			rs.next();
			patrimonio.setNumProcEntrada(rs.getInt("num_proc_entrada"));
			patrimonio.setNumNotaFiscal(rs.getInt("num_nota_fiscal"));
			patrimonio.setNomePatrimonio(rs.getString("nome_patrimonio"));
			patrimonio.setMarcaPatrimonio(rs.getString("marca_patrimonio"));
			patrimonio.setModeloPatrimonio(rs.getString("modelo_patrimonio"));
			patrimonio.setNumSeriePatrimonio(rs.getInt("num_serie_patrimonio"));
			patrimonio.setValorPatrimonio(rs.getFloat("valor_patrimonio"));
			patrimonio.setModAquPatrimonio(rs.getString("mod_aqu_patrimonio"));
			patrimonio.setLocalPatrimonio(rs.getString("local_patrimonio"));
			patrimonio.setBaixaPatrimonio(rs.getBoolean("baixa_patrimonio"));
		} catch (SQLException ex) {
			FxDialogs.showException("Erro de Leitura!", getClass().getSimpleName() + " - " + ex.getMessage(), ex);
		}
		finally{
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
	}

	public static ArrayList<Patrimonio> readAll(){
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<Patrimonio> patrimoniosList = new ArrayList<>();
		try{
			stmt = con.prepareStatement("SELECT cod_patrimonio FROM patrimonio");
			rs = stmt.executeQuery();
			while(rs.next()){
				Patrimonio patrimonio = new Patrimonio(rs.getInt("cod_patrimonio"));
				patrimoniosList.add(patrimonio);
			}
		} catch (SQLException ex) {
			FxDialogs.showException("Erro de Leitura!", getClass().getSimpleName() + " - " + ex.getMessage(), ex);
		}
		finally{
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return patrimoniosList;
	}

	public void save(Patrimonio patrimonio){
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		try{
			stmt = con.prepareStatement("UPDATE patrimonio SET  num_proc_entrada = ?, num_nota_fiscal = ?, nome_patrimonio = ?, marca_patrimonio = ?, modelo_patrimonio = ?, num_serie_patrimonio = ?, valor_patrimonio = ?, mod_aqu_patrimonio = ?, local_patrimonio = ?, baixa_patrimonio = ? WHERE cod_patrimonio= ?");
			stmt.setInt(1, patrimonio.getNumProcEntrada());
			stmt.setInt(2, patrimonio.getNumNotaFiscal());
			stmt.setString(3, patrimonio.getNomePatrimonio());
			stmt.setString(4, patrimonio.getMarcaPatrimonio());
			stmt.setString(5, patrimonio.getModeloPatrimonio());
			stmt.setInt(6, patrimonio.getNumSeriePatrimonio());
			stmt.setFloat(7, patrimonio.getValorPatrimonio());
			stmt.setString(8, patrimonio.getModAquPatrimonio());
			stmt.setString(9, patrimonio.getLocalPatrimonio());
			stmt.setBoolean(10, patrimonio.getBaixaPatrimonio());
			stmt.setInt(11, patrimonio.getCodPatrimonio());
			stmt.executeUpdate();
		} catch (SQLException ex) {
			FxDialogs.showException("Erro de Atualização!", getClass().getSimpleName() + " - " + ex.getMessage(), ex);
		}
		finally{
			ConnectionFactory.closeConnection(con, stmt);
		}
	}

	public void create(Patrimonio patrimonio){
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		try{
			stmt = con.prepareStatement("INSERT INTO patrimonio (num_proc_entrada,num_nota_fiscal,nome_patrimonio,marca_patrimonio,modelo_patrimonio,num_serie_patrimonio,valor_patrimonio,mod_aqu_patrimonio,local_patrimonio,baixa_patrimonio) VALUES (?,?,?,?,?,?,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
			stmt.setInt(1, patrimonio.getNumProcEntrada());
			stmt.setInt(2, patrimonio.getNumNotaFiscal());
			stmt.setString(3, patrimonio.getNomePatrimonio());
			stmt.setString(4, patrimonio.getMarcaPatrimonio());
			stmt.setString(5, patrimonio.getModeloPatrimonio());
			stmt.setInt(6, patrimonio.getNumSeriePatrimonio());
			stmt.setFloat(7, patrimonio.getValorPatrimonio());
			stmt.setString(8, patrimonio.getModAquPatrimonio());
			stmt.setString(9, patrimonio.getLocalPatrimonio());
			stmt.setBoolean(10, patrimonio.getBaixaPatrimonio());
			stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
			LAST_ID_INSERT = rs.next() ? rs.getInt(1) : -1;
			patrimonio.setCodPatrimonio(LAST_ID_INSERT);
		} catch (SQLException ex) {
			FxDialogs.showException("Erro de Gravação! ", getClass().getSimpleName() + " - " + ex.getMessage(), ex);
		}
		finally{
			ConnectionFactory.closeConnection(con, stmt);
		}
	}

	public void delete(Patrimonio patrimonio){
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		try{
			stmt = con.prepareStatement("DELETE FROM patrimonio WHERE cod_patrimonio = ?");
			stmt.setInt(1, patrimonio.getCodPatrimonio());
			stmt.executeUpdate();
		} catch (SQLException ex) {
			FxDialogs.showException("Erro de Exclusão!", getClass().getSimpleName() + " - " + ex.getMessage(), ex);
		}
		finally{
			ConnectionFactory.closeConnection(con, stmt);
		}
	}*/
}
