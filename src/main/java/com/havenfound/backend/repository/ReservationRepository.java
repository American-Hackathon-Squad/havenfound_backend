package com.havenfound.backend.repository;

        import com.havenfound.backend.domain.Reservation;
        import org.springframework.data.domain.Sort;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;

        import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}