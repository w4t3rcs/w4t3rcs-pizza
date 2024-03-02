package com.w4t3rcs.pizza.model.entity;

import jakarta.persistence.Embeddable;
import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Price {
    private float value;
    private String currency;
}
