package br.com.amaral.passin.repositories;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import br.com.amaral.passin.domain.attendee.Attendee;

@DataJpaTest
@ActiveProfiles("test")
public class AttendeeRepositoryTest {
    

    @Autowired
    private AttendeeRepository attendeeRepository;

    @Test
    @DisplayName("Should not return a attendee")
    void findByEventEventIdAndEmailCase1() {
        Optional<Attendee> result = this.attendeeRepository.findByEventEventIdAndEmail("94834k3j2k", "teste@email.com");
        assertThat(result.isEmpty()).isTrue();
    }
}
