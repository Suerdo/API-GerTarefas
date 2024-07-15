package api.domain;

import java.time.LocalDateTime;

public record DadosDetalhamentoTarefa(Long id, String titulo, String descricao, Prioridade prioridade, LocalDateTime data, Boolean concluido) {
    public DadosDetalhamentoTarefa(Tarefa tarefa){
        this(tarefa.getId(), tarefa.getTitulo(), tarefa.getDescricao(), tarefa.getPrioridade(),tarefa.getData(), tarefa.getConcluido());
    }
}
