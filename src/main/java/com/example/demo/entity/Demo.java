package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "")
public class Demo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

//    @ManyToOne //(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "customer_details_id")
//private ClientDetails clientDetails;

//    @OneToMany(mappedBy = "assetDetails", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
}
