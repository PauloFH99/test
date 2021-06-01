/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author paulo
 */
public class No {

    private String prato;
    private No esq;
    private No dir;

    public No() {
        prato ="Massa";
        setEsq(new No("Lasanha"));
        setDir(new No("Bolo de Chocolate"));
    }

    public No(String prato) {
        this.prato = prato;
        this.esq = null;
        this.dir = null;
    }

    public String getPrato() {
        return prato;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }

    public No getEsq() {
        return esq;
    }

    public void setEsq(No esq) {
        this.esq = esq;
    }

    public No getDir() {
        return dir;
    }

    public void setDir(No dir) {
        this.dir = dir;
    }

}
