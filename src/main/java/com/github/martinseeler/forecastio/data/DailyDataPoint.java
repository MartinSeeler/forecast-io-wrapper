package com.github.martinseeler.forecastio.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gag.annotation.remark.RTFM;

import org.jetbrains.annotations.NotNull;

import java.util.Date;

/**
 * @author Martin Seeler
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

  private static final String MOON_PHASE = "moonPhase";

  private static final String PRECIP_INTENSITY_MAX = "precipIntensityMax";

  private static final String PRECIP_ACCUMULATION = "precipAccumulation";

  private static final String PRECIP_INTENSITY_MAX_TIME = "precipIntensityMaxTime";

  private static final String TEMPERATURE_MIN = "temperatureMin";

  private static final String TEMPERATURE_MAX = "temperatureMax";

  private static final String TEMPERATURE_MIN_TIME = "temperatureMinTime";

  private static final String TEMPERATURE_MAX_TIME = "temperatureMaxTime";

  private static final String APPARENT_TEMPERATURE_MIN = "apparentTemperatureMin";

  private static final String APPARENT_TEMPERATURE_MAX = "apparentTemperatureMax";

  private static final String APPARENT_TEMPERATURE_MIN_TIME = "apparentTemperatureMinTime";

  private static final String APPARENT_TEMPERATURE_MAX_TIME = "apparentTemperatureMaxTime";

  // ===========================================================
  // Members / Fields
  // ===========================================================

  /**
   * UNIX time of sunrise at this day.
   */
  private long sunriseTime;

  /**
   * UNIX time of sunset at this day.
   */
  private long sunsetTime;

  /**
   * A value representing the current moon phase.
   */
  private double moonPhase;

  /**
   * The machine-readable text summary.
   */
  private String icon;

  private double precipIntensityMax;

  private double precipAccumulation;

  private long precipIntensityMaxTime;

  private int temperatureMin;

  private int temperatureMax;

  private long temperatureMinTime;

  private long temperatureMaxTime;

  private int apparentTemperatureMin;

  private int apparentTemperatureMax;

  private long apparentTemperatureMinTime;

  private long apparentTemperatureMaxTime;

  private double cloudCover;

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
   * The UNIX time (that is, seconds since midnight GMT on 1 Jan 1970) of sunrise on the given day.
   * (If no sunrise will occur on the given day, then the field will be 0. This can occur during
   * summer and winter in very high or low latitudes.)
   *
   * @return The UNIX time of sunrise if available, {@code 0} otherwise.
   */
  @JsonProperty(SUNRISE_TIME)
  public long getSunriseTimestamp() {
    return sunriseTime;
  }

  @JsonProperty(SUNRISE_TIME)
  public void setSunriseTimestamp(final long sunriseTime) {
    this.sunriseTime = sunriseTime;
  }

  /**
   * @return A {@link java.util.Date}, where the {@link #getSunriseTime()} is multiplied by 1.000
   * for milliseconds.
   */
  @NotNull
  public Date getSunriseTime() {
    return new Date(1000L * sunriseTime);
  }

  /**
   * The UNIX time (that is, seconds since midnight GMT on 1 Jan 1970) of sunset on the given day.
   * (If no sunset will occur on the given day, then the field will be 0. This can occur during
   * summer and winter in very high or low latitudes.)
   *
   * @return The UNIX time of sunset if available, {@code 0} otherwise.
   */
  @JsonProperty(SUNSET_TIME)
  public long getSunsetTimestamp() {
    return sunsetTime;
  }

  @JsonProperty(SUNSET_TIME)
  public void setSunsetTimestamp(final long sunsetTime) {
    this.sunsetTime = sunsetTime;
  }

  /**
   * @return A {@link java.util.Date}, where the {@link #getSunsetTime()} is multiplied by 1.000 for
   * milliseconds.
   */
  @NotNull
  public Date getSunsetTime() {
    return new Date(1000L * sunsetTime);
  }

  /**
   * A number representing the fractional part of the lunation number of the given day. This can be
   * thought of as the “percentage complete” of the current lunar month: a value of 0 represents a
   * new moon, a value of 0.25 represents a first quarter moon, a value of 0.5 represents a full
   * moon, and a value of 0.75 represents a last quarter moon. (The ranges in between these
   * represent waxing crescent, waxing gibbous, waning gibbous, and waning crescent moons,
   * respectively.)
   *
   * @return The current moon phase value.
   */
  @JsonProperty(MOON_PHASE)
  public double getMoonPhase() {
    return moonPhase;
  }

  @JsonProperty(MOON_PHASE)
  public void setMoonPhase(final double moonPhase) {
    this.moonPhase = moonPhase;
  }

  /**
   * @return A numerical value representing the maximumum expected intensity of precipitation on the
   * given day in inches of liquid water per hour.
   */
  @JsonProperty(PRECIP_INTENSITY_MAX)
  public double getPrecipIntensityMax() {
    return precipIntensityMax;
  }

  @JsonProperty(PRECIP_INTENSITY_MAX)
  public void setPrecipIntensityMax(final double precipIntensityMax) {
    this.precipIntensityMax = precipIntensityMax;
  }

  /**
   * @return The UNIX time at which {@link DailyDataPoint#getPrecipIntensityMax} occurs.
   */
  @JsonProperty(PRECIP_INTENSITY_MAX_TIME)
  public long getPrecipIntensityMaxTime() {
    return precipIntensityMaxTime;
  }

  @JsonProperty(PRECIP_INTENSITY_MAX_TIME)
  public void setPrecipIntensityMaxTime(final long precipIntensityMaxTime) {
    this.precipIntensityMaxTime = precipIntensityMaxTime;
  }

  /**
   * @return the amount of snowfall accumulation expected to occur on the given day. (If no
   * accumulation is expected, this property will not be defined and is {@code 0}.
   */
  @JsonProperty(PRECIP_ACCUMULATION)
  public double getPrecipAccumulation() {
    return precipAccumulation;
  }

  @JsonProperty(PRECIP_ACCUMULATION)
  public void setPrecipAccumulation(final double precipAccumulation) {
    this.precipAccumulation = precipAccumulation;
  }

  /**
   * A machine-readable text summary of this data point, suitable for selecting an icon for display.
   * If defined, this property will have one of the following values: clear-day, clear-night, rain,
   * snow, sleet, wind, fog, cloudy, partly-cloudy-day, or partly-cloudy-night.
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

  @JsonProperty(TEMPERATURE_MIN)
  public int getTemperatureMin() {
    return temperatureMin;
  }

  @JsonProperty(TEMPERATURE_MIN)
  public void setTemperatureMin(int temperatureMin) {
    this.temperatureMin = temperatureMin;
  }

  @JsonProperty(TEMPERATURE_MAX)
  public int getTemperatureMax() {
    return temperatureMax;
  }

  @JsonProperty(TEMPERATURE_MAX)
  public void setTemperatureMax(int temperatureMax) {
    this.temperatureMax = temperatureMax;
  }

  @JsonProperty(TEMPERATURE_MIN_TIME)
  public long getTemperatureMinTime() {
    return temperatureMinTime;
  }

  @JsonProperty(TEMPERATURE_MIN_TIME)
  public void setTemperatureMinTime(long temperatureMinTime) {
    this.temperatureMinTime = temperatureMinTime;
  }

  @JsonProperty(TEMPERATURE_MAX_TIME)
  public long getTemperatureMaxTime() {
    return temperatureMaxTime;
  }

  @JsonProperty(TEMPERATURE_MAX_TIME)
  public void setTemperatureMaxTime(long temperatureMaxTime) {
    this.temperatureMaxTime = temperatureMaxTime;
  }

  @JsonProperty(APPARENT_TEMPERATURE_MIN)
  public int getApparentTemperatureMin() {
    return apparentTemperatureMin;
  }

  @JsonProperty(APPARENT_TEMPERATURE_MIN)
  public void setApparentTemperatureMin(int apparentTemperatureMin) {
    this.apparentTemperatureMin = apparentTemperatureMin;
  }

  @JsonProperty(APPARENT_TEMPERATURE_MAX)
  public int getApparentTemperatureMax() {
    return apparentTemperatureMax;
  }

  @JsonProperty(APPARENT_TEMPERATURE_MAX)
  public void setApparentTemperatureMax(int apparentTemperatureMax) {
    this.apparentTemperatureMax = apparentTemperatureMax;
  }

  @JsonProperty(APPARENT_TEMPERATURE_MIN_TIME)
  public long getApparentTemperatureMinTime() {
    return apparentTemperatureMinTime;
  }

  @JsonProperty(APPARENT_TEMPERATURE_MIN_TIME)
  public void setApparentTemperatureMinTime(long apparentTemperatureMinTime) {
    this.apparentTemperatureMinTime = apparentTemperatureMinTime;
  }

  @JsonProperty(APPARENT_TEMPERATURE_MAX_TIME)
  public long getApparentTemperatureMaxTime() {
    return apparentTemperatureMaxTime;
  }

  @JsonProperty(APPARENT_TEMPERATURE_MAX_TIME)
  public void setApparentTemperatureMaxTime(long apparentTemperatureMaxTime) {
    this.apparentTemperatureMaxTime = apparentTemperatureMaxTime;
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
