package com.havenfound.backend.repository;

import com.havenfound.backend.domain.Seeker;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.GeneratedValue;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Seeker, Long> {
    public List<Seeker> findAll();
}
