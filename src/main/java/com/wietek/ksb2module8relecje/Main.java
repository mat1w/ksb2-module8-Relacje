package com.wietek.ksb2module8relecje;

import com.wietek.ksb2module8relecje.model.*;
import com.wietek.ksb2module8relecje.repo.*;
import org.springframework.stereotype.Controller;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class Main {

    public Main(StudentRepo studentRepo,
                BackpackRepo backpackRepo,
                NotepadRepo notepadRepo,
                ProfessorRepo professorRepo,
                RoomRepo roomRepo,
                CleanerRepo cleanerRepo,
                NoteRepo noteRepo) {

        //backpack
        Backpack backpackNike = new Backpack("Nike");
        Backpack backpackAdidas = new Backpack("Adidas");

        //note
        Note note1 = new Note(663);
        Note note2 = new Note(496);
        Set<Note> noteSet1 = Stream.of(note1, note2).collect(Collectors.toSet());

        Note note3 = new Note(555);
        Note note4 = new Note(999);
        Set<Note> noteSet2 = Stream.of(note3, note4).collect(Collectors.toSet());


        //notepad
        Notpad notpad1 = new Notpad("History");
        Notpad notpad2 = new Notpad("IT");
        notpad1.setBackpack(backpackNike);
        notpad2.setBackpack(backpackNike);
        notpad1.setNoteSet(noteSet1);
        notpad2.setNoteSet(noteSet2);



        //student
        Student studentNcb = new Student("Karol", "Zdolny", "165 NCB");
        studentNcb.setBackpack(backpackNike);

        Student studentNca = new Student("Janusz", "Leniuch", "175 NCA");
        studentNca.setBackpack(backpackAdidas);

        Set<Student> studentSet = Stream.of(studentNcb, studentNca).collect(Collectors.toSet());

        //room
        Room room1 = new Room(39);
        Room room2 = new Room(11);
        Set<Room> roomSet = Stream.of(room1, room2).collect(Collectors.toSet());

        //profesor
        Professor professor1 = new Professor("Jan", "Brzechwa", "Ph.D.");
        professor1.setRoom(room1);
        Professor professor2 = new Professor("Katarzyna", "Kos", "Prof");
        professor2.setRoom(room2);
        Set<Professor> professorSet = Stream.of(professor1, professor2).collect(Collectors.toSet());

        studentNcb.setProfessorSet(professorSet);
        studentNca.setProfessorSet(professorSet);

        professor1.setStudentSet(studentSet);
        professor2.setStudentSet(studentSet);

        //cleaner
        Cleaner cleaner1 = new Cleaner("Basia", "Kowalska");
        Cleaner cleaner2 = new Cleaner("Zygmunt", "Bajeczny");
        Set<Cleaner> cleanerSet = Stream.of(cleaner1,cleaner2).collect(Collectors.toSet());

        room1.setCleanerSet(cleanerSet);
        room2.setCleanerSet(cleanerSet);

        cleaner1.setRoomSet(roomSet);
        cleaner2.setRoomSet(roomSet);



        //save to DB
        backpackRepo.save(backpackNike);
        backpackRepo.save(backpackAdidas);

        noteRepo.save(note1);
        noteRepo.save(note2);
        noteRepo.save(note3);
        noteRepo.save(note4);

        notepadRepo.save(notpad1);
        notepadRepo.save(notpad2);

        studentRepo.save(studentNcb);
        studentRepo.save(studentNca);

        roomRepo.save(room1);
        roomRepo.save(room2);

        cleanerRepo.save(cleaner1);
        cleanerRepo.save(cleaner2);

        professorRepo.save(professor1);
        professorRepo.save(professor2);
    }


}
