package com.example.SpringBootBatch.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "voltage")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Voltage {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(name = "volt", precision = 10, scale = 4, nullable = false)
    private BigDecimal volt;

    @NotNull
    @Column(name = "time", nullable = false)
    private double time;

    public Voltage(final BigDecimal volt, final double time) {
        this.volt = volt;
        this.time = time;
    }
}
