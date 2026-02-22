package com.universidade.gestaoacademica.repository;

import com.universidade.gestaoacademica.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Diz ao Spring que esta interface lida com o banco de dados
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    // O Spring Data JPA já traz métodos prontos como save(), findAll(), findById(), deleteById().
    // Mas pode criar buscas personalizadas só dando o nome correto ao método!

    // Exemplo: Buscar um aluno pelo RA (O Spring escreve o SQL por si)
    Aluno findByRa(String ra);
}