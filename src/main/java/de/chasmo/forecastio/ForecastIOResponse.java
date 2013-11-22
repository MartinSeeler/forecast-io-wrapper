package de.chasmo.forecastio;

import de.chasmo.forecastio.data.DailyDataBlock;
import de.chasmo.forecastio.data.HourlyDataBlock;
import de.chasmo.forecastio.data.HourlyDataPoint;
import de.chasmo.forecastio.data.MinutelyDataBlock;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author Martin Seeler <developer@chasmo.de>
 * @since 22.11.13 - 23:25
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastIOResponse {

    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Members / Fields
    // ===========================================================

    private double mLatitude;

    private double mLongitude;

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

    @JsonProperty("latitude")
    public double getLatitude() {
        return mLatitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(double pLatitude) {
        mLatitude = pLatitude;
    }

    @JsonProperty("longitude")
    public double getLongitude() {
        return mLongitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(double pLongitude) {
        mLongitude = pLongitude;
    }

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
