package com.github.martinseeler.forecastio.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gag.annotation.remark.RTFM;

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

  private static final String SUNSET_TIME = "sunsetTime";

  private static final String SUNRISE_TIME = "sunriseTime";

  // ===========================================================
  // Members / Fields
  // ===========================================================

  /** UNIX time of sunrise at this day. */
  private long sunriseTime;

  /** UNIX time of sunset at this day. */
  private long sunsetTime;

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
   * The UNIX time (that is, seconds since midnight GMT on 1 Jan 1970) of sunrise on the given day. (If no sunrise will
   * occur on the given day, then the field will be 0. This can occur during summer and winter in very high or low
   * latitudes.)
   *
   * @return The UNIX time of sunrise if available, {@code 0} otherwise.
   */
  @JsonProperty(SUNRISE_TIME)
  public long getSunriseTime() {
    return sunriseTime;
  }

  @JsonProperty(SUNRISE_TIME)
  public void setSunriseTime(final long sunriseTime) {
    this.sunriseTime = sunriseTime;
  }

  /**
   * The UNIX time (that is, seconds since midnight GMT on 1 Jan 1970) of sunset on the given day. (If no sunset will
   * occur on the given day, then the field will be 0. This can occur during summer and winter in very high or low
   * latitudes.)
   *
   * @return The UNIX time of sunset if available, {@code 0} otherwise.
   */
  @JsonProperty(SUNSET_TIME)
  public long getSunsetTime() {
    return sunsetTime;
  }

  @JsonProperty(SUNSET_TIME)
  public void setSunsetTime(final long sunsetTime) {
    this.sunsetTime = sunsetTime;
  }

  // ===========================================================
  // Methods for/from SuperClass/Interfaces
  // ===========================================================

  @Override
  public String toString() {
    return String.format("DailyDataPoint{sunriseTime=%d, sunsetTime=%d}", sunriseTime, sunsetTime);
  }

  // ===========================================================
  // Inner and Anonymous Classes
  // ===========================================================

}
