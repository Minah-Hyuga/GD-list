package com.example.Data.Entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Paiement {
    private LocalDateTime date;
    private int montant;
}
