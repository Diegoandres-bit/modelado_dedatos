package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Receipt")
public class Receipt{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 100)
    private String descripcion;

    @Column(nullable = false)   
    private Double total;

   @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getDescripcion() {
    return descripcion;
}

public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}

public Double getTotal() {
    return total;
}

public void setTotal(Double total) {
    this.total = total;
}

public Client getClient() {
    return client;
}

public void setClient(Client client) {
    this.client = client;
}
  
    
}