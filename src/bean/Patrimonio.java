/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import dao.PatrimonioDAO;

/**
 *
 * @author dlpires
 */
public class Patrimonio {

    //ATRIBUTOS
    
    private int CodPatrimonio;
    private int NumProcEntrada;
    private int NumNotaFiscal;
    private String NomePatrimonio;
    private String MarcaPatrimonio;
    private String ModeloPatrimonio;
    private int NumSeriePatrimonio;
    private String DescricaoPatrimonio;
    private float ValorPatrimonio;
    private String ModAquPatrimonio;
    private String LocalPatrimonio;
    private boolean BaixaPatrimonio;

    public Patrimonio() {
    }
    
    /**
     * @return the CodPatrimonio
     */
    public int getCodPatrimonio() {
        return CodPatrimonio;
    }

    /**
     * @param CodPatrimonio the CodPatrimonio to set
     */
    public void setCodPatrimonio(int CodPatrimonio) {
        this.CodPatrimonio = CodPatrimonio;
    }

    /**
     * @return the NumProcEntrada
     */
    public int getNumProcEntrada() {
        return NumProcEntrada;
    }

    /**
     * @param NumProcEntrada the NumProcEntrada to set
     */
    public void setNumProcEntrada(int NumProcEntrada) {
        this.NumProcEntrada = NumProcEntrada;
    }

    /**
     * @return the NumNotaFiscal
     */
    public int getNumNotaFiscal() {
        return NumNotaFiscal;
    }

    /**
     * @param NumNotaFiscal the NumNotaFiscal to set
     */
    public void setNumNotaFiscal(int NumNotaFiscal) {
        this.NumNotaFiscal = NumNotaFiscal;
    }

    /**
     * @return the NomePatrimonio
     */
    public String getNomePatrimonio() {
        return NomePatrimonio;
    }

    /**
     * @param NomePatrimonio the NomePatrimonio to set
     */
    public void setNomePatrimonio(String NomePatrimonio) {
        this.NomePatrimonio = NomePatrimonio;
    }

    /**
     * @return the MarcaPatrimonio
     */
    public String getMarcaPatrimonio() {
        return MarcaPatrimonio;
    }

    /**
     * @param MarcaPatrimonio the MarcaPatrimonio to set
     */
    public void setMarcaPatrimonio(String MarcaPatrimonio) {
        this.MarcaPatrimonio = MarcaPatrimonio;
    }

    /**
     * @return the ModeloPatrimonio
     */
    public String getModeloPatrimonio() {
        return ModeloPatrimonio;
    }

    /**
     * @param ModeloPatrimonio the ModeloPatrimonio to set
     */
    public void setModeloPatrimonio(String ModeloPatrimonio) {
        this.ModeloPatrimonio = ModeloPatrimonio;
    }

    /**
     * @return the NumSeriePatrimonio
     */
    public int getNumSeriePatrimonio() {
        return NumSeriePatrimonio;
    }

    /**
     * @param NumSeriePatrimonio the NumSeriePatrimonio to set
     */
    public void setNumSeriePatrimonio(int NumSeriePatrimonio) {
        this.NumSeriePatrimonio = NumSeriePatrimonio;
    }

    /**
     * @return the DescricaoPatrimonio
     */
    public String getDescricaoPatrimonio() {
        return DescricaoPatrimonio;
    }

    /**
     * @param DescricaoPatrimonio the DescricaoPatrimonio to set
     */
    public void setDescricaoPatrimonio(String DescricaoPatrimonio) {
        this.DescricaoPatrimonio = DescricaoPatrimonio;
    }

    /**
     * @return the ValorPatrimonio
     */
    public float getValorPatrimonio() {
        return ValorPatrimonio;
    }

    /**
     * @param ValorPatrimonio the ValorPatrimonio to set
     */
    public void setValorPatrimonio(float ValorPatrimonio) {
        this.ValorPatrimonio = ValorPatrimonio;
    }

    /**
     * @return the ModAquPatrimonio
     */
    public String getModAquPatrimonio() {
        return ModAquPatrimonio;
    }

    /**
     * @param ModAquPatrimonio the ModAquPatrimonio to set
     */
    public void setModAquPatrimonio(String ModAquPatrimonio) {
        this.ModAquPatrimonio = ModAquPatrimonio;
    }

    /**
     * @return the LocalPatrimonio
     */
    public String getLocalPatrimonio() {
        return LocalPatrimonio;
    }

    /**
     * @param LocalPatrimonio the LocalPatrimonio to set
     */
    public void setLocalPatrimonio(String LocalPatrimonio) {
        this.LocalPatrimonio = LocalPatrimonio;
    }

    /**
     * @return the BaixaPatrimonio
     */
    public boolean isBaixaPatrimonio() {
        return BaixaPatrimonio;
    }

    /**
     * @param BaixaPatrimonio the BaixaPatrimonio to set
     */
    public void setBaixaPatrimonio(boolean BaixaPatrimonio) {
        this.BaixaPatrimonio = BaixaPatrimonio;
    }
    
    //MÉTODOS 
    
    public void Cadastrar(){
        PatrimonioDAO.create(this);
    }
    
    public Patrimonio Consultar(){
        return PatrimonioDAO.load(this);
    }
    
    public void Alterar(){
        PatrimonioDAO.update(this);
    }
    
    public void Excluir(){
        PatrimonioDAO.delete(this);
    }
    
    public ArrayList<Patrimonio>  GerarRelatorio(){
        return PatrimonioDAO.readAll();
    }
    
    public void GerarRelatorioBaixa(){
        
    }
}
