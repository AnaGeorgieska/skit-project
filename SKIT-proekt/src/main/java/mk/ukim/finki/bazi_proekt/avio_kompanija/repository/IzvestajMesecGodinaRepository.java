package mk.ukim.finki.bazi_proekt.avio_kompanija.repository;

import mk.ukim.finki.bazi_proekt.avio_kompanija.view.IzvestajMesecGodina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IzvestajMesecGodinaRepository extends JpaRepository<IzvestajMesecGodina, String> {
}
