package pe.com.gestion.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.com.gestion.main.entity.Usuario;

@Repository 
public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {

}
