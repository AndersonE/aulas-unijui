/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Marca.java
 *
 * Created on 05/03/2011, 09:09:58
 */

package jogovelha.marcacao;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author rudieri
 */
public class Marca extends javax.swing.JPanel {

    private ImageIcon icon;
    /** Creates new form Marca */
    public Marca() {
        initComponents();
    }

    public Marca(ImageIcon icon) {
        initComponents();
        this.icon = icon;
        jLabel1.setIcon(icon);
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());
        add(jLabel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the icon
     */
    public ImageIcon getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    /**
     * @return the jLabel1
     */
    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    /**
     * @param jLabel1 the jLabel1 to set
     */
    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

}