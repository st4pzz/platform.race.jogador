package insper.store.jogador;
import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record JogadorIn (
    
    String id_user,
    String id_partida,
    String nome,
    String time,
    String posicao,
    Integer idade
) {
    
}
