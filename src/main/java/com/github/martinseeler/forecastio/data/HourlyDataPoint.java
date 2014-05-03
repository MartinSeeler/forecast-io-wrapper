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

  private static final String TEMPERATURE = "temperature";

  private static final String APPARENT_TEMPERATURE = "apparentTemperature";

  private static final String DEW_POINT = "dewPoint";

  private static final String HUMIDITY = "humidity";

  private static final String WIND_SPEED = "windSpeed";

  private static final String WIND_BEARING = "windBearing";
  
  // ===========================================================
  // Members / Fields
  // ===========================================================

  /** A human-readable text summary of this hour. */
  private String summary;

  /** The machine-readable text summary. */
  private String icon;

  /** The temperature at this hour. */
  private double temperature;

  /** The apparent temperature at this hour. */
  private double apparentTemperature;

  /** The dew point at the given time, */
  private double dewPoint;

  /** The relative humidity. */
  private double humidity;

  /** The wind speed. */
  private double windSpeed;

  /** The direction that the wind is coming from. */
  private int windBearing;

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
    return summary;
  }

  @JsonProperty(DailyDataBlock.SUMMARY_PROPERTY)
  public void setSummary(final String summary) {
    this.summary = summary;
  }

  /**
   * A machine-readable text summary of this data point, suitable for selecting an icon for display. If defined, this
   * property will have one of the following values: clear-day, clear-night, rain, snow, sleet, wind, fog, cloudy,
   * partly-cloudy-day, or partly-cloudy-night.
   *
   * @return The machine-readable text summary.
   */
  @JsonProperty(DailyDataBlock.ICON_PROPERTY)
  public String getIcon() {
    return icon;
  }

  @JsonProperty(DailyDataBlock.ICON_PROPERTY)
  public void setIcon(final String icon) {
    this.icon = icon;
  }

  /**
   * A numerical value representing the temperature at the given time (in degrees Fahrenheit, if not specified through
   * the units parameter).
   *
   * @return The temperature at this hour if available, {@code 0} otherwise.
   */
  @JsonProperty(TEMPERATURE)
  public double getTemperature() {
    return temperature;
  }

  @JsonProperty(TEMPERATURE)
  public void setTemperature(final double temperature) {
    this.temperature = temperature;
  }

  /**
   * A numerical value representing the apparent (or “feels like”) temperature at the given time (in degrees Fahrenheit,
   * if not specified through the units parameter).
   *
   * @return The apparent temperature at this hour if available, {@code 0} otherwise.
   */
  @JsonProperty(APPARENT_TEMPERATURE)
  public double getApparentTemperature() {
    return apparentTemperature;
  }

  @JsonProperty(APPARENT_TEMPERATURE)
  public void setApparentTemperature(final double apparentTemperature) {
    this.apparentTemperature = apparentTemperature;
  }

  /**
   * A numerical value representing the dew point at the given time (in degrees Fahrenheit, if not specified through the
   * units parameter).
   *
   * @return The dew point if available, {@code 0} otherwise.
   */
  @JsonProperty(DEW_POINT)
  public double getDewPoint() {
    return dewPoint;
  }

  @JsonProperty(DEW_POINT)
  public void setDewPoint(final double dewPoint) {
    this.dewPoint = dewPoint;
  }

  /**
   * A numerical value between 0 and 1 (inclusive) representing the relative humidity.
   *
   * @return The relative humidity if available, {@code 0} otherwise.
   */
  @JsonProperty(HUMIDITY)
  public double getHumidity() {
    return humidity;
  }

  @JsonProperty(HUMIDITY)
  public void setHumidity(final double humidity) {
    this.humidity = humidity;
  }

  /**
   * A numerical value representing the wind speed (in miles per hour, if not specified through the units parameter).
   *
   * @return The wind speed if available, {@code 0} otherwise.
   */
  @JsonProperty(WIND_SPEED)
  public double getWindSpeed() {
    return windSpeed;
  }

  @JsonProperty(WIND_SPEED)
  public void setWindSpeed(final double windSpeed) {
    this.windSpeed = windSpeed;
  }

  /**
   * A numerical value representing the direction that the wind is coming from in degrees, with true north at 0° and
   * progressing clockwise. (If windSpeed is zero, then this value will be 0, too.)
   *
   * @return The direction that the wind is coming from if available, {@code 0} otherwise.
   */
  @JsonProperty(WIND_BEARING)
  public int getWindBearing() {
    return windBearing;
  }

  @JsonProperty(WIND_BEARING)
  public void setWindBearing(final int windBearing) {
    this.windBearing = windBearing;
  }

  // ===========================================================
  // Methods for/from SuperClass/Interfaces
  // ===========================================================

  @Override
  public String toString() {
    return String.format(
        "HourlyDataPoint{summary='%s', icon='%s', temperature=%s, apparentTemperature=%s, dewPoint=%s, "
            + "humidity=%s, windSpeed=%s, windBearing=%d}", summary, icon, temperature, apparentTemperature, dewPoint,
        humidity, windSpeed, windBearing
    );
  }

  // ===========================================================
  // Inner and Anonymous Classes
  // ===========================================================

}
