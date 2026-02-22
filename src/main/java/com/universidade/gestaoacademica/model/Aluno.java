package com.universidade.gestaoacademica.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // Diz ao Spring que esta classe vai virar uma tabela no banco de dados H2
@Table(name = "alunos") // Nome da tabela no banco
@Getter // Lombok: Cria todos os getNome(), getRa(), etc., automaticamente
@Setter // Lombok: Cria todos os setNome(), setRa(), etc., automaticamente
@NoArgsConstructor // Lombok: Cria um construtor vazio (exigência do JPA)
@AllArgsConstructor // Lombok: Cria um construtor com todos os atributos
public class Aluno {

    @Id // Marca este campo como a Chave Primária do banco
    @GeneratedValue(strategy = GenerationType.IDENTITY) // O banco vai gerar esse número (1, 2, 3...) sozinho
    private Long id;

    @Column(nullable = false) // Garante que o banco não aceite um aluno sem nome
    private String nome;

    @Column(unique = true, nullable = false) // O RA precisa ser único, dois alunos não podem ter o mesmo
    private String ra;

    @Column(nullable = false)
    private String curso;

    @Column(unique = true)
    private String email;
}