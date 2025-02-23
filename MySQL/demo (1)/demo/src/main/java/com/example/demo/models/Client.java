package com.example.demo.models;

import java.util.List;

import jakarta.persistence.*;

@Entity 
@Table(name = "client")
public class Client{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long cliente_id;

@Column(nullable = false, length = 100)
private int CC;

@Column(nullable = false, length = 100)
private String name;

@Column(nullable = false, length = 100)
private String lastname;

@Column(nullable = false, length = 100)
private String email;

@OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
private List<Receipt> receipt;

public Long getCliente_id() {
    return cliente_id;
}

public void setCliente_id(Long cliente_id) {
    this.cliente_id = cliente_id;
}

public int getCC() {
    return CC;
}

public void setCC(int cC) {
    CC = cC;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getLastname() {
    return lastname;
}

public void setLastname(String lastname) {
    this.lastname = lastname;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public List<Receipt> getReceipt() {
    return receipt;
}

public void setReceipt(List<Receipt> receipt) {
    this.receipt = receipt;
}


}
