/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.Carro;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author sarah
 */
public class JFormConsultar extends javax.swing.JFrame {

    /**
     * Creates new form JFormConsultar
     */
    public JFormConsultar() {
        initComponents();
        lbl_consulta.setVisible(false);
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
        tb_carro = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_carro = new javax.swing.JButton();
        btn_moto = new javax.swing.JButton();
        btn_vendas = new javax.swing.JButton();
        btn_cliente = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        txtA_consulta = new javax.swing.JScrollPane();
        txtA_consultar = new javax.swing.JTextArea();
        lbl_consulta = new javax.swing.JLabel();

        tb_carro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb_carro);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("CONSULTAR");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/concessionaria64.png"))); // NOI18N

        btn_carro.setBackground(new java.awt.Color(255, 255, 255));
        btn_carro.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_carro.setForeground(new java.awt.Color(0, 102, 102));
        btn_carro.setText("Carro");
        btn_carro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        btn_carro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carroActionPerformed(evt);
            }
        });

        btn_moto.setBackground(new java.awt.Color(255, 255, 255));
        btn_moto.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_moto.setForeground(new java.awt.Color(0, 102, 102));
        btn_moto.setText("Moto");
        btn_moto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        btn_moto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_motoActionPerformed(evt);
            }
        });

        btn_vendas.setBackground(new java.awt.Color(255, 255, 255));
        btn_vendas.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_vendas.setForeground(new java.awt.Color(0, 102, 102));
        btn_vendas.setText("Vendas");
        btn_vendas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        btn_vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vendasActionPerformed(evt);
            }
        });

        btn_cliente.setBackground(new java.awt.Color(255, 255, 255));
        btn_cliente.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_cliente.setForeground(new java.awt.Color(0, 102, 102));
        btn_cliente.setText("Cliente");
        btn_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        btn_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clienteActionPerformed(evt);
            }
        });

        btn_voltar.setBackground(new java.awt.Color(0, 102, 102));
        btn_voltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_voltar.setForeground(new java.awt.Color(255, 255, 255));
        btn_voltar.setText("Voltar");
        btn_voltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        btn_voltar.setName("btn_voltar"); // NOI18N
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        txtA_consultar.setEditable(false);
        txtA_consultar.setColumns(20);
        txtA_consultar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtA_consultar.setRows(5);
        txtA_consulta.setViewportView(txtA_consultar);

        lbl_consulta.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_consulta.setForeground(new java.awt.Color(0, 102, 102));
        lbl_consulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_consulta.setText("Carro");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(205, 205, 205)
                                    .addComponent(lbl_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_moto, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_carro, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(31, 31, 31)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_vendas, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtA_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_cliente)
                                .addGap(11, 11, 11)
                                .addComponent(btn_vendas))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_carro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_moto)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtA_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void btn_carroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carroActionPerformed
txtA_consultar.setText("");
lbl_consulta.setText("Carro");
lbl_consulta.setVisible(true);
        
        String linha;
        boolean flag = false;
        
        try
            {
                FileInputStream arquivo = new FileInputStream(".//src//Model//carros.txt");
                InputStreamReader input = new InputStreamReader(arquivo);
                BufferedReader lerArq = new BufferedReader(input);
                    do
                    {
                         linha = lerArq.readLine();
                         
                         if(linha != null)
                         {
                         String[] dadoSeparado = linha.split(";");
                     
                        flag = true;
                        
                        txtA_consultar.setText(txtA_consultar.getText() + "Chassi: " + dadoSeparado[0] + " - Marca: " + dadoSeparado[1] + " - Modelo: " + dadoSeparado[2] + " - KM; " + dadoSeparado[4] + " - Tipo: " + dadoSeparado[11] + "\n");

                         }
                    } while(linha != null);
                    
                lerArq.close();
            }

            catch(IOException e)
            {
                JOptionPane.showMessageDialog(null, "Erro ao buscar dados no arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
                //JFormCadastroMoto.this.setVisible(false);
            }

        
    }//GEN-LAST:event_btn_carroActionPerformed

    private void btn_motoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_motoActionPerformed
        txtA_consultar.setText("");
        lbl_consulta.setText("Moto");
        lbl_consulta.setVisible(true);
        
        String linha;
        boolean flag = false;
        
        try
            {
                FileInputStream arquivo = new FileInputStream(".//src//Model//motocicletas.txt");
                InputStreamReader input = new InputStreamReader(arquivo);
                BufferedReader lerArq = new BufferedReader(input);
                    do
                    {
                         linha = lerArq.readLine();
                         
                         if(linha != null)
                         {
                         String[] dadoSeparado = linha.split(";");
                     
                        flag = true;
                        
                        txtA_consultar.setText(txtA_consultar.getText() + "Chassi: " + dadoSeparado[0] + " - Marca: " + dadoSeparado[1] + " - Modelo: " + dadoSeparado[2] + " - KM: " + dadoSeparado[4] + " - Tipo: " + dadoSeparado[9] +"\n");

                         }
                    } while(linha != null);
                    
                lerArq.close();
            }

            catch(IOException e)
            {
                JOptionPane.showMessageDialog(null, "Erro ao buscar dados no arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
                //JFormCadastroMoto.this.setVisible(false);
            }

        
    }//GEN-LAST:event_btn_motoActionPerformed

    private void btn_vendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vendasActionPerformed
        txtA_consultar.setText("");
        lbl_consulta.setText("Vendas");
        lbl_consulta.setVisible(true);
        
        String linha;
        boolean flag = false;
        
        try
            {
                FileInputStream arquivo = new FileInputStream(".//src//Model//vendas.txt");
                InputStreamReader input = new InputStreamReader(arquivo);
                BufferedReader lerArq = new BufferedReader(input);
                    do
                    {
                         linha = lerArq.readLine();
                         
                         if(linha != null)
                         {
                         String[] dadoSeparado = linha.split(";");
                     
                        flag = true;
                        //PUXAR DADOS COM OS ÍNDICES CERTOOSSSSSSSSSSSSSSS
                        txtA_consultar.setText(txtA_consultar.getText() + "ID: " + dadoSeparado[0] + " - Cliente: " + dadoSeparado[1] + " - Vendedor: " + dadoSeparado[2] + " - Veículo: " + dadoSeparado[2]  +"\n");

                         }
                    } while(linha != null);
                    
                lerArq.close();
            }

            catch(IOException e)
            {
                JOptionPane.showMessageDialog(null, "Erro ao buscar dados no arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
                //JFormCadastroMoto.this.setVisible(false);
            }
    }//GEN-LAST:event_btn_vendasActionPerformed

    private void btn_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clienteActionPerformed
        txtA_consultar.setText("");
        lbl_consulta.setText("Cliente");
        lbl_consulta.setVisible(true);
        
        String linha;
        boolean flag = false;
        
        try
            {
                FileInputStream arquivo = new FileInputStream(".//src//Model//clientes.txt");
                InputStreamReader input = new InputStreamReader(arquivo);
                BufferedReader lerArq = new BufferedReader(input);
                    do
                    {
                         linha = lerArq.readLine();
                         
                         if(linha != null)
                         {
                         String[] dadoSeparado = linha.split(";");
                     
                        flag = true;
                        //PUXAR DADOS COM OS ÍNDICES CERTOOSSSSSSSSSSSSSSS
                        txtA_consultar.setText(txtA_consultar.getText() + "Nome: " + dadoSeparado[0] + " - CPF: " + dadoSeparado[1] + " - Renda: " + dadoSeparado[2]  +"\n");

                         }
                    } while(linha != null);
                    
                lerArq.close();
            }

            catch(IOException e)
            {
                JOptionPane.showMessageDialog(null, "Erro ao buscar dados no arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
                //JFormCadastroMoto.this.setVisible(false);
            }
    }//GEN-LAST:event_btn_clienteActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        JFormConsultar.this.setVisible(false);
    }//GEN-LAST:event_btn_voltarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFormConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFormConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFormConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFormConsultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFormConsultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_carro;
    private javax.swing.JButton btn_cliente;
    private javax.swing.JButton btn_moto;
    private javax.swing.JButton btn_vendas;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_consulta;
    private javax.swing.JTable tb_carro;
    private javax.swing.JScrollPane txtA_consulta;
    private javax.swing.JTextArea txtA_consultar;
    // End of variables declaration//GEN-END:variables
}