package com.forumhub.topico;


import com.forumhub.domain.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    private Boolean estadoTopico;
    private String autor;
    private String curso;
    private LocalDateTime dataCriacao = LocalDateTime.now();

    public Topico(DadosCadastrarTopico dadosCadastrarTopico, Usuario autor) {
        this.titulo = dadosCadastrarTopico.titulo();
        this.mensagem = dadosCadastrarTopico.mensagem();
        this.estadoTopico = true;
        this.autor = autor.getLogin();
        this.curso = dadosCadastrarTopico.curso();
    }


    public void atualizar(DadosAtualizarTopico dadosAtualizarTopico) {
        if(dadosAtualizarTopico.titulo() != null) {
            this.titulo = dadosAtualizarTopico.titulo();
        }

        if(dadosAtualizarTopico.mensagem() != null) {
            this.mensagem = dadosAtualizarTopico.mensagem();
        }

        if(dadosAtualizarTopico.curso() != null) {
            this.curso = dadosAtualizarTopico.curso();
        }

    }
}
