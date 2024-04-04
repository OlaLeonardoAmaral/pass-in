package br.com.amaral.passin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.amaral.passin.domain.attendee.Attendee;

public interface AttendeeRepository extends JpaRepository<Attendee, String> {
    List<Attendee> findByEventEventId(String eventId);
}
