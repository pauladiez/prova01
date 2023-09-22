/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2.vista;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import prog2.adaptador.Adaptador;

public class FrmGestioClients extends javax.swing.JFrame {

    private Adaptador control;

    /**
     * Creates new form FrmGestioArticles
     */
    public FrmGestioClients(Adaptador control) {
        initComponents();
        this.control = control;
        omplirLlistaClients();
        this.setDefaultCloseOperation(0);
    }

    void omplirLlistaClients() {
        DefaultListModel model = new DefaultListModel();
        for (String item : control.recuperaClients()) {
            model.addElement(item);
        }
        this.liLlistaClients.setModel(model);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        liLlistaClients = new javax.swing.JList<>();
        etTitol = new javax.swing.JLabel();
        btnAfegirClient = new javax.swing.JButton();
        btnSortir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        liLlistaClients.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(liLlistaClients);

        etTitol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etTitol.setText("Gestió de clients");

        btnAfegirClient.setText("Afegir Client");
        btnAfegirClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfegirClientActionPerformed(evt);
            }
        });

        btnSortir.setText("Sortir");
        btnSortir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(btnAfegirClient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSortir)
                .addGap(206, 206, 206))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etTitol)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(etTitol)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAfegirClient)
                    .addComponent(btnSortir))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        btnAfegirClient.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAfegirClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfegirClientActionPerformed
        try {
            FrmAfegirClient formAfegirArticle = new FrmAfegirClient(this, true, control);
            formAfegirArticle.pack();
            formAfegirArticle.setVisible(true);

        } catch (Exception ex) {
          JOptionPane.showMessageDialog(this, ex.getMessage(), "Error:", JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_btnAfegirClientActionPerformed

    private void btnSortirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSortirActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAfegirClient;
    private javax.swing.JButton btnSortir;
    private javax.swing.JLabel etTitol;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> liLlistaClients;
    // End of variables declaration//GEN-END:variables
}