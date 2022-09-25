/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estoque.dao;

import com.estoque.banco.ConexaoBD;

/**
 *
 * @author mathe
 */
public class AlunoDao extends ConexaoBD {

   /* public boolean daoSalvarAluno(ModelDocumentos modelDocumentos, ModelContato modelContato,
            ModelCurso modelCurso, ModelTurma modelTurma, ModelTurno modelTurno, ModelHorario modelHorario,
            ModelEndereco modelEndereco, ModelAluno modelAluno
    ) {

        String salvarAluno = "call sp_aluno_save ("
                + "'" + modelAluno.getNome() + "',"
                + "'" + modelAluno.getNomeMae() + "',"
                + "'" + modelAluno.getNomePai() + "',"
                + "'" + modelAluno.getEstado_civil() + "',"
                + "'" + modelAluno.getDt_Nascimento() + "',"
                + "'" + modelAluno.getSexo() + "',"
                
                + "'" + modelDocumentos.getRg() + "',"
                + "'" + modelDocumentos.getCpf() + "',"
                
                + "'" + modelContato.getFone() + "',"
                + "'" + modelContato.getEmail() + "',"
                
                + "'" + modelCurso.getNome_curso() + "',"
                + "'" + modelCurso.getValor_curso() + "',"
                
                + "'" + modelTurma.getTurma_curso() + "',"
                
                + "'" + modelTurno.getTurno() + "',"
                
                + "'" + modelHorario.getHora_curso() + "',"
                + "'" + modelHorario.getDia_curso() + "',"
                
                + "'" + modelEndereco.getCep() + "',"
                + "'" + modelEndereco.getLogradouro() + "',"
                + "'" + modelEndereco.getBairro() + "',"
                + "'" + modelEndereco.getNumecoCasa() + "',"
                + "'" + modelEndereco.getComplemento() + "'"
                + ")";
        try {
            this.getConectar();
            this.executarSql(salvarAluno);
            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }

    }*/

}
