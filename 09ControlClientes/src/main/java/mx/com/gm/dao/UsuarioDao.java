package mx.com.gm.dao;

import mx.com.gm.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

                                                //long porque el USUARIO id es long
public interface UsuarioDao extends JpaRepository<Usuario, Long>{
    
    Usuario findByusername(String username);
}
