package com.wietek.ksb2module8relecje.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "notepads")
public class Notpad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @ManyToOne
    private Backpack backpack;
    @OneToMany
    @JoinColumn(name = "notpadID")
    private Set<Note> noteSet;

    public Notpad() {
    }

    public Notpad(String title) {
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }

    public Set<Note> getNoteSet() {
        return noteSet;
    }

    public void setNoteSet(Set<Note> noteSet) {
        this.noteSet = noteSet;
    }
}
