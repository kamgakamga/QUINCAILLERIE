package com.smartcompany.billingservice.models;

import lombok.Data;

@Data
public class Produit {
	
	private Long id;
	private String name;
	private String marque;
	private double prix;
	private int quantite;
}
