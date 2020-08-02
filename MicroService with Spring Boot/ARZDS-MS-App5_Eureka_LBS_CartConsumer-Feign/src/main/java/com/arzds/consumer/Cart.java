package com.arzds.consumer;

import lombok.Data;

@Data
public class Cart {
	private int cartId;
	private String cartCode;
	private double cartCost;

	public Cart(int cartId, String cartCode, double cartCost) {
		super();
		this.cartId = cartId;
		this.cartCode = cartCode;
		this.cartCost = cartCost;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", cartCode=" + cartCode + ", cartCost=" + cartCost + "]";
	}

}
