package com.forumhub.topico;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastrarTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,
        @NotBlank
        String curso
) {
}
