package com.food.ordering.system.domain.valueobject;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Optional;

public class Money {
    private final BigDecimal amount;

    public static final Money ZERO = new Money(BigDecimal.ZERO);

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public boolean isGreaterThanZero() {
        return Optional.ofNullable(this.amount)
                .map(presentAmount -> presentAmount.compareTo(BigDecimal.ZERO) > 0)
                .orElse(false);
    }

    public boolean isGreaterThan(Money money) {
        return this.amount != null && this.amount.compareTo(money.getAmount()) > 0;
    }

    public Money add(Money money) {
        return new Money(setScale(this.amount).add(setScale(money.getAmount())));
    }

    public Money subtract(Money money) {
        return new Money(setScale(this.amount).subtract(setScale(money.getAmount())));
    }

    public Money multiply(int multiplayer) {
        return new Money(setScale(this.amount).multiply(new BigDecimal(multiplayer)));
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money money)) return false;

        return getAmount().equals(money.getAmount());
    }

    @Override
    public int hashCode() {
        return getAmount().hashCode();
    }

    private BigDecimal setScale(BigDecimal input) {
        return input.setScale(2, RoundingMode.HALF_EVEN);
    }

}
