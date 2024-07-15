package api.domain;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosCadastroTarefa(
        @NotBlank
        String titulo,
        @NotBlank
        String descricao,
        @NotNull
        Prioridade prioridade,
        @NotNull
        @Future
        LocalDateTime data
) {
}
