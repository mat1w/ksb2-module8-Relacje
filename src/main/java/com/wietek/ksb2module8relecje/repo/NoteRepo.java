package com.wietek.ksb2module8relecje.repo;

import com.wietek.ksb2module8relecje.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepo extends JpaRepository<Note, Long> {
}
