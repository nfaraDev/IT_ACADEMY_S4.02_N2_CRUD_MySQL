package cat.itacademy.barcelonactiva.fara.natalia.s04.t02.n02.repository;

import cat.itacademy.barcelonactiva.fara.natalia.s04.t02.n02.domain.Entity_Domain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrutaRepository extends JpaRepository <Entity_Domain, Long> {

}
