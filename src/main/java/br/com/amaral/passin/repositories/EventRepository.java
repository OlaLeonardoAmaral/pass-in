package br.com.amaral.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.amaral.passin.domain.event.Event;

public interface EventRepository extends JpaRepository<Event, String> {
    
}
