/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author andre
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Formulario = new javax.swing.JDialog();
        BackGround = new javax.swing.JPanel();
        Parte_Alta = new javax.swing.JPanel();
        Cliente = new javax.swing.JLabel();
        Buscado = new java.awt.TextField();
        Usuario = new javax.swing.JPanel();
        idNumber = new java.awt.TextField();
        Nombre = new javax.swing.JLabel();
        NombreCliente = new java.awt.TextField();
        Apellido = new javax.swing.JLabel();
        ApellidoCliente = new java.awt.TextField();
        Direccion = new javax.swing.JLabel();
        DireccionCliente = new java.awt.TextField();
        TlfCliente = new java.awt.TextField();
        Email = new javax.swing.JLabel();
        EmailCliente = new java.awt.TextField();
        Tlf = new javax.swing.JLabel();
        Cliente_id = new javax.swing.JLabel();
        Botones = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        back = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        save = new javax.swing.JButton();
        backStop = new javax.swing.JButton();
        playLeft = new javax.swing.JButton();
        playRight = new javax.swing.JButton();
        backStopRight = new javax.swing.JButton();
        Calculadora = new javax.swing.JDialog();
        BackGround1 = new javax.swing.JPanel();
        TextoNumerico = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Numeral = new javax.swing.JPanel();
        n9 = new javax.swing.JButton();
        n8 = new javax.swing.JButton();
        n7 = new javax.swing.JButton();
        n6 = new javax.swing.JButton();
        n5 = new javax.swing.JButton();
        n4 = new javax.swing.JButton();
        n3 = new javax.swing.JButton();
        n2 = new javax.swing.JButton();
        n1 = new javax.swing.JButton();
        no0 = new javax.swing.JButton();
        nPunto = new javax.swing.JButton();
        Operadores = new javax.swing.JPanel();
        Sumar = new javax.swing.JButton();
        Resta = new javax.swing.JButton();
        Multiplicar = new javax.swing.JButton();
        Dividir = new javax.swing.JButton();
        Igual = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        PanelOpcion = new javax.swing.JPanel();
        Form = new javax.swing.JButton();
        Calc = new javax.swing.JButton();

        BackGround.setBackground(new java.awt.Color(255, 255, 255));
        BackGround.setPreferredSize(new java.awt.Dimension(591, 428));

        Parte_Alta.setBackground(new java.awt.Color(153, 153, 255));
        Parte_Alta.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 100, 5));

        Cliente.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Cliente.setText("Clientes");
        Cliente.setToolTipText("");
        Parte_Alta.add(Cliente);

        Buscado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Buscado.setName(""); // NOI18N
        Buscado.setPreferredSize(new java.awt.Dimension(120, 20));
        Buscado.setText("textField1");
        Buscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscadoActionPerformed(evt);
            }
        });
        Parte_Alta.add(Buscado);

        Usuario.setBackground(new java.awt.Color(255, 255, 255));

        idNumber.setBackground(new java.awt.Color(153, 153, 153));
        idNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        idNumber.setEditable(false);
        idNumber.setText("5");
        idNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idNumberActionPerformed(evt);
            }
        });

        Nombre.setText("NOMBRE");

        NombreCliente.setText("RICARDO");
        NombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreClienteActionPerformed(evt);
            }
        });

        Apellido.setText("APELLIDOS");

        ApellidoCliente.setMinimumSize(new java.awt.Dimension(63, 20));
        ApellidoCliente.setText("MARTINES JUAREZ");
        ApellidoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoClienteActionPerformed(evt);
            }
        });

        Direccion.setText("DIRECCION");

        DireccionCliente.setText("EJIDO MVO AMANECER");
        DireccionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionClienteActionPerformed(evt);
            }
        });

        TlfCliente.setText("RICA8586@GMAIL.COM");
        TlfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TlfClienteActionPerformed(evt);
            }
        });

        Email.setText("EMAIL");

        EmailCliente.setText("605096208");
        EmailCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailClienteActionPerformed(evt);
            }
        });

        Tlf.setText("TELEFONO");

        Cliente_id.setText("CLIENTE_ID");

        javax.swing.GroupLayout UsuarioLayout = new javax.swing.GroupLayout(Usuario);
        Usuario.setLayout(UsuarioLayout);
        UsuarioLayout.setHorizontalGroup(
            UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuarioLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tlf, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cliente_id, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ApellidoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DireccionCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(TlfCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EmailCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UsuarioLayout.setVerticalGroup(
            UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuarioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cliente_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tlf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TlfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        Botones.setBackground(new java.awt.Color(255, 255, 255));
        Botones.setForeground(new java.awt.Color(255, 255, 255));
        Botones.setPreferredSize(new java.awt.Dimension(550, 101));
        Botones.setLayout(new java.awt.GridLayout(1, 8, 10, 20));

        add.setBackground(new java.awt.Color(204, 255, 255));
        add.setForeground(new java.awt.Color(102, 255, 255));
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iloveimg-resized (1)/add.png"))); // NOI18N
        Botones.add(add);

        back.setBackground(new java.awt.Color(204, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iloveimg-resized (1)/left.png"))); // NOI18N
        Botones.add(back);

        delete.setBackground(new java.awt.Color(204, 255, 255));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iloveimg-resized (1)/erase.png"))); // NOI18N
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        Botones.add(delete);

        save.setBackground(new java.awt.Color(204, 255, 255));
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iloveimg-resized (1)/save (1).png"))); // NOI18N
        Botones.add(save);

        backStop.setBackground(new java.awt.Color(204, 255, 255));
        backStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iloveimg-resized (1)/arrow_stop_left.png"))); // NOI18N
        Botones.add(backStop);

        playLeft.setBackground(new java.awt.Color(204, 255, 255));
        playLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iloveimg-resized (1)/controls_play_back_32.png"))); // NOI18N
        Botones.add(playLeft);

        playRight.setBackground(new java.awt.Color(204, 255, 255));
        playRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iloveimg-resized (1)/play.png"))); // NOI18N
        playRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playRightActionPerformed(evt);
            }
        });
        Botones.add(playRight);

        backStopRight.setBackground(new java.awt.Color(204, 255, 255));
        backStopRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iloveimg-resized (1)/arrow_stop_right.png"))); // NOI18N
        Botones.add(backStopRight);

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(Botones, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Parte_Alta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addComponent(Parte_Alta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Botones, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FormularioLayout = new javax.swing.GroupLayout(Formulario.getContentPane());
        Formulario.getContentPane().setLayout(FormularioLayout);
        FormularioLayout.setHorizontalGroup(
            FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BackGround, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        FormularioLayout.setVerticalGroup(
            FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BackGround, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        BackGround.getAccessibleContext().setAccessibleName("FormularioCliente");

        BackGround1.setBackground(new java.awt.Color(255, 255, 255));
        BackGround1.setForeground(new java.awt.Color(255, 255, 255));

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("16.0");
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextoNumerico.setViewportView(jTextArea1);

        Numeral.setBackground(new java.awt.Color(255, 255, 255));
        Numeral.setLayout(new java.awt.GridLayout(4, 3, 10, 10));

        n9.setBackground(new java.awt.Color(204, 255, 255));
        n9.setText("9");
        n9.setPreferredSize(new java.awt.Dimension(94, 94));
        n9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9ActionPerformed(evt);
            }
        });
        Numeral.add(n9);

        n8.setBackground(new java.awt.Color(204, 255, 255));
        n8.setText("8");
        n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ActionPerformed(evt);
            }
        });
        Numeral.add(n8);

        n7.setBackground(new java.awt.Color(204, 255, 255));
        n7.setText("7");
        Numeral.add(n7);

        n6.setBackground(new java.awt.Color(204, 255, 255));
        n6.setText("6");
        Numeral.add(n6);

        n5.setBackground(new java.awt.Color(204, 255, 255));
        n5.setText("5");
        Numeral.add(n5);

        n4.setBackground(new java.awt.Color(204, 255, 255));
        n4.setText("4");
        Numeral.add(n4);

        n3.setBackground(new java.awt.Color(204, 255, 255));
        n3.setText("3");
        Numeral.add(n3);

        n2.setBackground(new java.awt.Color(204, 255, 255));
        n2.setText("2");
        Numeral.add(n2);

        n1.setBackground(new java.awt.Color(204, 255, 255));
        n1.setText("1");
        Numeral.add(n1);

        no0.setBackground(new java.awt.Color(204, 255, 255));
        no0.setText("0");
        Numeral.add(no0);

        nPunto.setBackground(new java.awt.Color(204, 255, 255));
        nPunto.setText(".");
        Numeral.add(nPunto);

        Operadores.setBackground(new java.awt.Color(255, 255, 255));
        Operadores.setLayout(new java.awt.GridLayout(6, 0, 0, 5));

        Sumar.setBackground(new java.awt.Color(204, 255, 255));
        Sumar.setText("+");
        Operadores.add(Sumar);

        Resta.setBackground(new java.awt.Color(204, 255, 255));
        Resta.setText("-");
        Operadores.add(Resta);

        Multiplicar.setBackground(new java.awt.Color(204, 255, 255));
        Multiplicar.setText("*");
        Operadores.add(Multiplicar);

        Dividir.setBackground(new java.awt.Color(204, 255, 255));
        Dividir.setText("/");
        Dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DividirActionPerformed(evt);
            }
        });
        Operadores.add(Dividir);

        Igual.setBackground(new java.awt.Color(204, 255, 255));
        Igual.setText("=");
        Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgualActionPerformed(evt);
            }
        });
        Operadores.add(Igual);

        Borrar.setBackground(new java.awt.Color(204, 255, 255));
        Borrar.setText("CE");
        Operadores.add(Borrar);

        javax.swing.GroupLayout BackGround1Layout = new javax.swing.GroupLayout(BackGround1);
        BackGround1.setLayout(BackGround1Layout);
        BackGround1Layout.setHorizontalGroup(
            BackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextoNumerico)
            .addGroup(BackGround1Layout.createSequentialGroup()
                .addComponent(Numeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Operadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BackGround1Layout.setVerticalGroup(
            BackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGround1Layout.createSequentialGroup()
                .addComponent(TextoNumerico, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Numeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Operadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout CalculadoraLayout = new javax.swing.GroupLayout(Calculadora.getContentPane());
        Calculadora.getContentPane().setLayout(CalculadoraLayout);
        CalculadoraLayout.setHorizontalGroup(
            CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        CalculadoraLayout.setVerticalGroup(
            CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalculadoraLayout.createSequentialGroup()
                .addComponent(BackGround1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        BackGround1.getAccessibleContext().setAccessibleName("Calculadora");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelOpcion.setBackground(new java.awt.Color(255, 255, 255));
        PanelOpcion.setLayout(new java.awt.GridLayout(2, 2, 50, 50));

        Form.setText("Formulario");
        Form.setPreferredSize(new java.awt.Dimension(50, 50));
        Form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormActionPerformed(evt);
            }
        });
        PanelOpcion.add(Form);

        Calc.setText("Calculadora");
        Calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcActionPerformed(evt);
            }
        });
        PanelOpcion.add(Calc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelOpcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelOpcion, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcActionPerformed
        Calculadora.setVisible(true);
        Calculadora.setSize(380,520);
    }//GEN-LAST:event_CalcActionPerformed

    private void FormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormActionPerformed
      Formulario.setVisible(true);
      Formulario.setSize(591,428);
    }//GEN-LAST:event_FormActionPerformed

    private void BuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscadoActionPerformed

    private void idNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idNumberActionPerformed

    private void NombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreClienteActionPerformed

    private void ApellidoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoClienteActionPerformed

    private void DireccionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccionClienteActionPerformed

    private void TlfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TlfClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TlfClienteActionPerformed

    private void EmailClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailClienteActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void playRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playRightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playRightActionPerformed

    private void n9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n9ActionPerformed

    private void n8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n8ActionPerformed

    private void DividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DividirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DividirActionPerformed

    private void IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IgualActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private java.awt.TextField ApellidoCliente;
    private javax.swing.JPanel BackGround;
    private javax.swing.JPanel BackGround1;
    private javax.swing.JButton Borrar;
    private javax.swing.JPanel Botones;
    private java.awt.TextField Buscado;
    private javax.swing.JButton Calc;
    private javax.swing.JDialog Calculadora;
    private javax.swing.JLabel Cliente;
    private javax.swing.JLabel Cliente_id;
    private javax.swing.JLabel Direccion;
    private java.awt.TextField DireccionCliente;
    private javax.swing.JButton Dividir;
    private javax.swing.JLabel Email;
    private java.awt.TextField EmailCliente;
    private javax.swing.JButton Form;
    private javax.swing.JDialog Formulario;
    private javax.swing.JButton Igual;
    private javax.swing.JButton Multiplicar;
    private javax.swing.JLabel Nombre;
    private java.awt.TextField NombreCliente;
    private javax.swing.JPanel Numeral;
    private javax.swing.JPanel Operadores;
    private javax.swing.JPanel PanelOpcion;
    private javax.swing.JPanel Parte_Alta;
    private javax.swing.JButton Resta;
    private javax.swing.JButton Sumar;
    private javax.swing.JScrollPane TextoNumerico;
    private javax.swing.JLabel Tlf;
    private java.awt.TextField TlfCliente;
    private javax.swing.JPanel Usuario;
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JButton backStop;
    private javax.swing.JButton backStopRight;
    private javax.swing.JButton delete;
    private java.awt.TextField idNumber;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton n1;
    private javax.swing.JButton n2;
    private javax.swing.JButton n3;
    private javax.swing.JButton n4;
    private javax.swing.JButton n5;
    private javax.swing.JButton n6;
    private javax.swing.JButton n7;
    private javax.swing.JButton n8;
    private javax.swing.JButton n9;
    private javax.swing.JButton nPunto;
    private javax.swing.JButton no0;
    private javax.swing.JButton playLeft;
    private javax.swing.JButton playRight;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
