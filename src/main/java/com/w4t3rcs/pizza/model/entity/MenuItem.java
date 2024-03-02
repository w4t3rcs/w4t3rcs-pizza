package com.w4t3rcs.pizza.model.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MenuItem extends Ingredient {
    @Embedded
    public Price price;
    @ToString.Exclude
    @OneToMany
    public List<Ingredient> ingredients;
}
