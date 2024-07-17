package api.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "tarefas")
@Entity(name = "Tarefa")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;
    private LocalDateTime data;
    private Boolean concluido;

    public Tarefa(DadosCadastroTarefa dados){
        this.titulo = dados.titulo();
        this.descricao = dados.descricao();
        this.prioridade = dados.prioridade();
        this.data = dados.data();
        this.concluido = false;
    }

    public void atualizarInformacoes(DadosAtualizacaoTarefa dados) {
        if(dados.titulo() != null) {
            this.titulo = dados.titulo();
        }
        if(dados.descricao() != null) {
            this.descricao = dados.descricao();
        }
        if(dados.prioridade() != null) {
            this.prioridade = dados.prioridade();
        }
        if(dados.data() != null) {
            this.data = dados.data();
        }
        if(dados.concluido() != null) {
            this.concluido = dados.concluido();
        }
    }
}
