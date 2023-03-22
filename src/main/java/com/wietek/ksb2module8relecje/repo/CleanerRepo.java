package com.wietek.ksb2module8relecje.repo;

import com.wietek.ksb2module8relecje.model.Cleaner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CleanerRepo extends JpaRepository<Cleaner, Long> {
}
