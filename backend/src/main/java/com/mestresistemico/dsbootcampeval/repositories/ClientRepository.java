package com.mestresistemico.dsbootcampeval.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mestresistemico.dsbootcampeval.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
