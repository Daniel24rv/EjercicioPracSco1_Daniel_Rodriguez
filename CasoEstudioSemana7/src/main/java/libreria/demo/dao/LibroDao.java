
package libreria.demo.dao;

import libreria.demo.domain.libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroDao extends JpaRepository <libro,Long>{
    
}
