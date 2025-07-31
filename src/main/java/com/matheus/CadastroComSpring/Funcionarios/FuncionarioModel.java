package com.matheus.CadastroComSpring.Funcionarios;

import com.matheus.CadastroComSpring.Tarefas.TarefasModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// transforma uma classe em entidade no Banco de Dados
@Entity
@Table(name = "tb_cadastro_de_funcionarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private int idade;

    // O funcionario vai ter uma unica tarefa
    @ManyToOne
    @JoinColumn(name = "tarefas_id") // chave estrangeira
    private TarefasModel tarefasModel;
}
