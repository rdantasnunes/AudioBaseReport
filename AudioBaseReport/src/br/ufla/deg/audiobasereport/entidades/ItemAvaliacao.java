package br.ufla.deg.audiobasereport.entidades;

/**
 * Federal University of Lavras - Lavras - MG - Brazil
 * Engineering Department
 * Post graduate program in System Engineering and Automation
 * @author Rodrigo Dantas Nunes
 *         Teacher Advisor Dsc. Demóstenes Zegarra Rodríguez
 * @since 2015
 * @version 1.0
 * Copyrigth© Rodrigo Dantas Nunes
 */

public class ItemAvaliacao {

    private Integer id;
    
    private String nomeArquivo;
    
    private Float pesqMos;
    
    private Float mos563;
    
    private Float taxaPerda;
    
    private Avaliacao avaliacao;

    public ItemAvaliacao(String nomeArquivo, Float pesqMos, Float mos563,Float taxaPerda, 
            Avaliacao avaliacao) {
        this.nomeArquivo = nomeArquivo;
        this.pesqMos = pesqMos;
        this.mos563 = mos563;
        this.taxaPerda = taxaPerda;
        this.avaliacao = avaliacao;
    }

    public ItemAvaliacao() {
    }
    
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nomeArquivo
     */
    public String getNomeArquivo() {
        return nomeArquivo;
    }

    /**
     * @param nomeArquivo the nomeArquivo to set
     */
    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    /**
     * @return the pesqMos
     */
    public Float getPesqMos() {
        return pesqMos;
    }

    /**
     * @param pesqMos the pesqMos to set
     */
    public void setPesqMos(Float pesqMos) {
        this.pesqMos = pesqMos;
    }

    /**
     * @return the mos563
     */
    public Float getMos563() {
        return mos563;
    }

    /**
     * @param mos563 the mos563 to set
     */
    public void setMos563(Float mos563) {
        this.mos563 = mos563;
    }
    
    /**
     * @return the taxaPerda
     */
    public Float getTaxaPerda() {
        return taxaPerda;
    }

    /**
     * @param taxaPerda the taxaPerda to set
     */
    public void setTaxaPerda(Float taxaPerda) {
        this.taxaPerda = taxaPerda;
    }

    /**
     * @return the avaliacao
     */
    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    /**
     * @param avaliacao the avaliacao to set
     */
    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }
    
}