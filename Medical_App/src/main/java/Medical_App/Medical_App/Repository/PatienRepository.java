package Medical_App.Medical_App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Medical_App.Medical_App.entities.Patien;

@Repository
public interface PatienRepository  extends JpaRepository<Patien, Integer> {


}

