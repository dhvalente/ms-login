package br.com.loginsocial.mslogin.enums;

import br.com.loginsocial.mslogin.model.UserModel;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.ArrayList;
import java.util.List;

public enum RoleEnum {
    USER(31 , "Usuário"),
    ADMIN(32, "Administrador"),
    EDITOR(33, "Editor"),
    AUTHOR(34 , "Autor");

    private int key;
    private String description;

    RoleEnum(int key, String description) {
        this.key = key;
        this.description = description;
    }

    public int getKey() {
        return key;
    }

    public String getDescription() {
        return description;
    }

}
