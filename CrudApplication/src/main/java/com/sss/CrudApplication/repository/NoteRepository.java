package com.sss.CrudApplication.repository;

import com.sss.CrudApplication.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
