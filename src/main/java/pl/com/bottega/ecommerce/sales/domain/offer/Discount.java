package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Discount {
	
	private String discountId;
	private String discountCause;
	private BigDecimal discount;
	
	public Discount(String discountId, String discountCause, BigDecimal discount) {
		this.discountId = discountId;
		this.discountCause = discountCause;
		this.discount = discount;
	}

	public String getDiscountId() {
		return discountId;
	}

	public String getDiscountCause() {
		return discountCause;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((discount == null) ? 0 : discount.hashCode());
		result = prime * result + ((discountCause == null) ? 0 : discountCause.hashCode());
		result = prime * result + ((discountId == null) ? 0 : discountId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Discount other = (Discount) obj;
		if (discount == null) {
			if (other.discount != null)
				return false;
		} else if (!discount.equals(other.discount))
			return false;
		if (discountCause == null) {
			if (other.discountCause != null)
				return false;
		} else if (!discountCause.equals(other.discountCause))
			return false;
		if (discountId == null) {
			if (other.discountId != null)
				return false;
		} else if (!discountId.equals(other.discountId))
			return false;
		return true;
	}

}