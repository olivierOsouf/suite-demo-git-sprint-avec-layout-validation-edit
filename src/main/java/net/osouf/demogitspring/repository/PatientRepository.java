package net.osouf.demogitspring.repository;

import net.osouf.demogitspring.entities.Patient;


import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    PageImpl<Patient> findByNomContains(String keyword,Pageable pageable);

    @Query("select p from Patient p where p.nom like :x")
    PageImpl<Patient> chercher(@Param("x") String keyword, Pageable pageable);


    List<Patient> id(Long id);
}
