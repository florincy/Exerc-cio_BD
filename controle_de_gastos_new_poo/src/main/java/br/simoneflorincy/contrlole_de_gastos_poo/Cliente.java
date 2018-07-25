/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.simoneflorincy.contrlole_de_gastos_poo;
import javax.persistence.*;
 
/**
 *
 * @author User
 */
@Entity
@Table (name="cliente")
public class Cliente {

    /**
     * @return the codIdentificacao
     */
    @Id
    public String getCodIdentificacao() {
        return codIdentificacao;
    }

    /**
     * @param codIdentificacao the codIdentificacao to set
     */
    
    public void setCodIdentificacao(String codIdentificacao) {
        this.codIdentificacao = codIdentificacao;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the nomeFantasia
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * @param nomeFantasia the nomeFantasia to set
     */
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    /**
     * @return the razaoSocial
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * @param razaoSocial the razaoSocial to set
     */
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    /**
     * @return the tipoCliente
     */
    public String getTipoCliente() {
        return tipoCliente;
    }

    /**
     * @param tipoCliente the tipoCliente to set
     */
    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    /**
     * @return the enderecoDoCliente
     */
    public Endereco getEnderecoDoCliente() {
        return enderecoDoCliente;
    }

    /**
     * @param enderecoDoCliente the enderecoDoCliente to set
     */
    public void setEnderecoDoCliente(Endereco enderecoDoCliente) {
        this.enderecoDoCliente = enderecoDoCliente;
    }
    
   private String codIdentificacao;
   private String email;
   private String nomeFantasia;
   private String razaoSocial;
   private String tipoCliente; 
   private Endereco enderecoDoCliente;
    
}
