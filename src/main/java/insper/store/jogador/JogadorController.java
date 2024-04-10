package insper.store.jogador;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "store-jogador")
public interface JogadorController {

    @PostMapping("/jogador")
    public ResponseEntity<JogadorOut> create(
        @RequestBody(required = true) JogadorIn in
    );


    @PutMapping("/jogador/{id}")
    public ResponseEntity<JogadorOut> update(
        @PathVariable(required = true) String id,
        @RequestBody(required = true) JogadorIn in
    );

    @GetMapping("/jogador")
    public ResponseEntity<JogadorOut> read(
        @RequestHeader(required = true, name = "id-jogador") String idJogador
    );
    
}
