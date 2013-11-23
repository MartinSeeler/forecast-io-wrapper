package de.chasmo.forecastio;

import com.google.gag.annotation.remark.RTFM;
import de.chasmo.forecastio.data.DailyDataBlock;
import de.chasmo.forecastio.data.HourlyDataBlock;
import de.chasmo.forecastio.data.HourlyDataPoint;
import de.chasmo.forecastio.data.MinutelyDataBlock;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Representing the retrieved forecast from the API with all parsed fields.
 *
 * @author Martin Seeler <developer@chasmo.de>
 * @since 22.11.13 - 23:25
 */
@RTFM("https://developer.forecast.io/docs/v2")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {

    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Members / Fields
    // ===========================================================

    /** The requested latitude. */
    private double mLatitude;

    /** The requested longitude. */
    private double mLongitude;

    /** The IANA timezone name for the requested location. */
    private String mTimezone;

    private int mOffset;

    private HourlyDataPoint mCurrently;

    private MinutelyDataBlock mMinutely;

    private HourlyDataBlock mHourly;

    private DailyDataBlock mDaily;

    // ===========================================================
    // Constructors
    // ===========================================================

    // ===========================================================
    // Methods
    // ===========================================================

    // ===========================================================
    // Getter & Setter
    // ===========================================================

    /** @return The requested latitude. */
    @JsonProperty("latitude")
    public double getLatitude() {
        return mLatitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(double pLatitude) {
        mLatitude = pLatitude;
    }

    /** @return The requested longitude. */
    @JsonProperty("longitude")
    public double getLongitude() {
        return mLongitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(double pLongitude) {
        mLongitude = pLongitude;
    }

    /**
     * The IANA timezone name for the requested location (e.g. <code>America/New_York</code>). This is the timezone used
     * for text forecast summaries and for determining the exact start time of daily data points.
     *
     * @return The IANA timezone name for the requested location.
     */
    @JsonProperty("timezone")
    public String getTimezone() {
        return mTimezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String pTimezone) {
        mTimezone = pTimezone;
    }

    @JsonProperty("offset")
    public int getOffset() {
        return mOffset;
    }

    @JsonProperty("offset")
    public void setOffset(int pOffset) {
        mOffset = pOffset;
    }

    @JsonProperty("currently")
    public HourlyDataPoint getCurrently() {
        return mCurrently;
    }

    @JsonProperty("currently")
    public void setCurrently(HourlyDataPoint pCurrently) {
        mCurrently = pCurrently;
    }

    @JsonProperty("minutely")
    public MinutelyDataBlock getMinutely() {
        return mMinutely;
    }

    @JsonProperty("minutely")
    public void setMinutely(MinutelyDataBlock pMinutely) {
        mMinutely = pMinutely;
    }

    @JsonProperty("hourly")
    public HourlyDataBlock getHourly() {
        return mHourly;
    }

    @JsonProperty("hourly")
    public void setHourly(HourlyDataBlock pHourly) {
        mHourly = pHourly;
    }

    @JsonProperty("daily")
    public DailyDataBlock getDaily() {
        return mDaily;
    }

    @JsonProperty("daily")
    public void setDaily(DailyDataBlock pDaily) {
        mDaily = pDaily;
    }

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
