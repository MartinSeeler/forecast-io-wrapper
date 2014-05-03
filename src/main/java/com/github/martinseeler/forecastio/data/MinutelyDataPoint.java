package com.github.martinseeler.forecastio.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gag.annotation.remark.RTFM;

/**
 * @author Martin Seeler <developer@chasmo.de>
 * @since 23.11.13 - 00:05
 */
@RTFM("https://developer.forecast.io/docs/v2")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MinutelyDataPoint {

  // ===========================================================
  // Constants
  // ===========================================================

  private static final String TIME = "time";

  private static final String PRECIP_INTENSITY = "precipIntensity";

  private static final String PRECIP_PROBABILITY = "precipProbability";

  private static final String PRECIP_INTENSITY_ERROR = "precipIntensityError";

  private static final String PRECIP_TYPE = "precipType";

  // ===========================================================
  // Members / Fields
  // ===========================================================

  /**
   * The UNIX time (that is, seconds since midnight GMT on 1 Jan 1970) at which this data point occurs.
   */
  private long time;

  private double precipIntensity;

  private double precipProbability;

  private double precipIntensityError;

  private String precipType;

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
   * @return The UNIX time (that is, seconds since midnight GMT on 1 Jan 1970) at which this data point occurs.
   */
  @JsonProperty(TIME)
  public final long getTime() {
    return time;
  }

  /**
   * @param time The UNIX time (that is, seconds since midnight GMT on 1 Jan 1970) at which this data point occurs.
   */
  @JsonProperty(TIME)
  public final void setTime(final long time) {
    this.time = time;
  }

  /**
   * A numerical value representing the average expected intensity (in inches of liquid water per hour) of precipitation
   * occurring at the given time conditional on probability (that is, assuming any precipitation occurs at all). A very
   * rough guide is that a value of 0 in./hr. corresponds to no precipitation, 0.002 in./hr. corresponds to very light
   * precipitation, 0.017 in./hr. corresponds to light precipitation, 0.1 in./hr. corresponds to moderate precipitation,
   * and 0.4 in./hr. corresponds to heavy precipitation.
   *
   * @return The expected intensity of precipitation if available, {@code 0.0d} otherwise.
   */
  @JsonProperty(PRECIP_INTENSITY)
  public final double getPrecipIntensity() {
    return precipIntensity;
  }

  @JsonProperty(PRECIP_INTENSITY)
  public final void setPrecipIntensity(final double precipIntensity) {
    this.precipIntensity = precipIntensity;
  }

  /**
   * @return A numerical value between 0 and 1 (inclusive) representing the probability of precipitation occuring at the
   * given time.
   */
  @JsonProperty(PRECIP_PROBABILITY)
  public final double getPrecipProbability() {
    return precipProbability;
  }

  @JsonProperty(PRECIP_PROBABILITY)
  public final void setPrecipProbability(final double precipProbability) {
    this.precipProbability = precipProbability;
  }

  @JsonProperty(PRECIP_INTENSITY_ERROR)
  public final double getPrecipIntensityError() {
    return precipIntensityError;
  }

  @JsonProperty(PRECIP_INTENSITY_ERROR)
  public final void setPrecipIntensityError(final double precipIntensityError) {
    this.precipIntensityError = precipIntensityError;
  }

  /**
   * @return A string representing the type of precipitation occurring at the given time. If defined, this property will
   * have one of the following values: {@code rain}, {@code snow}, {@code sleet} (which applies to each of freezing
   * rain, ice pellets, and “wintery mix”), or {@code hail}. (If {@link MinutelyDataPoint#getPrecipIntensity()} is zero,
   * then this property will not be defined.
   */
  @JsonProperty(PRECIP_TYPE)
  public final String getPrecipType() {
    return precipType;
  }

  @JsonProperty(PRECIP_TYPE)
  public final void setPrecipType(final String precipType) {
    this.precipType = precipType;
  }

  // ===========================================================
  // Methods for/from SuperClass/Interfaces
  // ===========================================================

  @Override
  public String toString() {
    return String.format(
        "MinutelyDataPoint{time=%d, precipIntensity=%s, precipProbability=%s, precipIntensityError=%s, "
            + "precipType='%s'}", time, precipIntensity, precipProbability, precipIntensityError, precipType
    );
  }

  // ===========================================================
  // Inner and Anonymous Classes
  // ===========================================================

}
