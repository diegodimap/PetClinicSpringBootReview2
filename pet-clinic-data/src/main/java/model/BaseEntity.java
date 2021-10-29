package model;

import java.io.Serializable;

/*
Created on 10/29/21 by Diego Oliveira
 */
public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
