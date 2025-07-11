package com.curso.clase04.dto;

import lombok.Data;

@Data
public class UserDto {

    private int id;
    private String name;
    private String address;
    private String phone;

    public UserDto(int id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

}
