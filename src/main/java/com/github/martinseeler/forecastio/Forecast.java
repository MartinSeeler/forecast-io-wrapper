package com.github.martinseeler.forecastio;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.martinseeler.forecastio.data.DailyDataBlock;
import com.github.martinseeler.forecastio.data.DailyDataPoint;
import com.github.martinseeler.forecastio.data.HourlyDataBlock;
import com.github.martinseeler.forecastio.data.HourlyDataPoint;
import com.github.martinseeler.forecastio.data.MinutelyDataBlock;
import com.google.gag.annotation.remark.RTFM;

/**
 * Representing the retrieved forecast from the API with all parsed fields.
 *
 * @author Martin Seeler <developer@chasmo.de>
 * @since 22.11.13 - 23:25
 */
@RTFM("https://developer.forecast.io/docs/v2")
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Forecast {

  // ===========================================================
  // Constants
  // ===========================================================

  private static final String LONGITUDE = "longitude";

  private static final String LATITUDE = "latitude";

  private static final String TIMEZONE = "timezone";

  private static final String OFFSET = "offset";

  private static final String CURRENTLY = "currently";

  private static final String MINUTELY = "minutely";

  private static final String HOURLY = "hourly";

  private static final String DAILY = "daily";

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
  @JsonProperty(LATITUDE)
  public double getLatitude() {
    return mLatitude;
  }

  @JsonProperty(LATITUDE)
  public void setLatitude(double pLatitude) {
    mLatitude = pLatitude;
  }

  /** @return The requested longitude. */
  @JsonProperty(LONGITUDE)
  public double getLongitude() {
    return mLongitude;
  }

  @JsonProperty(LONGITUDE)
  public void setLongitude(double pLongitude) {
    mLongitude = pLongitude;
  }

  /**
   * The IANA timezone name for the requested location (e.g. {@code America/New_York}). This is the timezone used for
   * text forecast summaries and for determining the exact start time of daily data points.
   *
   * @return The IANA timezone name for the requested location.
   */
  @JsonProperty(TIMEZONE)
  public String getTimezone() {
    return mTimezone;
  }

  @JsonProperty(TIMEZONE)
  public void setTimezone(String pTimezone) {
    mTimezone = pTimezone;
  }

  /** @return The current timezone offset in hours from GMT. */
  @JsonProperty(OFFSET)
  public int getOffset() {
    return mOffset;
  }

  @JsonProperty(OFFSET)
  public void setOffset(int pOffset) {
    mOffset = pOffset;
  }

  @JsonProperty(CURRENTLY)
  public HourlyDataPoint getCurrentHour() {
    return mCurrently;
  }

  @JsonProperty(CURRENTLY)
  public void setCurrently(HourlyDataPoint pCurrently) {
    mCurrently = pCurrently;
  }

  @JsonProperty(MINUTELY)
  public MinutelyDataBlock getMinutely() {
    return mMinutely;
  }

  @JsonProperty(MINUTELY)
  public void setMinutely(MinutelyDataBlock pMinutely) {
    mMinutely = pMinutely;
  }

  @JsonProperty(HOURLY)
  public HourlyDataBlock getHourly() {
    return mHourly;
  }

  @JsonProperty(HOURLY)
  public void setHourly(HourlyDataBlock pHourly) {
    mHourly = pHourly;
  }

  @JsonProperty(DAILY)
  public DailyDataBlock getDaily() {
    return mDaily;
  }

  public DailyDataPoint getToday() {
    return mDaily.getDataPoints()[0];
  }

  @JsonProperty(DAILY)
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
