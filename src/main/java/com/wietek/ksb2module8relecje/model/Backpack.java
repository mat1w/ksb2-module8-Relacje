package com.wietek.ksb2module8relecje.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "backpacks")
public class Backpack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mark;

    @OneToMany(mappedBy = "backpack")
    private Set<Notpad> notpadSet;


    public Backpack() {
    }

    public Backpack(String mark) {
        this.mark = mark;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Set<Notpad> getNotpadSet() {
        return notpadSet;
    }

    public void setNotpadSet(Set<Notpad> notpadSet) {
        this.notpadSet = notpadSet;
    }
}
