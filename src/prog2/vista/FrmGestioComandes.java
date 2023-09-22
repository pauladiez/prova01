/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2.vista;

import java.awt.Dimension;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import prog2.adaptador.Adaptador;

public class FrmGestioComandes extends javax.swing.JFrame {

    private Adaptador adaptador;

    /**
     * Creates new form FrmGestioArticles
     */
    public FrmGestioComandes(Adaptador control) {
        initComponents();
        this.adaptador = control;
        omplirLlistaComandes();
        this.setDefaultCloseOperation(0);
        this.pnAfegirComanda.setVisible(false);
        omplirDades();
    }

    void omplirDades() {
        try {
            this.cbArticles.removeAllItems();
            for (String item : adaptador.recuperaArticles()) {
                this.cbArticles.addItem(item);
            }
            this.cbClients.removeAllItems();
            for (String item : adaptador.recuperaClients()) {
                this.cbClients.addItem(item);
            }

        } catch (Exception ex) {

        }
    }

    void omplirLlistaComandes() {

        this.pack();
        DefaultListModel model = new DefaultListModel();

        if (this.ckNomesCancelades.isSelected()) {
            for (String item : adaptador.recuperaComandesCancelades()) {
                model.addElement(item);
            }
        } else {
            for (String item : adaptador.recuperaComandes()) {
                model.addElement(item);
            }
        }
        this.liLlistaComandes.setModel(model);
    }

    void activarControls() {
        this.setPreferredSize(new Dimension(1000, 320));
        this.liLlistaComandes.setEnabled(true);
        this.ckNomesCancelades.setEnabled(true);
        this.btnAfegirComanda.setEnabled(true);
        this.btnCancelarComanda.setEnabled(true);
        this.btnSortir.setEnabled(true);
    }

    void desActivarControls() {
        this.liLlistaComandes.setEnabled(false);
        this.ckNomesCancelades.setSelected(false);
        this.omplirLlistaComandes();
        this.ckNomesCancelades.setEnabled(false);
        this.btnAfegirComanda.setEnabled(false);
        this.btnCancelarComanda.setEnabled(false);
        this.btnSortir.setEnabled(false);
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
        liLlistaComandes = new javax.swing.JList<>();
        etTitol = new javax.swing.JLabel();
        btnAfegirComanda = new javax.swing.JButton();
        btnSortir = new javax.swing.JButton();
        pnAfegirComanda = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbArticles = new javax.swing.JComboBox<>();
        cbClients = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtQuantitat = new javax.swing.JTextField();
        ckUrgent = new javax.swing.JCheckBox();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        ckNomesCancelades = new javax.swing.JCheckBox();
        btnCancelarComanda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        liLlistaComandes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(liLlistaComandes);

        etTitol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etTitol.setText("Gestió de comandes");

        btnAfegirComanda.setText("Afegir Comanda");
        btnAfegirComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfegirComandaActionPerformed(evt);
            }
        });

        btnSortir.setText("Sortir");
        btnSortir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortirActionPerformed(evt);
            }
        });

        pnAfegirComanda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Nova Comanda");

        cbArticles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbClients.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Article:");

        jLabel3.setText("Client:");

        jLabel4.setText("Quantitat:");

        ckUrgent.setText("Comanda Urgent:");
        ckUrgent.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btnAceptar.setText("Acceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnAfegirComandaLayout = new javax.swing.GroupLayout(pnAfegirComanda);
        pnAfegirComanda.setLayout(pnAfegirComandaLayout);
        pnAfegirComandaLayout.setHorizontalGroup(
            pnAfegirComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAfegirComandaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnAfegirComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAfegirComandaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(pnAfegirComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckUrgent)
                            .addGroup(pnAfegirComandaLayout.createSequentialGroup()
                                .addComponent(btnAceptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                                .addComponent(btnCancelar)))
                        .addGap(123, 123, 123))
                    .addGroup(pnAfegirComandaLayout.createSequentialGroup()
                        .addGroup(pnAfegirComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(pnAfegirComandaLayout.createSequentialGroup()
                                .addGroup(pnAfegirComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnAfegirComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGroup(pnAfegirComandaLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel4)))
                                .addGap(35, 35, 35)
                                .addGroup(pnAfegirComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtQuantitat, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbArticles, 0, 498, Short.MAX_VALUE)
                                    .addComponent(cbClients, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        pnAfegirComandaLayout.setVerticalGroup(
            pnAfegirComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAfegirComandaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(pnAfegirComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbArticles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(pnAfegirComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbClients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnAfegirComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtQuantitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ckUrgent)
                .addGap(30, 30, 30)
                .addGroup(pnAfegirComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        ckNomesCancelades.setText("Només Comandes Cancel·lades:");
        ckNomesCancelades.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ckNomesCancelades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckNomesCanceladesActionPerformed(evt);
            }
        });

        btnCancelarComanda.setText("Cance·lar Comanda");
        btnCancelarComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarComandaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(612, Short.MAX_VALUE)
                .addComponent(ckNomesCancelades)
                .addGap(0, 123, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(etTitol)
                .addContainerGap(736, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(btnAfegirComanda)
                .addGap(92, 92, 92)
                .addComponent(btnCancelarComanda)
                .addGap(125, 125, 125)
                .addComponent(btnSortir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnAfegirComanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(etTitol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckNomesCancelades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAfegirComanda)
                    .addComponent(btnSortir)
                    .addComponent(btnCancelarComanda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnAfegirComanda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnAfegirComanda.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAfegirComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfegirComandaActionPerformed
        try {
            this.setPreferredSize(new Dimension(1000, 600));
            this.pack();
            this.pnAfegirComanda.setVisible(true);
            desActivarControls();
            // FrmAfegirArticle formAfegirArticle = new FrmAfegirArticle(this, true, adaptador);
            // formAfegirArticle.pack();
            // formAfegirArticle.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error:", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAfegirComandaActionPerformed

    private void btnSortirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSortirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.txtQuantitat.setText("");
        this.pnAfegirComanda.setVisible(false);
        this.setPreferredSize(new Dimension(1000, 320));
        this.pack();
        activarControls();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        try {
            this.adaptador.afegirComanda(this.cbArticles.getSelectedIndex(), this.cbClients.getSelectedIndex(), Integer.parseInt(this.txtQuantitat.getText()), this.ckUrgent.isSelected());
            this.txtQuantitat.setText("");
            this.pnAfegirComanda.setVisible(false);
            activarControls();
            omplirLlistaComandes();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error:", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void ckNomesCanceladesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckNomesCanceladesActionPerformed
        this.btnCancelarComanda.setEnabled(!this.ckNomesCancelades.isSelected());
        this.omplirLlistaComandes();
    }//GEN-LAST:event_ckNomesCanceladesActionPerformed

    private void btnCancelarComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarComandaActionPerformed
        try {
            this.adaptador.cancelarComanda(this.liLlistaComandes.getSelectedIndex());
            omplirLlistaComandes();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error:", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCancelarComandaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAfegirComanda;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarComanda;
    private javax.swing.JButton btnSortir;
    private javax.swing.JComboBox<String> cbArticles;
    private javax.swing.JComboBox<String> cbClients;
    private javax.swing.JCheckBox ckNomesCancelades;
    private javax.swing.JCheckBox ckUrgent;
    private javax.swing.JLabel etTitol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> liLlistaComandes;
    private javax.swing.JPanel pnAfegirComanda;
    private javax.swing.JTextField txtQuantitat;
    // End of variables declaration//GEN-END:variables
}