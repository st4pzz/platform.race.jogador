package insper.store.jogador;
import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record JogadorOut(
    String id,
    String nome,
    String time,
    String posicao,
    Integer idade,
    Float salario
) {
    
}
