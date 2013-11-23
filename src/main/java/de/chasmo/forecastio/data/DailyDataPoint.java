package de.chasmo.forecastio.data;

import com.google.gag.annotation.remark.RTFM;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author Martin Seeler <developer@chasmo.de>
 * @since 23.11.13 - 00:34
 */
@RTFM("https://developer.forecast.io/docs/v2")
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DailyDataPoint extends MinutelyDataPoint {

    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Members / Fields
    // ===========================================================

    /** UNIX time of sunrise at this day. */
    private long mSunriseTime;

    /** UNIX time of sunset at this day. */
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

    /**
     * The UNIX time (that is, seconds since midnight GMT on 1 Jan 1970) of sunrise on the given day. (If no sunrise
     * will occur on the given day, then the field will be 0. This can occur during summer and winter in
     * very high or low latitudes.)
     *
     * @return The UNIX time of sunrise if available, <code>0</code> otherwise.
     */
    @JsonProperty("sunriseTime")
    public long getSunriseTime() {
        return mSunriseTime;
    }

    @JsonProperty("sunriseTime")
    public void setSunriseTime(long pSunriseTime) {
        mSunriseTime = pSunriseTime;
    }

    /**
     * The UNIX time (that is, seconds since midnight GMT on 1 Jan 1970) of sunset on the given day. (If no sunset
     * will occur on the given day, then the field will be 0. This can occur during summer and winter in
     * very high or low latitudes.)
     *
     * @return The UNIX time of sunset if available, <code>0</code> otherwise.
     */
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
