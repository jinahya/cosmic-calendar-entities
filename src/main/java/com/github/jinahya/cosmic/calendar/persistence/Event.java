package com.github.jinahya.cosmic.calendar.persistence;

import com.github.jinahya.cosmic.calendar.time.temporal.CosmicUnit;

public class Event extends BaseEntity {

    // -----------------------------------------------------------------------------------------------------------------
    public static final String TABLE_NAME = "EVENT";

    // -----------------------------------------------------------------------------------------------------------------
    //public static final String COLUMN_NAME_FUTURE = "FUTURE";

    //public static final String ATTRIBUTE_NAME_FUTURE = "future";

    // -----------------------------------------------------------------------------------------------------------------
    public static final String COLUMN_NAME_UNIT = "UNIT";

    public static final String ATTRIBUTE_NAME_UNIT = "unit";

    // -----------------------------------------------------------------------------------------------------------------
    public static final String COLUMN_NAME_AMOUNT = "AMOUNT";

    public static final String ATTRIBUTE_NAME_AMOUNT = "amount";

    // -----------------------------------------------------------------------------------------------------------------
    public static final String COLUMN_NAME_VALUE = "VALUE_";

    public static final String ATTRIBUTE_NAME_VALUE = "value";
    // -----------------------------------------------------------------------------------------------------------------

    //private boolean future;

    private CosmicUnit unit;

    private long amount;

    private String value;
}
