package med.voll.api.infra.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import med.voll.api.domain.usuario.Usuario;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;


@Service
public class TokenService {

    public String gerarToken(Usuario usuario){
        try {
            var algorithm = Algorithm.HMAC256("12345678");
           return JWT.create()
                    .withIssuer("Api Voll.mew")
                    .withSubject(usuario.getLogin())
                    .withClaim("id", usuario.getId())
                    .withExpiresAt(dataExpiracao())
                    .sign(algorithm);
        } catch (JWTCreationException exception){
            // Invalid Signing configuration / Couldn't convert Claims.
            throw new RuntimeException("Erroa ao gear token jwt", exception);
        }
    }

    private Instant dataExpiracao() {

        return LocalDateTime.now().plusHours(2).toInstant((ZoneOffset.of("-03:00")));
    }
}
