package com.forumhub.topico;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarTopico(
        @NotNull
        Long id,
        String titulo,
        String mensagem,
        String curso
) {
}
