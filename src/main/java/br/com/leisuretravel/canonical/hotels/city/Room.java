package br.com.leisuretravel.canonical.hotels.city;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Room {

	private Integer roomID;
	private String categoryName;
	private Price price;
}
