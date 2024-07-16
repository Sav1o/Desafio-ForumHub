package com.forumhub.topico;

public record DadosListagemTopico(
        Long id,
        String titulo,
        String mensagem,
        String autor,
        String curso,
        Boolean estadoTopico,
        String dataCriacao
) {
    public DadosListagemTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getAutor(), topico.getMensagem(), topico.getCurso(), topico.getEstadoTopico(), topico.getDataCriacao().toString()
        );
    }
}
