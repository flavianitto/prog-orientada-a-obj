public class Tela extends javax.swing.JFrame {

    public Tela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField1 = new java.awt.TextField();
        btn1 = new java.awt.Button();
        btn2 = new java.awt.Button();
        btn3 = new java.awt.Button();
        btn4 = new java.awt.Button();
        btn5 = new java.awt.Button();
        btn6 = new java.awt.Button();
        btn7 = new java.awt.Button();
        btn8 = new java.awt.Button();
        btn9 = new java.awt.Button();
        btn0 = new java.awt.Button();
        btnErase = new java.awt.Button();
        btnDiv = new java.awt.Button();
        btnMult = new java.awt.Button();
        btnMenos = new java.awt.Button();
        btnPonto = new java.awt.Button();
        btnC = new java.awt.Button();
        btnIgual = new java.awt.Button();
        btnMais = new java.awt.Button();
        lblResultado = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblAuxResultado = new javax.swing.JLabel();

        textField1.setText("textField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(625, 200));
        setName("telaPrincipal"); // NOI18N
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        btn1.setActionCommand("num1");
        btn1.setLabel("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setActionCommand("num2");
        btn2.setLabel("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setActionCommand("num3");
        btn3.setLabel("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setActionCommand("num4");
        btn4.setLabel("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setActionCommand("num5");
        btn5.setLabel("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setActionCommand("num6");
        btn6.setLabel("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setActionCommand("num7");
        btn7.setLabel("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setActionCommand("num8");
        btn8.setLabel("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setActionCommand("num9");
        btn9.setLabel("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn0.setActionCommand("num0");
        btn0.setLabel("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnErase.setActionCommand("btnErase");
        btnErase.setLabel("<=");
        btnErase.setName("btnErase"); // NOI18N
        btnErase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEraseActionPerformed(evt);
            }
        });

        btnDiv.setActionCommand("btnDiv");
        btnDiv.setLabel("/");
        btnDiv.setName("btnDiv"); // NOI18N
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnMult.setActionCommand("btnMult");
        btnMult.setLabel("*");
        btnMult.setName("btnMult"); // NOI18N
        btnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultActionPerformed(evt);
            }
        });

        btnMenos.setActionCommand("btnMenos");
        btnMenos.setLabel("-");
        btnMenos.setName("btnMenos"); // NOI18N
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        btnPonto.setActionCommand("ponto");
        btnPonto.setLabel(",");
        btnPonto.setName("ponto"); // NOI18N
        btnPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontoActionPerformed(evt);
            }
        });

        btnC.setActionCommand("btnC");
        btnC.setLabel("C");
        btnC.setName("btnC"); // NOI18N
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnIgual.setActionCommand("btnIgual");
        btnIgual.setBackground(new java.awt.Color(153, 204, 255));
        btnIgual.setLabel("=");
        btnIgual.setName("btnIgual"); // NOI18N
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnMais.setActionCommand("btnMais");
        btnMais.setLabel("+");
        btnMais.setName("btnMais"); // NOI18N
        btnMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisActionPerformed(evt);
            }
        });

        lblResultado.setBackground(new java.awt.Color(255, 255, 255));
        lblResultado.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblResultado.setName("lblResultado"); // NOI18N
        lblResultado.setOpaque(true);

        lblAuxResultado.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblAuxResultado.setForeground(new java.awt.Color(102, 102, 102));
        lblAuxResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAuxResultado.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAuxResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnErase, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(btnMais, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblAuxResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnErase, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14)
                        .addComponent(btnMult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMais, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        btn1.getAccessibleContext().setAccessibleName("num1");
        btn2.getAccessibleContext().setAccessibleName("num2");
        btn3.getAccessibleContext().setAccessibleName("num3");
        btn4.getAccessibleContext().setAccessibleName("num4");
        btn5.getAccessibleContext().setAccessibleName("num5");
        btn6.getAccessibleContext().setAccessibleName("num6");
        btn7.getAccessibleContext().setAccessibleName("num7");
        btn8.getAccessibleContext().setAccessibleName("num8");
        btn8.getAccessibleContext().setAccessibleDescription("");
        btn9.getAccessibleContext().setAccessibleName("num9");
        btn0.getAccessibleContext().setAccessibleName("num0");
        btnErase.getAccessibleContext().setAccessibleName("btnErase");
        btnDiv.getAccessibleContext().setAccessibleName("btnDiv");
        btnMult.getAccessibleContext().setAccessibleName("btnMult");
        btnMenos.getAccessibleContext().setAccessibleName("btnMenos");
        btnPonto.getAccessibleContext().setAccessibleName("ponto");
        btnC.getAccessibleContext().setAccessibleName("btnC");
        btnIgual.getAccessibleContext().setAccessibleName("btnIgual");
        btnMais.getAccessibleContext().setAccessibleName("btnMais");
        lblResultado.getAccessibleContext().setAccessibleName("lblResultado");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        String numero;
        numero = lblResultado.getText();
        lblResultado.setText(numero+1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        String numero;
        numero = lblResultado.getText();
        lblResultado.setText(numero+2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        String numero;
        numero = lblResultado.getText();
        lblResultado.setText(numero+3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        String numero;
        numero = lblResultado.getText();
        lblResultado.setText(numero+4);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        String numero;
        numero = lblResultado.getText();
        lblResultado.setText(numero+5);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        String numero;
        numero = lblResultado.getText();
        lblResultado.setText(numero+6);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        String numero;
        numero = lblResultado.getText();
        lblResultado.setText(numero+7);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        String numero;
        numero = lblResultado.getText();
        lblResultado.setText(numero+8);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        String numero;
        numero = lblResultado.getText();
        lblResultado.setText(numero+9);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        String numero;
        numero = lblResultado.getText();
        lblResultado.setText(numero+0);
    }//GEN-LAST:event_btn0ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // TODO add your handling code here:
        lblResultado.setText("");
        lblAuxResultado.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void btnEraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEraseActionPerformed
        // TODO add your handling code here:
        String numero;
        numero = lblResultado.getText();
        int tam = numero.length();
        numero = numero.substring(0, tam-1);
        lblResultado.setText(numero);
    }//GEN-LAST:event_btnEraseActionPerformed

    private void btnPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoActionPerformed
        // TODO add your handling code here:
        String numero;
        numero = lblResultado.getText();
        if(!numero.isEmpty() && numero.contains(","))
        {
            lblResultado.setText(numero+",");
        }
    }//GEN-LAST:event_btnPontoActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        // TODO add your handling code here:
        String numero, aux;
        numero = lblResultado.getText();
        aux = lblAuxResultado.getText();
        if(!numero.isEmpty() && aux.isEmpty() && !numero.contains("/"))
        {
            lblAuxResultado.setText(numero+" / ");
            lblResultado.setText("");
        }
        else if(!aux.isEmpty())
        {
            if(aux.contains("/"))
            {
                double num;
                String res;
                aux = aux.substring(0, aux.length()-3);
                num = Double.parseDouble(aux) / Double.parseDouble(numero);
                res = Double.toString(num);
                lblAuxResultado.setText(res + " / ");
                lblResultado.setText("");                
            }
            else if(aux.contains("*"))
            {
                double num;
                String res;
                aux = aux.substring(0, aux.length()-3);
                num = Double.parseDouble(aux) * Double.parseDouble(numero);
                res = Double.toString(num);
                lblAuxResultado.setText(res + " / ");
                lblResultado.setText("");                 
            }            
            else if(aux.contains("-"))
            {
                double num;
                String res;
                aux = aux.substring(0, aux.length()-3);
                num = Double.parseDouble(aux) - Double.parseDouble(numero);
                res = Double.toString(num);
                lblAuxResultado.setText(res + " / ");
                lblResultado.setText("");                 
            }
            else if(aux.contains("+"))
            {
                double num;
                String res;
                aux = aux.substring(0, aux.length()-3);
                num = Double.parseDouble(aux) + Double.parseDouble(numero);
                res = Double.toString(num);
                lblAuxResultado.setText(res + " / ");
                lblResultado.setText("");                 
            }            
        }
    }//GEN-LAST:event_btnDivActionPerformed
   
    private void btnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultActionPerformed
        // TODO add your handling code here:
        String numero, aux;
        numero = lblResultado.getText();
        aux = lblAuxResultado.getText();
        if(!numero.isEmpty() && aux.isEmpty() && !numero.contains("*"))
        {
            lblAuxResultado.setText(numero+" * ");
            lblResultado.setText("");
        }
        else if(!aux.isEmpty())
        {
            if(aux.contains("/"))
            {
                double num;
                String res;
                aux = aux.substring(0, aux.length()-3);
                num = Double.parseDouble(aux) / Double.parseDouble(numero);
                res = Double.toString(num);
                lblAuxResultado.setText(res + " * ");
                lblResultado.setText("");                  
            }
            else if(aux.contains("*"))
            {
                double num;
                String res;
                aux = aux.substring(0, aux.length()-3);
                num = Double.parseDouble(aux) * Double.parseDouble(numero);
                res = Double.toString(num);
                lblAuxResultado.setText(res + " * ");
                lblResultado.setText("");                  
            }            
            else if(aux.contains("-"))
            {
                double num;
                String res;
                aux = aux.substring(0, aux.length()-3);
                num = Double.parseDouble(aux) - Double.parseDouble(numero);
                res = Double.toString(num);
                lblAuxResultado.setText(res + " * ");
                lblResultado.setText("");                   
            }
            else if(aux.contains("+"))
            {
                double num;
                String res;
                aux = aux.substring(0, aux.length()-3);
                num = Double.parseDouble(aux) + Double.parseDouble(numero);
                res = Double.toString(num);
                lblAuxResultado.setText(res + " * ");
                lblResultado.setText("");                   
            }            
        }        
    }//GEN-LAST:event_btnMultActionPerformed
    
    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        // TODO add your handling code here:
        String numero, aux;
        numero = lblResultado.getText();
        aux = lblAuxResultado.getText();
        if(!numero.isEmpty() && aux.isEmpty() && !numero.contains("-"))
        {
            lblAuxResultado.setText(numero+" - ");
            lblResultado.setText("");
        }
        else if(!aux.isEmpty())
        {
            if(aux.contains("/"))
            {
                double num;
                String res;
                aux = aux.substring(0, aux.length()-3);
                num = Double.parseDouble(aux) / Double.parseDouble(numero);
                res = Double.toString(num);
                lblAuxResultado.setText(res + " - ");
                lblResultado.setText("");                 
            }
            else if(aux.contains("*"))
            {
                double num;
                String res;
                aux = aux.substring(0, aux.length()-3);
                num = Double.parseDouble(aux) * Double.parseDouble(numero);
                res = Double.toString(num);
                lblAuxResultado.setText(res + " - ");
                lblResultado.setText("");                  
            }            
            else if(aux.contains("-"))
            {
                double num;
                String res;
                aux = aux.substring(0, aux.length()-3);
                num = Double.parseDouble(aux) - Double.parseDouble(numero);
                res = Double.toString(num);
                lblAuxResultado.setText(res + " - ");
                lblResultado.setText("");                  
            }
            else if(aux.contains("+"))
            {
                double num;
                String res;
                aux = aux.substring(0, aux.length()-3);
                num = Double.parseDouble(aux) + Double.parseDouble(numero);
                res = Double.toString(num);
                lblAuxResultado.setText(res + " - ");
                lblResultado.setText("");               
            }            
        }
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisActionPerformed
        // TODO add your handling code here:
        String numero, aux;
        numero = lblResultado.getText();
        aux = lblAuxResultado.getText();
        if(!numero.isEmpty() && aux.isEmpty() && !numero.contains("+"))
        {
            lblAuxResultado.setText(numero+" + ");
            lblResultado.setText("");
        }
        else if(!aux.isEmpty())
        {
            if(aux.contains("/"))
            {
                double num;
                String res;
                aux = aux.substring(0, aux.length()-3);
                num = Double.parseDouble(aux) / Double.parseDouble(numero);
                res = Double.toString(num);
                lblAuxResultado.setText(res + " + ");
                lblResultado.setText("");                
            }
            else if(aux.contains("*"))
            {
                double num;
                String res;
                aux = aux.substring(0, aux.length()-3);
                num = Double.parseDouble(aux) * Double.parseDouble(numero);
                res = Double.toString(num);
                lblAuxResultado.setText(res + " + ");
                lblResultado.setText("");                 
            }            
            else if(aux.contains("-"))
            {
                double num;
                String res;
                aux = aux.substring(0, aux.length()-3);
                num = Double.parseDouble(aux) - Double.parseDouble(numero);
                res = Double.toString(num);
                lblAuxResultado.setText(res + " + ");
                lblResultado.setText("");                  
            }
            else if(aux.contains("+"))
            {
                double num;
                String res;
                aux = aux.substring(0, aux.length()-3);
                num = Double.parseDouble(aux) + Double.parseDouble(numero);
                res = Double.toString(num);
                lblAuxResultado.setText(res + " + ");
                lblResultado.setText("");                   
            }            
        }
    }//GEN-LAST:event_btnMaisActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        // TODO add your handling code here:
        String numero, aux;
        numero = lblResultado.getText();
        aux = lblAuxResultado.getText();
        if(!aux.isEmpty() && !numero.isEmpty())
        {
            if(aux.contains("/"))
            {
                double num;
                String res;
                aux = aux.substring(0, aux.length()-3);
                num = Double.parseDouble(aux) / Double.parseDouble(numero);
                res = Double.toString(num);
                lblAuxResultado.setText(aux + " / " + numero + " = ");
                lblResultado.setText(res);                
            }
            else if(aux.contains("*"))
            {
                double num;
                String res;
                aux = aux.substring(0, aux.length()-3);
                num = Double.parseDouble(aux) * Double.parseDouble(numero);
                res = Double.toString(num);
                lblAuxResultado.setText(aux + " * " + numero + " = ");
                lblResultado.setText(res);                  
            }            
            else if(aux.contains("-"))
            {
                double num;
                String res;
                aux = aux.substring(0, aux.length()-3);
                num = Double.parseDouble(aux) - Double.parseDouble(numero);
                res = Double.toString(num);
                lblAuxResultado.setText(aux + " - " + numero + " = ");
                lblResultado.setText(res);                   
            }
            else if(aux.contains("+"))
            {
                double num;
                String res;
                aux = aux.substring(0, aux.length()-3);
                num = Double.parseDouble(aux) + Double.parseDouble(numero);
                res = Double.toString(num);
                lblAuxResultado.setText(aux + " + " + numero + " = ");
                lblResultado.setText(res);                   
            }             
        }
    }//GEN-LAST:event_btnIgualActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btn0;
    private java.awt.Button btn1;
    private java.awt.Button btn2;
    private java.awt.Button btn3;
    private java.awt.Button btn4;
    private java.awt.Button btn5;
    private java.awt.Button btn6;
    private java.awt.Button btn7;
    private java.awt.Button btn8;
    private java.awt.Button btn9;
    private java.awt.Button btnC;
    private java.awt.Button btnDiv;
    private java.awt.Button btnErase;
    private java.awt.Button btnIgual;
    private java.awt.Button btnMais;
    private java.awt.Button btnMenos;
    private java.awt.Button btnMult;
    private java.awt.Button btnPonto;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAuxResultado;
    private javax.swing.JLabel lblResultado;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
