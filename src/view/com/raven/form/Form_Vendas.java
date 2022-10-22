package view.com.raven.form;

import com.estoque.banco.ConexaoBD;
import com.estoque.controller.ControllerFuncionario;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import view.com.raven.swing.Table;

public class Form_Vendas extends javax.swing.JPanel {

    ConexaoBD con = new ConexaoBD();

    ControllerFuncionario controllerFuncionario = new ControllerFuncionario();
    
    public Form_Vendas() {
        initComponents();
        desabilitarCampos();
        desabilitarBotao();
        con.getConectar();
        //carregarTabelaFuncionarios("call sp_list_funcionarios()");
    }

    public void limparCampos() {
    }

    public final void desabilitarCampos() {
    }

    public void habilitarCampos() {
    }

    public final void desabilitarBotao() {
    /*    btnAlterar.setEnabled(false);
        btnNovo.setEnabled(true);
        btnBuscarCep.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnRemover.setEnabled(false);
        btnSalvar.setEnabled(false);*/
    }

    public void habilitarBotao() {
        /*btnAlterar.setEnabled(true);
        btnBuscarCep.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnNovo.setEnabled(false);
        btnRemover.setEnabled(true);
        btnSalvar.setEnabled(true);*/
    }
    
    private void listarProdutos(){
        
    
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

        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcodigoproduto = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtquantidade = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        txtvalortotal = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        txtdesconto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(242, 238, 238));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CAIXA LIVRE");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 880, 92);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Valor Total:");
        add(jLabel7);
        jLabel7.setBounds(670, 400, 100, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Cod.Produto:");
        add(jLabel8);
        jLabel8.setBounds(40, 100, 100, 20);
        add(txtcodigoproduto);
        txtcodigoproduto.setBounds(40, 130, 180, 30);

        add(jComboBox1);
        jComboBox1.setBounds(230, 130, 300, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Quantidade:");
        add(jLabel9);
        jLabel9.setBounds(540, 100, 100, 20);
        add(txtquantidade);
        txtquantidade.setBounds(540, 130, 180, 30);

        btnAdicionar.setText("Adicionar");
        add(btnAdicionar);
        btnAdicionar.setBounds(730, 130, 90, 30);
        add(txtvalortotal);
        txtvalortotal.setBounds(670, 430, 150, 30);

        btnNovo.setText("Novo");
        add(btnNovo);
        btnNovo.setBounds(140, 470, 70, 23);

        btnCancelar.setText("Cancelar");
        add(btnCancelar);
        btnCancelar.setBounds(50, 470, 80, 23);

        btnSalvar.setText("Salvar");
        add(btnSalvar);
        btnSalvar.setBounds(220, 470, 73, 23);
        add(txtdesconto);
        txtdesconto.setBounds(500, 430, 150, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Desconto:");
        add(jLabel10);
        jLabel10.setBounds(500, 400, 100, 17);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.Prod.", "Nome Produto", "Quantidade", "Valor Un.", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(90);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(90);
            jTable1.getColumnModel().getColumn(2).setMinWidth(70);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(70);
            jTable1.getColumnModel().getColumn(3).setMinWidth(90);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(90);
            jTable1.getColumnModel().getColumn(4).setMinWidth(90);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(90);
        }

        add(jScrollPane2);
        jScrollPane2.setBounds(40, 190, 780, 190);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtcodigoproduto;
    private javax.swing.JTextField txtdesconto;
    private javax.swing.JTextField txtquantidade;
    private javax.swing.JTextField txtvalortotal;
    // End of variables declaration//GEN-END:variables
}