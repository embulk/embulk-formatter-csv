package org.embulk.spi.time;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

// org.embulk.spi.time.TimestampFormat is deprecated.
// It won't be removed very soon at least until Embulk v0.10.
@Deprecated
public class TimestampFormat {
    @JsonCreator
    public TimestampFormat(final String format) {
        this.format = format;
    }

    @JsonValue
    public String getFormat() {
        return this.format;
    }

    private final String format;
}
