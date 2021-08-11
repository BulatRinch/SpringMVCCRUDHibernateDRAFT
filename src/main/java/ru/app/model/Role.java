package ru.app.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.Transient;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
@Transient
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;

    @Column(unique = true, name = "name")
    private String name;

    @ManyToMany(mappedBy = "role")
    private Set<User> users;

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public Set<User> getUser() {
        return users;
    }

    public void setUser(Set<User> users) {
        this.users = users;
    }

    @Override
    public String getAuthority() {
        return name;
    }

}