/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.No;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author paulo
 */
public class MenuView {

    private JFrame viewFrame = new JFrame();

    public void mensagemInicial() {
        JOptionPane.showMessageDialog(viewFrame, "Pense em um prato que gosta");
    }

    public int pergunta(No no) {
        return JOptionPane.showConfirmDialog(viewFrame, "O prato que você pensou é " + no.getPrato() + "?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }

    public void repetir() {
        JOptionPane.showMessageDialog(viewFrame, "Acertei de novo!");
    }

    public String qualPrato() {
        return JOptionPane.showInputDialog(viewFrame, "Qual prato você pensou?");
    }

    public String comparar(String prato, No no) {
        return JOptionPane.showInputDialog(viewFrame, String.format(" %s é ____ mas %s não.",prato,no.getPrato()));
    }

}
