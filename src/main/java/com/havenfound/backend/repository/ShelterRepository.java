package com.havenfound.backend.repository;

import com.havenfound.backend.domain.Shelter;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ShelterRepository extends JpaRepository<Shelter, Long> {

    @Query(
            value = "SELECT * FROM SHELTER s WHERE s.capacity > 0",
            nativeQuery = true)
    List<Shelter> findSheltersWithCapacity();
}
