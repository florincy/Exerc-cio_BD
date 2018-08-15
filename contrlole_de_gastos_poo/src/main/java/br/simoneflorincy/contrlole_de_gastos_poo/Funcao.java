/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.simoneflorincy.contrlole_de_gastos_poo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "funcao")
public class Funcao implements Serializable {

    /**
     * @return the tp_visivel
     */
    public char getTp_visivel() {
        return tp_visivel;
    }

    /**
     * @param tp_visivel the tp_visivel to set
     */
    public void setTp_visivel(char tp_visivel) {
        this.tp_visivel = tp_visivel;
    }

    /**
     * @return the cdFuncao
     */
    public Integer getCdFuncao() {
        return cdFuncao;
    }

    /**
     * @param cdFuncao the cdFuncao to set
     */
    public void setCdFuncao(Integer cdFuncao) {
        this.cdFuncao = cdFuncao;
    }

    /**
     * @return the acessoRestrito
     */
    public boolean isAcessoRestrito() {
        return acessoRestrito;
    }

    /**
     * @param acessoRestrito the acessoRestrito to set
     */
    public void setAcessoRestrito(boolean acessoRestrito) {
        this.acessoRestrito = acessoRestrito;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    /*
    cd_funcao integer NOT NULL,
  ds_funcao text,
  tp_visivel character(1),
  CONSTRAINT pk_funcao PRIMARY KEY (cd_funcao)
     */
    @Column
    private char tp_visivel;
    //Dúvida: tp_visivel corresponde à acessoRestrito
    private boolean acessoRestrito;
    @Column(name = "ds_funcao")
    private String descricao;
    @Column(name = "cd_funcao")
    @Id
    private Integer cdFuncao;

}
