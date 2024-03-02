package com.w4t3rcs.pizza.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.*;
import org.springframework.data.domain.Persistable;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public class Ingredient implements Persistable<String> {
    @Id
    private String id;
    private String name;

    @Override
    public boolean isNew() {
        return id == null;
    }
}
