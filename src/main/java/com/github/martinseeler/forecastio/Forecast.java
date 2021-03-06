package com.github.martinseeler.forecastio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.martinseeler.forecastio.data.CurrentDataPoint;
import com.github.martinseeler.forecastio.data.DailyDataBlock;
import com.github.martinseeler.forecastio.data.DailyDataPoint;
import com.github.martinseeler.forecastio.data.ForecastFlags;
import com.github.martinseeler.forecastio.data.HourlyDataBlock;
import com.github.martinseeler.forecastio.data.MinutelyDataBlock;
import com.google.gag.annotation.remark.RTFM;
import org.jetbrains.annotations.Nullable;

/**
 * Representing the retrieved forecast from the API with all parsed fields.
 *
 * @author Martin Seeler
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

  private static final String FLAGS = "flags";

  // ===========================================================
  // Members / Fields
  // ===========================================================

  /** The requested latitude. */
  private double latitude;

  /** The requested longitude. */
  private double longitude;

  /** The IANA timezone name for the requested location. */
  private String timezone;

  private int offset;

  private CurrentDataPoint currentDataPoint;

  private MinutelyDataBlock minutelyDataBlock;

  private HourlyDataBlock hourlyDataBlock;

  private DailyDataBlock dailyDataBlock;

  private ForecastFlags flags;

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
    return latitude;
  }

  @JsonProperty(LATITUDE)
  public void setLatitude(final double latitude) {
    this.latitude = latitude;
  }

  /** @return The requested longitude. */
  @JsonProperty(LONGITUDE)
  public double getLongitude() {
    return longitude;
  }

  @JsonProperty(LONGITUDE)
  public void setLongitude(final double longitude) {
    this.longitude = longitude;
  }

  /**
   * The IANA timezone name for the requested location (e.g. {@code America/New_York}). This is the
   * timezone used for text forecast summaries and for determining the exact start time of daily
   * data points.
   *
   * @return The IANA timezone name for the requested location.
   */
  @JsonProperty(TIMEZONE)
  public String getTimezone() {
    return timezone;
  }

  @JsonProperty(TIMEZONE)
  public void setTimezone(final String timezone) {
    this.timezone = timezone;
  }

  /** @return The current timezone offset in hours from GMT. */
  @JsonProperty(OFFSET)
  public int getOffset() {
    return offset;
  }

  @JsonProperty(OFFSET)
  public void setOffset(final int offset) {
    this.offset = offset;
  }

  @JsonProperty(CURRENTLY)
  public CurrentDataPoint getCurrently() {
    return currentDataPoint;
  }

  @JsonProperty(CURRENTLY)
  public void setCurrently(final CurrentDataPoint currentDataPoint) {
    this.currentDataPoint = currentDataPoint;
  }

  @JsonProperty(MINUTELY)
  public MinutelyDataBlock getMinutely() {
    return minutelyDataBlock;
  }

  @JsonProperty(MINUTELY)
  public void setMinutely(final MinutelyDataBlock minutelyDataBlock) {
    this.minutelyDataBlock = minutelyDataBlock;
  }

  @JsonProperty(HOURLY)
  public HourlyDataBlock getHourly() {
    return hourlyDataBlock;
  }

  @JsonProperty(HOURLY)
  public void setHourly(final HourlyDataBlock hourlyDataBlock) {
    this.hourlyDataBlock = hourlyDataBlock;
  }

  @JsonProperty(DAILY)
  public DailyDataBlock getDaily() {
    return dailyDataBlock;
  }

  @Nullable
  @JsonIgnore
  public DailyDataPoint getToday() {
    return getDayBlockIn(0);
  }

  @Nullable
  @JsonIgnore
  public DailyDataPoint getTomorrow() {
    return getDayBlockIn(1);
  }

  @Nullable
  @JsonIgnore
  public DailyDataPoint getTodayInOneWeek() {
    return getDayBlockIn(7);
  }

  @Nullable
  @JsonIgnore
  private DailyDataPoint getDayBlockIn(final int daysInFuture) {
    if (dailyDataBlock != null && dailyDataBlock.getDataPoints() != null
        && dailyDataBlock.getDataPoints().length > daysInFuture && daysInFuture >= 0) {
      return dailyDataBlock.getDataPoints()[daysInFuture];
    } else {
      return null;
    }
  }

  @JsonProperty(DAILY)
  public void setDaily(final DailyDataBlock dailyDataBlock) {
    this.dailyDataBlock = dailyDataBlock;
  }

  @JsonProperty(FLAGS)
  public ForecastFlags getFlags() {
    return flags;
  }

  @JsonProperty(FLAGS)
  public void setFlags(final ForecastFlags flags) {
    this.flags = flags;
  }

  // ===========================================================
  // Methods for/from SuperClass/Interfaces
  // ===========================================================

  // ===========================================================
  // Inner and Anonymous Classes
  // ===========================================================

}
