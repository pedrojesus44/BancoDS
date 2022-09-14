
package controle;

import conexao.Conexao; // importar do package a classe
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; // para reconhecimento da Jtable
import java.sql.*; // para reconhecimento dos comandos SQL

public class frmTela extends javax.swing.JFrame {

    Conexao con_cliente;
    
    public frmTela() {
        initComponents();
        con_cliente = new Conexao(); // inicialização do objeto como instância
        con_cliente.conecta(); // chama o método que conecta
        con_cliente.executaSQL("select * from tbclientes order by cod");
        preencherTabela();
        posicionarRegistro();
        tblClientes.setAutoCreateRowSorter(true); // ativa a classificação ordenada da tabela
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotulo1 = new javax.swing.JLabel();
        rotulo2 = new javax.swing.JLabel();
        rotulo3 = new javax.swing.JLabel();
        rotulo4 = new javax.swing.JLabel();
        rotulo5 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        ScrollPane = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnPrimeiroRegistro = new javax.swing.JButton();
        btnVoltarUmRegistro = new javax.swing.JButton();
        btnAvancarUmRegistro = new javax.swing.JButton();
        btnUltimoRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rotulo1.setText("Código:");

        rotulo2.setText("Nome:");

        rotulo3.setText("Data nascimento:");

        rotulo4.setText("Telefone:");

        rotulo5.setText("Email:");

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Data nascimento", "Telefone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        tblClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblClientesKeyPressed(evt);
            }
        });
        ScrollPane.setViewportView(tblClientes);

        btnPrimeiroRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/resultset_first.png"))); // NOI18N
        btnPrimeiroRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroRegistroActionPerformed(evt);
            }
        });

        btnVoltarUmRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/resultset_previous.png"))); // NOI18N
        btnVoltarUmRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarUmRegistroActionPerformed(evt);
            }
        });

        btnAvancarUmRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/resultset_next.png"))); // NOI18N
        btnAvancarUmRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarUmRegistroActionPerformed(evt);
            }
        });

        btnUltimoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/resultset_last.png"))); // NOI18N
        btnUltimoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPrimeiroRegistro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVoltarUmRegistro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAvancarUmRegistro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUltimoRegistro))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rotulo5)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt5))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rotulo2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rotulo1)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(rotulo4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt4))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rotulo3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotulo1)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotulo2)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotulo3)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotulo4)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotulo5)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPrimeiroRegistro)
                            .addComponent(btnVoltarUmRegistro)
                            .addComponent(btnAvancarUmRegistro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUltimoRegistro)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblClientesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblClientesKeyPressed
        // evento que sincroniza a grid com as setas do teclado
        int linha_selecionada = tblClientes.getSelectedRow();
        txt1.setText(tblClientes.getValueAt(linha_selecionada, 0).toString());
        txt2.setText(tblClientes.getValueAt(linha_selecionada, 1).toString());
        txt3.setText(tblClientes.getValueAt(linha_selecionada, 2).toString());
        txt4.setText(tblClientes.getValueAt(linha_selecionada, 3).toString());
        txt5.setText(tblClientes.getValueAt(linha_selecionada, 4).toString());
    }//GEN-LAST:event_tblClientesKeyPressed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        int linha_selecionada = tblClientes.getSelectedRow();
        txt1.setText(tblClientes.getValueAt(linha_selecionada, 0).toString());
        txt2.setText(tblClientes.getValueAt(linha_selecionada, 1).toString());
        txt3.setText(tblClientes.getValueAt(linha_selecionada, 2).toString());
        txt4.setText(tblClientes.getValueAt(linha_selecionada, 3).toString());
        txt5.setText(tblClientes.getValueAt(linha_selecionada, 4).toString());
    }//GEN-LAST:event_tblClientesMouseClicked

    private void btnPrimeiroRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroRegistroActionPerformed
        try {
            con_cliente.resultset.first();
            mostrar_Dados();           
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null,"Não foi possível acessar o primeiro registro: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnPrimeiroRegistroActionPerformed

    private void btnUltimoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoRegistroActionPerformed
        try {
            con_cliente.resultset.last();
            mostrar_Dados();           
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null,"Não foi possível posicionar no último registro: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnUltimoRegistroActionPerformed

    private void btnVoltarUmRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarUmRegistroActionPerformed
        try {
            con_cliente.resultset.previous();
            mostrar_Dados();           
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null,"Não foi possível posicionar no registro anterior: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnVoltarUmRegistroActionPerformed

    private void btnAvancarUmRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarUmRegistroActionPerformed
        try {
            con_cliente.resultset.next();
            mostrar_Dados();           
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null,"Não foi possível posicionar no próximo registro: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAvancarUmRegistroActionPerformed

    
    public void preencherTabela() {
        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(4);
        tblClientes.getColumnModel().getColumn(1).setPreferredWidth(150);
        tblClientes.getColumnModel().getColumn(2).setPreferredWidth(11);
        tblClientes.getColumnModel().getColumn(3).setPreferredWidth(14);
        tblClientes.getColumnModel().getColumn(4).setPreferredWidth(100);
        
        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
        modelo.setNumRows(0);
        
        try {
            con_cliente.resultset.beforeFirst();
            while(con_cliente.resultset.next()){
                modelo.addRow(new Object[]{
                    con_cliente.resultset.getString("cod"),
                    con_cliente.resultset.getString("nome"),
                    con_cliente.resultset.getString("dt_nasc"),
                    con_cliente.resultset.getString("telefone"), 
                    con_cliente.resultset.getString("email")
                });
            }
        }catch(SQLException erro){
                    JOptionPane.showMessageDialog(null,"\n Erro ao listar dados da tabela!! :\n "
                    +erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void posicionarRegistro() {
        try {
            con_cliente.resultset.first(); // posiciona no 1ª registro da tabela
            mostrar_Dados(); // chama o método que irá buscar o dado da tabela
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null,"Não foi possível posicionar no primeiro registro: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void mostrar_Dados(){
        try {
            txt1.setText(con_cliente.resultset.getString("cod")); // Associar a caixa de texto ao campo cod
            txt2.setText(con_cliente.resultset.getString("nome")); // Associar a caixa de texto ao campo nome
            txt3.setText(con_cliente.resultset.getString("dt_nasc"));
            txt4.setText(con_cliente.resultset.getString("telefone"));
            txt5.setText(con_cliente.resultset.getString("email"));
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null,"Não localizou dados: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JScrollPane ScrollPane;
    public javax.swing.JButton btnAvancarUmRegistro;
    public javax.swing.JButton btnPrimeiroRegistro;
    public javax.swing.JButton btnUltimoRegistro;
    public javax.swing.JButton btnVoltarUmRegistro;
    public javax.swing.JLabel rotulo1;
    public javax.swing.JLabel rotulo2;
    public javax.swing.JLabel rotulo3;
    public javax.swing.JLabel rotulo4;
    public javax.swing.JLabel rotulo5;
    public javax.swing.JTable tblClientes;
    public javax.swing.JTextField txt1;
    public javax.swing.JTextField txt2;
    public javax.swing.JTextField txt3;
    public javax.swing.JTextField txt4;
    public javax.swing.JTextField txt5;
    // End of variables declaration//GEN-END:variables
}
