package com.matheus.CadastroComSpring.Tarefas;

import com.matheus.CadastroComSpring.Funcionarios.FuncionarioModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_tarefas")
public class TarefasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String dificuldade;

    // Tarefas pode ter varios funcionarios
    @OneToMany(mappedBy = "tarefasModel")
    private List<FuncionarioModel> funcionarioModelList;

    public TarefasModel() {
    }

    public TarefasModel(Long id, String name, String dificuldade) {
        this.id = id;
        this.name = name;
        this.dificuldade = dificuldade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }
}
