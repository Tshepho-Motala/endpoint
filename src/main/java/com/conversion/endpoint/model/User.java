package com.conversion.endpoint.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class User<T> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private BigDecimal amount = null;
    private Status status = null;
    private final T data;
    private Integer code = null;
    private final String message;

    public User(T data, String message) {
        this.id = id;
        this.amount = amount;
        this.status = status;
        this.data = data;
        this.code = code;
        this.message = message;
    }

}
