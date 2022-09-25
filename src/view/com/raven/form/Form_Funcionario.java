package view.com.raven.form;

import com.estoque.banco.ConexaoBD;
import com.estoque.controller.ControllerFuncionario;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import view.com.raven.swing.Table;

public class Form_Funcionario extends javax.swing.JPanel {

    ConexaoBD con = new ConexaoBD();

    ControllerFuncionario controllerFuncionario = new ControllerFuncionario();
    

    public Form_Funcionario() {
        initComponents();
        desabilitarCampos();
        desabilitarBotao();
        con.getConectar();
        //carregarTabelaFuncionarios("call sp_list_funcionarios()");
    }

    public void limparCampos() {
        Fone.setText("");
        Email.setText("");
        NomeFuncionario.setText("");
        Nascimento.setText("");
        Login.setText("");
        Password.setText("");
        RG.setText("");
        CPF.setText("");
        Cep.setText("");
        Logradouro.setText("");
        Bairro.setText("");
        NumeroCasa.setText("");
        Complemento.setText("");
    }

    public final void desabilitarCampos() {
        Fone.setEnabled(false);
        Email.setEnabled(false);
        NomeFuncionario.setEnabled(false);
        EstadoCivil.setEnabled(false);
        Nascimento.setEnabled(false);
        Sexo.setEnabled(false);
        Perfil.setEnabled(false);
        Login.setEnabled(false);
        Password.setEnabled(false);
        RG.setEnabled(false);
        CPF.setEnabled(false);
        Cep.setEnabled(false);
        Logradouro.setEnabled(false);
        Bairro.setEnabled(false);
        NumeroCasa.setEnabled(false);
        Complemento.setEnabled(false);
        Cargo.setEnabled(false);
    }

    public void habilitarCampos() {
        Fone.setEnabled(true);
        Email.setEnabled(true);
        NomeFuncionario.setEnabled(true);
        EstadoCivil.setEnabled(true);
        Nascimento.setEnabled(true);
        Sexo.setEnabled(true);
        Perfil.setEnabled(true);
        Login.setEnabled(true);
        Password.setEnabled(true);
        RG.setEnabled(true);
        CPF.setEnabled(true);
        Cep.setEnabled(true);
        Logradouro.setEnabled(true);
        Bairro.setEnabled(true);
        NumeroCasa.setEnabled(true);
        Complemento.setEnabled(true);
        Cargo.setEnabled(true);
    }

    public final void desabilitarBotao() {
        btnAlterar.setEnabled(false);
        btnNovo.setEnabled(true);
        btnBuscarCep.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnRemover.setEnabled(false);
        btnSalvar.setEnabled(false);
    }

    public void habilitarBotao() {
        btnAlterar.setEnabled(true);
        btnBuscarCep.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnNovo.setEnabled(false);
        btnRemover.setEnabled(true);
        btnSalvar.setEnabled(true);
    }

    
    /**
     * carregar tabela clientes
     *
     * @param Sql
     */

    /**public void carregarTabelaFuncionarios(String Sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Nome", "Data Nascimento", "RG", "CPF", "Login", "Fone", "Email", "Cargo"};
        con.getConectar();
        con.executarSql(Sql);

        try {
            con.getResultSet().first();
            do {
                dados.add(new Object[]{con.getResultSet().getString("nome"), con.getResultSet().getString("dt_nascimento"),
                    con.getResultSet().getString("rg"), con.getResultSet().getString("cpf"), con.getResultSet().getString("login"),
                    con.getResultSet().getString("fone"), con.getResultSet().getString("email"), con.getResultSet().getString("cargo")});
            } while (con.getResultSet().next());
        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Busque Novamente");
        }
        TabelaFuncionarios tabelafuncionarios = new TabelaFuncionarios(dados, colunas);
        table_Funcionarios.setModel(tabelafuncionarios);
        table_Funcionarios.getColumnModel().getColumn(0).setPreferredWidth(160);
        table_Funcionarios.getColumnModel().getColumn(0).setResizable(false);
        table_Funcionarios.getColumnModel().getColumn(1).setPreferredWidth(110);
        table_Funcionarios.getColumnModel().getColumn(1).setResizable(false);
        table_Funcionarios.getColumnModel().getColumn(2).setPreferredWidth(80);
        table_Funcionarios.getColumnModel().getColumn(2).setResizable(false);
        table_Funcionarios.getColumnModel().getColumn(3).setPreferredWidth(100);
        table_Funcionarios.getColumnModel().getColumn(3).setResizable(false);
        table_Funcionarios.getColumnModel().getColumn(4).setPreferredWidth(130);
        table_Funcionarios.getColumnModel().getColumn(4).setResizable(false);
        table_Funcionarios.getColumnModel().getColumn(5).setPreferredWidth(130);
        table_Funcionarios.getColumnModel().getColumn(5).setResizable(false);
        table_Funcionarios.getColumnModel().getColumn(6).setPreferredWidth(160);
        table_Funcionarios.getColumnModel().getColumn(6).setResizable(false);
        table_Funcionarios.getColumnModel().getColumn(7).setPreferredWidth(100);
        table_Funcionarios.getColumnModel().getColumn(7).setResizable(false);

        table_Funcionarios.getTableHeader().setReorderingAllowed(false);
        table_Funcionarios.setAutoResizeMode(table_Funcionarios.AUTO_RESIZE_OFF);
        table_Funcionarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lab = new javax.swing.JLabel();
        Cep = new javax.swing.JFormattedTextField();
        NomeFuncionario = new javax.swing.JTextField();
        btnBuscarCep = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Logradouro = new javax.swing.JTextField();
        EstadoCivil = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Bairro = new javax.swing.JTextField();
        Nascimento = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NumeroCasa = new javax.swing.JTextField();
        Sexo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        Complemento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        RG = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        CPF = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        Login = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        Cargo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Fone = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        Perfil = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Funcionarios = new javax.swing.JTable();

        setBackground(new java.awt.Color(242, 238, 238));

        jLabel1.setText("Nome:");

        lab.setText("Cep:");

        try {
            Cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Cep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CepActionPerformed(evt);
            }
        });

        btnBuscarCep.setText("buscar");
        btnBuscarCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCepActionPerformed(evt);
            }
        });

        jLabel2.setText("Estado Civil:");

        jLabel5.setText("Logradouro:");

        Logradouro.setEditable(false);

        EstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro(a)", "Casado(a)", "Viúvo(a)", "Separado judicialmente(a)", "Divorciado(a)" }));

        jLabel3.setText("Data de Nascimento:");

        jLabel6.setText("Bairro:");

        Bairro.setEditable(false);

        try {
            Nascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setText("Nº");

        jLabel4.setText("Sexo:");

        Sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        jLabel8.setText("Complemento:");

        jLabel9.setText("RG:");

        try {
            RG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel10.setText("CPF:");

        try {
            CPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel11.setText("Login:");

        jLabel12.setText("Senha:");

        Cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Atendente", "Professor" }));

        jLabel15.setText("Cargo:");

        jLabel14.setText("Email:");

        try {
            Fone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel13.setText("Fone:");

        Perfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Atendente", " " }));

        jLabel16.setText("Perfil:");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");

        btnRemover.setText("Remover");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        table_Funcionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table_Funcionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_FuncionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_Funcionarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Complemento))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(NomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lab)
                                .addGap(22, 22, 22)
                                .addComponent(Cep, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarCep)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Fone, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(82, 82, 82))
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(Cargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(RG, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Login))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(EstadoCivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Sexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NumeroCasa)
                                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(btnNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab)
                    .addComponent(Cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(NumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCep))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(RG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(Fone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnAlterar)
                    .addComponent(btnRemover)
                    .addComponent(btnCancelar))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CepActionPerformed

    }//GEN-LAST:event_CepActionPerformed

    private void btnBuscarCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCepActionPerformed
       
    }//GEN-LAST:event_btnBuscarCepActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        habilitarBotao();
        habilitarCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //gravarFuncionarios();;
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
        desabilitarBotao();
        desabilitarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void table_FuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_FuncionariosMouseClicked
        String nome = "" + table_Funcionarios.getValueAt(table_Funcionarios.getSelectedRow(), 0);
        con.getConectar();
        con.executarSql("select p.nome, p.estado_civil, p.dt_nascimento, p.sexo, c.fone, c.email,  u.perfil, u.login, u.password, fun.cargo, d.rg, d.cpf, e.cep, e.logradouro, e.bairro, e.numeroCasa, e.complemento  from tb_funcionarios fun inner join tb_users u on u.id = fun.id_user_funcionarios inner join tb_pessoa p on p.id  = u.id_pessoa \n"
                + "inner join tb_contato c on c.id = p.id_contato inner join tb_documentos d on d.id = fun.id_documentos_funcionarios \n"
                + "inner join tb_endereco e on e.id = fun.id_endereco_funcionarios where nome='" + nome + "'");
        try {
            con.getResultSet().first();

            NomeFuncionario.setText(con.getResultSet().getString("nome"));
            Nascimento.setText(con.getResultSet().getString("dt_nascimento"));
            Cep.setText(con.getResultSet().getString("cep"));
            Logradouro.setText(con.getResultSet().getString("logradouro"));
            Bairro.setText(con.getResultSet().getString("bairro"));
            NumeroCasa.setText(con.getResultSet().getString("numeroCasa"));
            Complemento.setText(con.getResultSet().getString("complemento"));
            RG.setText(con.getResultSet().getString("rg"));
            CPF.setText(con.getResultSet().getString("cpf"));
            Login.setText(con.getResultSet().getString("login"));
            Password.setText(con.getResultSet().getString("password"));
            Fone.setText(con.getResultSet().getString("fone"));
            Email.setText(con.getResultSet().getString("email"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no ao selecionar os dados" + ex);
        }
    }//GEN-LAST:event_table_FuncionariosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bairro;
    private javax.swing.JFormattedTextField CPF;
    private javax.swing.JComboBox<String> Cargo;
    private javax.swing.JFormattedTextField Cep;
    private javax.swing.JTextField Complemento;
    private javax.swing.JTextField Email;
    private javax.swing.JComboBox<String> EstadoCivil;
    private javax.swing.JFormattedTextField Fone;
    private javax.swing.JTextField Login;
    private javax.swing.JTextField Logradouro;
    private javax.swing.JFormattedTextField Nascimento;
    private javax.swing.JTextField NomeFuncionario;
    private javax.swing.JTextField NumeroCasa;
    private javax.swing.JPasswordField Password;
    private javax.swing.JComboBox<String> Perfil;
    private javax.swing.JFormattedTextField RG;
    private javax.swing.JComboBox<String> Sexo;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscarCep;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lab;
    private javax.swing.JTable table_Funcionarios;
    // End of variables declaration//GEN-END:variables
}
