package br.com.leisuretravel.canonical.hotels.city;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Price {
	
	private BigDecimal adult;
	private BigDecimal child;
}
