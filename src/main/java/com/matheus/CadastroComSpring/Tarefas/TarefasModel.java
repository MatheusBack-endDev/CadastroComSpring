package com.matheus.CadastroComSpring.Tarefas;

import com.matheus.CadastroComSpring.Funcionarios.FuncionarioModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_tarefas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TarefasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String dificuldade;

    // Tarefas pode ter varios funcionarios
    @OneToMany(mappedBy = "tarefasModel")
    private List<FuncionarioModel> funcionarioModelList;


}
