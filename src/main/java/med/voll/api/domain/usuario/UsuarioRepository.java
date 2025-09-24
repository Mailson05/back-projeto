package med.voll.api.domain.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
    UserDetails findByLogin(String login);
}
// Cada entidade vai ter um repository, para poder persistir no banco
