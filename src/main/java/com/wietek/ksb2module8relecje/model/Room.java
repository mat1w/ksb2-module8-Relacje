package com.wietek.ksb2module8relecje.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int roomNo;
    @ManyToMany(mappedBy = "roomSet")
    private Set<Cleaner> cleanerSet;

    public Room() {
    }

    public Room(int roomNo) {
        this.roomNo = roomNo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public Set<Cleaner> getCleanerSet() {
        return cleanerSet;
    }

    public void setCleanerSet(Set<Cleaner> cleanerSet) {
        this.cleanerSet = cleanerSet;
    }
}
