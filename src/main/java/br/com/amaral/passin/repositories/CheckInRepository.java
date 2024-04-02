package br.com.amaral.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.amaral.passin.domain.checkin.CheckIn;

public interface CheckInRepository extends JpaRepository<CheckIn, Integer> {
    
}
