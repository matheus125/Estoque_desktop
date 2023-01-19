package view.com.raven.component;

import com.estoque.banco.ConexaoBD;
import com.estoque.controller.ControllerFuncionario;
import com.estoque.dao.CriptografarSenha;
import com.estoque.model.Funcionarios;
import com.estoque.model.User;
import view.com.raven.model.Model_Card;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CardEmployees extends javax.swing.JPanel {

    int id, flag = 0;

    ConexaoBD con = new ConexaoBD();

    ControllerFuncionario controllerFuncionarios = new ControllerFuncionario();
    Funcionarios employees = new Funcionarios();
    User user = new User();
    ArrayList<User> listEmployees = new ArrayList<>();

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    private Color color1;
    private Color color2;

    public CardEmployees() {
        initComponents();
        setOpaque(false);
        color1 = Color.BLACK;
        color2 = Color.WHITE;
        desabilitarCampos();
        desabilitarBotao();
        loademployeesTable();
    }

    public void limparCampos() {
        txtnome.setText("");
        txtlogin.setText("");
        txtsenha.setText("");

    }

    public final void desabilitarCampos() {
        txtnome.setEnabled(false);
        txtlogin.setEnabled(false);
        txtsenha.setEnabled(false);
        comboFunção.setEnabled(false);
        ComboPerfil.setEnabled(false);
    }

    public void habilitarCampos() {
        txtnome.setEnabled(true);
        txtlogin.setEnabled(true);
        txtsenha.setEnabled(true);
        comboFunção.setEnabled(true);
        ComboPerfil.setEnabled(true);
    }

    public final void desabilitarBotao() {
        btnNovo.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnRemover.setEnabled(false);
        btnCancelar.setEnabled(false);
    }

    public void habilitarBotao() {
        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnAlterar.setEnabled(true);
        btnRemover.setEnabled(true);
        btnCancelar.setEnabled(true);
    }

    public void saveEmployees() {
        employees.setEmployees_name(this.txtnome.getText());
        employees.setEmployees_function((String) this.comboFunção.getSelectedItem());

        user.setLogin(this.txtlogin.getText());
        user.setPassword(CriptografarSenha.encriptografar(this.txtsenha.getText()));
        user.setProfile((String) this.ComboPerfil.getSelectedItem());

        boolean resultado = controllerFuncionarios.controlSaveemployees(employees, user);
        if (resultado == true) {
            JOptionPane.showMessageDialog(this, "Salvo com sucesso!!");
            loademployeesTable();
            limparCampos();
            desabilitarCampos();
            desabilitarBotao();
        }

    }

    public void updateEmployees() {
        employees.setId(this.id);
        employees.setEmployees_name(this.txtnome.getText());
        employees.setEmployees_function((String) this.comboFunção.getSelectedItem());

        user.setLogin(this.txtlogin.getText());
        user.setPassword(CriptografarSenha.encriptografar(this.txtsenha.getText()));
        user.setProfile((String) this.ComboPerfil.getSelectedItem());

        boolean resultado = controllerFuncionarios.controlUpdateemployees(employees, user);
        if (resultado == true) {
            JOptionPane.showMessageDialog(this, "Salvo com sucesso!!");
            loademployeesTable();
            limparCampos();
            desabilitarCampos();
            desabilitarBotao();
        }

    }

    public void setData(Model_Card data) {

        /*lbTitle.setText(data.getTitle());
        lbValues.setText(data.getValues());
        lbDescription.setText(data.getDescription());*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_name = new javax.swing.JLabel();
        lb_login = new javax.swing.JLabel();
        txtlogin = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        lb_function = new javax.swing.JLabel();
        lb_password = new javax.swing.JLabel();
        txtsenha = new javax.swing.JPasswordField();
        comboFunção = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        ComboPerfil = new javax.swing.JComboBox<>();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableUserEmployees = new javax.swing.JTable();

        lb_name.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_name.setForeground(new java.awt.Color(255, 255, 255));
        lb_name.setText("Nome:");

        lb_login.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_login.setForeground(new java.awt.Color(255, 255, 255));
        lb_login.setText("Login:");

        txtlogin.setEnabled(false);

        txtnome.setEnabled(false);

        lb_function.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_function.setForeground(new java.awt.Color(255, 255, 255));
        lb_function.setText("Função:");

        lb_password.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lb_password.setForeground(new java.awt.Color(255, 255, 255));
        lb_password.setText("Password:");

        txtsenha.setEnabled(false);

        comboFunção.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Vendedor", "Caixa", "Estoque" }));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Perfil:");

        ComboPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Caixa", "Estoque" }));

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
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnRemover.setText("Apagar");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        TableUserEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Função", "Login", "Perfil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableUserEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableUserEmployeesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableUserEmployees);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ComboPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(btnNovo)
                        .addGap(3, 3, 3)
                        .addComponent(btnSalvar)
                        .addGap(7, 7, 7)
                        .addComponent(btnAlterar)
                        .addGap(5, 5, 5)
                        .addComponent(btnRemover)
                        .addGap(13, 13, 13)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lb_login, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_name, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_function, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, 0)
                                .addComponent(comboFunção, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_password, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnome, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(lb_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_function, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboFunção, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_login, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_password, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnAlterar)
                    .addComponent(btnRemover)
                    .addComponent(btnCancelar))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        flag = 1;
        habilitarCampos();
        habilitarBotao();
        btnNovo.setEnabled(false);
        btnAlterar.setEnabled(false);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (flag == 1) {
            saveEmployees();
        } else {
            updateEmployees();
        };

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
        desabilitarBotao();
        desabilitarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void TableUserEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableUserEmployeesMouseClicked
        btnAlterar.setEnabled(true);
        String nome = "" + TableUserEmployees.getValueAt(TableUserEmployees.getSelectedRow(), 1);
        con.getConectar();
        con.executarSql("select e.id,e.nome, e.funcao, u.login, u.senha, u.perfil\n"
                + "		from tb_funcionario e inner join tb_user u on e.id = u.id_funcionario where nome ='" + nome + "'");
        try {
            con.getResultSet().first();
            id = Integer.parseInt(con.getResultSet().getString("id"));
            txtnome.setText(con.getResultSet().getString("nome"));
            comboFunção.setSelectedItem(con.getResultSet().getString("funcao"));
            txtlogin.setText(con.getResultSet().getString("login"));
            txtsenha.setText(con.getResultSet().getString("senha"));
            ComboPerfil.setSelectedItem(con.getResultSet().getString("perfil"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no ao selecionar os dados" + ex);
        }
    }//GEN-LAST:event_TableUserEmployeesMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        flag = 2;
        habilitarCampos();
        habilitarBotao();
        btnNovo.setEnabled(false);
        btnAlterar.setEnabled(false);

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoverActionPerformed

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255, 255, 255, 50));
        g2.fillOval(getWidth() - (getHeight() / 2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth() - (getHeight() / 2) - 20, getHeight() / 2 + 20, getHeight(), getHeight());
        super.paintComponent(grphcs);
    }

    public void loademployeesTable() {
        listEmployees = controllerFuncionarios.returnListEmployeesController();
        DefaultTableModel table = (DefaultTableModel) TableUserEmployees.getModel();
        table.setNumRows(0);
        //Inserir dados na tabela
        int cont = listEmployees.size();
        for (int i = 0; i < cont; i++) {
            table.addRow(new Object[]{
                listEmployees.get(i).getEmployees().getId(),
                listEmployees.get(i).getEmployees().getEmployees_name(),
                listEmployees.get(i).getEmployees().getEmployees_function(),
                listEmployees.get(i).getLogin(),
                listEmployees.get(i).getProfile()
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboPerfil;
    private javax.swing.JTable TableUserEmployees;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> comboFunção;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lb_function;
    private javax.swing.JLabel lb_login;
    private javax.swing.JLabel lb_name;
    private javax.swing.JLabel lb_password;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JTextField txtnome;
    private javax.swing.JPasswordField txtsenha;
    // End of variables declaration//GEN-END:variables
}
