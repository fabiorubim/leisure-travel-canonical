package br.com.leisuretravel.canonical.hotels.city;

import java.math.BigDecimal;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HotelResource {
	
	private Integer id;
	private String name;
	private Integer cityCode;
	private String cityName;
	private List<Room> rooms;
	private BigDecimal totalPrice;
}
