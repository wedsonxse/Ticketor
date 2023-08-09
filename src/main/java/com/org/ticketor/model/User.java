package com.org.ticketor.model;

import com.org.ticketor.dicts.AccessLevelEnum;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String email;
    private String userName;
    private String password;
    private AccessLevelEnum accessLevelEnum;
    private String cpf;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ticket> tickets;

    // Getters e setters
}
