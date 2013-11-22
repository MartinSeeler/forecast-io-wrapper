package de.chasmo.forecastio.data;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author Martin Seeler <developer@chasmo.de>
 * @since 23.11.13 - 00:34
 */
public class DailyDataPoint extends MinutelyDataPoint {

    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Members / Fields
    // ===========================================================

    private long mSunriseTime;

    private long mSunsetTime;

    // ===========================================================
    // Constructors
    // ===========================================================

    // ===========================================================
    // Methods
    // ===========================================================

    // ===========================================================
    // Getter & Setter
    // ===========================================================

    @JsonProperty("sunriseTime")
    public long getSunriseTime() {
        return mSunriseTime;
    }

    @JsonProperty("sunriseTime")
    public void setSunriseTime(long pSunriseTime) {
        mSunriseTime = pSunriseTime;
    }

    @JsonProperty("sunsetTime")
    public long getSunsetTime() {
        return mSunsetTime;
    }

    @JsonProperty("sunsetTime")
    public void setSunsetTime(long pSunsetTime) {
        mSunsetTime = pSunsetTime;
    }


    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
