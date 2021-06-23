package com.mongo.demo_mongo.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "users")
public class UserDto {

    @Id
    private String id;

    @Field(name = "login")
    private String login;

    private String password;

    @DBRef
    @Field(name = "addresses")
    private List<AddressesDto> addresses;

    public UserDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public List<AddressesDto> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressesDto> addresses) {
        this.addresses = addresses;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
