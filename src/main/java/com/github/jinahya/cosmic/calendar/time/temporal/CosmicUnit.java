package com.github.jinahya.cosmic.calendar.time.temporal;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;

public enum CosmicUnit implements Comparable<CosmicUnit>, TemporalUnit {

    KA(ChronoUnit.YEARS, 1000L),

    /**
     * A unit of time equal to one million, or 10<sup>6</sup>, years.
     */
    MA(ChronoUnit.YEARS, 1000000L),

    /**
     * A unit of time equal to 10<sup>9</sup> years, or one billion years.
     */
    GA(ChronoUnit.YEARS, 1000000000L),
    TA(ChronoUnit.YEARS, 1000000000000L),
    PA(ChronoUnit.YEARS, 1000000000000000L),
    EA(ChronoUnit.YEARS, 1000000000000000000L);

    // -----------------------------------------------------------------------------------------------------------------
    CosmicUnit(final TemporalUnit unit, final long amount) {
        if (unit == null) {
            throw new NullPointerException("unit is null");
        }
        if (amount <= 0L) {
            throw new IllegalArgumentException("amount(" + amount + ") <= 0L");
        }
        this.unit = unit;
        this.amount = amount;
    }

    // -----------------------------------------------------------------------------------------------------------------
    @SuppressWarnings({"unchecked"})
    @Override
    public <R extends Temporal> R addTo(R temporal, long amount) {
        return (R) temporal.plus(amount * this.amount, this.unit);
    }

    @Override
    public long between(final Temporal temporal1Inclusive, final Temporal temporal2Exclusive) {
        return unit.between(temporal1Inclusive, temporal2Exclusive) / amount;
    }

    @Override
    public Duration getDuration() {
        return unit.getDuration().multipliedBy(amount);
    }

    @Override
    public boolean isDateBased() {
        return unit.isDateBased();
    }

    @Override
    public boolean isDurationEstimated() {
        return unit.isDurationEstimated();
    }

    @Override
    public boolean isTimeBased() {
        return unit.isTimeBased();
    }

    // -----------------------------------------------------------------------------------------------------------------
    private final TemporalUnit unit;
    private final long amount;
}
