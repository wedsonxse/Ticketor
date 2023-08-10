package com.org.ticketor.model;

import com.org.ticketor.dicts.PrivilegeLevelEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "ticket")

public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String serialNumber;

    private PrivilegeLevelEnum privilegeLevel;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "event_id")
    private Event event;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public PrivilegeLevelEnum getPrivilegeLevel() {
        return privilegeLevel;
    }

    public void setPrivilegeLevel(PrivilegeLevelEnum privilegeLevel) {
        this.privilegeLevel = privilegeLevel;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
