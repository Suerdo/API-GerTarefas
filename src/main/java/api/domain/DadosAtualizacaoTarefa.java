package api.domain;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosAtualizacaoTarefa(
        @NotNull Long id,
        String titulo,
        String descricao,
        Prioridade prioridade,
        LocalDateTime data,
        Boolean concluido
) {
}
