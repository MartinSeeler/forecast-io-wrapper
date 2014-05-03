package com.github.martinseeler.forecastio.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gag.annotation.remark.RTFM;

/**
 * @author Martin Seeler <developer@chasmo.de>
 * @since 23.11.13 - 00:24
 */
@RTFM("https://developer.forecast.io/docs/v2")
@JsonIgnoreProperties(ignoreUnknown = true)
public final class HourlyDataPoint extends MinutelyDataPoint {

  // ===========================================================
  // Constants
  // ===========================================================

  // ===========================================================
  // Members / Fields
  // ===========================================================

  /** A human-readable text summary of this hour. */
  private String mSummary;

  /** The machine-readable text summary. */
  private String mIcon;

  /** The temperature at this hour. */
  private double mTemperature;

  /** The apparent temperature at this hour. */
  private double mApparentTemperature;

  /** The dew point at the given time, */
  private double mDewPoint;

  /** The relative humidity. */
  private double mHumidity;

  /** The wind speed. */
  private double mWindSpeed;

  /** The direction that the wind is coming from. */
  private int mWindBearing;

  // ===========================================================
  // Constructors
  // ===========================================================

  // ===========================================================
  // Methods
  // ===========================================================

  // ===========================================================
  // Getter & Setter
  // ===========================================================

  /** @return A human-readable text summary of this hour. */
  @JsonProperty(DailyDataBlock.SUMMARY_PROPERTY)
  public String getSummary() {
    return mSummary;
  }

  @JsonProperty(DailyDataBlock.SUMMARY_PROPERTY)
  public void setSummary(String pSummary) {
    mSummary = pSummary;
  }

  /**
   * A machine-readable text summary of this data point, suitable for selecting an icon for
   * display.
   * If defined, this property will have one of the following values: clear-day, clear-night,
   * rain,
   * snow, sleet, wind, fog, cloudy, partly-cloudy-day, or partly-cloudy-night.
   *
   * @return The machine-readable text summary.
   */
  @JsonProperty("icon")
  public String getIcon() {
    return mIcon;
  }

  @JsonProperty("icon")
  public void setIcon(String pIcon) {
    mIcon = pIcon;
  }

  /**
   * A numerical value representing the temperature at the given time (in degrees Fahrenheit,
   * if not
   * specified through the units parameter).
   *
   * @return The temperature at this hour if available, <code>0</code> otherwise.
   */
  @JsonProperty("temperature")
  public double getTemperature() {
    return mTemperature;
  }

  @JsonProperty("temperature")
  public void setTemperature(double pTemperature) {
    mTemperature = pTemperature;
  }

  /**
   * A numerical value representing the apparent (or “feels like”) temperature at the given
   * time (in
   * degrees Fahrenheit, if not specified through the units parameter).
   *
   * @return The apparent temperature at this hour if available, <code>0</code> otherwise.
   */
  @JsonProperty("apparentTemperature")
  public double getApparentTemperature() {
    return mApparentTemperature;
  }

  @JsonProperty("apparentTemperature")
  public void setApparentTemperature(double pApparentTemperature) {
    mApparentTemperature = pApparentTemperature;
  }

  /**
   * A numerical value representing the dew point at the given time (in degrees Fahrenheit, if not
   * specified through the units parameter).
   *
   * @return The dew point if available, <code>0</code> otherwise.
   */
  @JsonProperty("dewPoint")
  public double getDewPoint() {
    return mDewPoint;
  }

  @JsonProperty("dewPoint")
  public void setDewPoint(double pDewPoint) {
    mDewPoint = pDewPoint;
  }

  /**
   * A numerical value between 0 and 1 (inclusive) representing the relative humidity.
   *
   * @return The relative humidity if available, <code>0</code> otherwise.
   */
  @JsonProperty("humidity")
  public double getHumidity() {
    return mHumidity;
  }

  @JsonProperty("humidity")
  public void setHumidity(double pHumidity) {
    mHumidity = pHumidity;
  }

  /**
   * A numerical value representing the wind speed (in miles per hour,
   * if not specified through the
   * units parameter).
   *
   * @return The wind speed if available, <code>0</code> otherwise.
   */
  @JsonProperty("windSpeed")
  public double getWindSpeed() {
    return mWindSpeed;
  }

  @JsonProperty("windSpeed")
  public void setWindSpeed(double pWindSpeed) {
    mWindSpeed = pWindSpeed;
  }

  /**
   * A numerical value representing the direction that the wind is coming from in degrees,
   * with true
   * north at 0° and progressing clockwise. (If windSpeed is zero, then this value will be 0,
   * too.)
   *
   * @return The direction that the wind is coming from if available, <code>0</code> otherwise.
   */
  @JsonProperty("windBearing")
  public int getWindBearing() {
    return mWindBearing;
  }

  @JsonProperty("windBearing")
  public void setWindBearing(int pWindBearing) {
    mWindBearing = pWindBearing;
  }

  // ===========================================================
  // Methods for/from SuperClass/Interfaces
  // ===========================================================

  // ===========================================================
  // Inner and Anonymous Classes
  // ===========================================================

}
