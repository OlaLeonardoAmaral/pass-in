package br.com.amaral.passin.services;

import java.text.Normalizer;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.amaral.passin.domain.attendee.Attendee;
import br.com.amaral.passin.domain.event.Event;
import br.com.amaral.passin.domain.event.exceptions.EventNotFoundException;
import br.com.amaral.passin.dto.event.EventIdDTO;
import br.com.amaral.passin.dto.event.EventRequestDTO;
import br.com.amaral.passin.dto.event.EventResponseDTO;
import br.com.amaral.passin.repositories.EventRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;
    private final AttendeeService attendeeService;

    public EventResponseDTO getEventDetail(String eventId) {
        Event event = this.eventRepository.findById(eventId)
                .orElseThrow(() -> new EventNotFoundException("Event not found with ID: " + eventId));

        List<Attendee> attendeeList = this.attendeeService.getAllAttendeesFromEvent(eventId);

        return new EventResponseDTO(event, attendeeList.size());
    }

    public EventIdDTO createEvent(EventRequestDTO eventDTO) {
        Event newEvent = new Event();
        newEvent.setTitle(eventDTO.title());
        newEvent.setDetails(eventDTO.title());
        newEvent.setMaximumAttendees(eventDTO.maximumAttendees());
        newEvent.setSlug(this.createSlug(eventDTO.title()));

        this.eventRepository.save(newEvent);

        return new EventIdDTO(newEvent.getEventId());
    }

    private String createSlug(String text) {
        String normalized = Normalizer.normalize(text, Normalizer.Form.NFD);
        return normalized.replaceAll("[\\p{InCOMBINING_DIACRITICAL_MARKS}]", "")
                .replaceAll("[^\\w\\s]", "")
                .replaceAll("\\s+", "-")
                .toLowerCase();
    }
}