package com.kaizensoftware.pokerpay.app.persistence.model.auth;

import com.kaizensoftware.pokerpay.app.persistence.model.GenderReference;
import com.kaizensoftware.pokerpay.common.persistence.model.BaseEntity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity(name = "User")
@Table(name = "User", schema = "pokerpay")
public class User extends BaseEntity {

    @Column(length = 60, unique = true, nullable = false)
    private String email;

    @Column(length = 150, nullable = false)
    private String password;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 100, nullable = false)
    private String lastName;

    @Column(length = 15)
    private String phone;

    @Column(length = 10)
    private String phoneRegion;

    @Column
    private LocalDate birthday;

    @Column(columnDefinition = "TEXT")
    private String aboutMe;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gender_reference_id")
    private GenderReference genderReference;

    @Column(nullable = false)
    private boolean enabled;

    @Column(unique = true)
    private String confirmationToken;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private List<Role> roles = new ArrayList<>();

}
