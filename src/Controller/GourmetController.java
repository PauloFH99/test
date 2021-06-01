/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.No;
import View.MenuView;

/**
 *
 * @author paulo
 */
public class GourmetController {

    private No raiz;
    private MenuView view;

    public GourmetController() {
        view = new MenuView();
        raiz = new No();
    }

    public No getRaiz() {
        return raiz;
    }

    public void iniciar() {
        int resposta = 1;

        view.mensagemInicial();

        do {
            resposta = view.pergunta(raiz);

            if (resposta == 0) {
                busca(raiz.getEsq());
            } else if (resposta == 1) {
                busca(raiz.getDir());
            }

            view.mensagemInicial();

        } while (resposta != -1);
    }

    public void busca(No no) {
        int resposta = view.pergunta(no);

        if (resposta == 0) {
            if (no.getEsq() == null) {
                view.repetir();
            } else {
                busca(no.getEsq());
            }
        } else {
            if (no.getDir() == null) {
                inserir(no);
            } else {
                busca(no.getDir());
            }
        }
    }

    private void inserir(No no) {
        String prato = view.qualPrato();
        String respComparativo = view.comparar(prato, no);

        no.setPrato(respComparativo);
        no.setEsq(new No(prato));
        no.setDir(new No(no.getPrato()));

    }

}
