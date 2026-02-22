package com.universidade.gestaoacademica.controller;

import com.universidade.gestaoacademica.model.Aluno;
import com.universidade.gestaoacademica.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Diz ao Spring que esta classe vai responder a requisições web (API REST)
@RequestMapping("/alunos") // Define que todas as URLs desta classe vão começar com localhost:8080/alunos
public class AlunoController {

    // A anotação @Autowired faz a "Injeção de Dependência".
    // O Spring pega aquele AlunoRepository que criamos e injeta aqui para podermos usar.
    @Autowired
    private AlunoRepository alunoRepository;

    // Rota GET: Usada para BUSCAR dados
    @GetMapping
    public List<Aluno> listarTodos() {
        // Vai no banco de dados, busca todos os alunos e retorna como uma lista JSON
        return alunoRepository.findAll();
    }

    // Rota POST: Usada para ENVIAR/CRIAR novos dados
    @PostMapping
    public Aluno criarAluno(@RequestBody Aluno aluno) {
        // O @RequestBody pega o JSON que o usuário enviou e transforma na nossa classe Aluno.
        // O save() guarda esse aluno no banco de dados e retorna o aluno salvo (agora com o ID gerado).
        return alunoRepository.save(aluno);
    }
}