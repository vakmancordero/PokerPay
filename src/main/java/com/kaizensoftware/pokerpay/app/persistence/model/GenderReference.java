package com.kaizensoftware.pokerpay.app.persistence.model;

import com.kaizensoftware.pokerpay.common.persistence.model.BaseEntity;
import javax.persistence.*;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity(name = "GenderReference")
@Table(name = "GenderReference", schema = "pokerpay")
public class GenderReference extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String description;

}
