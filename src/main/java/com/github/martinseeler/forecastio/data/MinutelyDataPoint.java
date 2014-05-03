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

  // ===========================================================
  // Members / Fields
  // ===========================================================

  /**
   * The UNIX time (that is, seconds since midnight GMT on 1 Jan 1970) at which this data point
   * occurs.
   */
  private long mTime;

  private double mPrecipIntensity;

  private double mPrecipProbability;

  private double mPrecipIntensityError;

  private String mPrecipType;

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
   * @return The UNIX time (that is, seconds since midnight GMT on 1 Jan 1970) at which this data
   * point occurs.
   */
  @JsonProperty("time")
  public final long getTime() {
    return mTime;
  }

  /**
   * @param pTime The UNIX time (that is, seconds since midnight GMT on 1 Jan 1970) at which this
   *              data point occurs.
   */
  @JsonProperty("time")
  public final void setTime(long pTime) {
    mTime = pTime;
  }

  /**
   * A numerical value representing the average expected intensity (in inches of liquid water per
   * hour) of precipitation occurring at the given time conditional on probability (that is,
   * assuming any precipitation occurs at all). A very rough guide is that a value of 0 in./hr.
   * corresponds to no precipitation, 0.002 in./hr. corresponds to very light precipitation, 0.017
   * in./hr. corresponds to light precipitation, 0.1 in./hr. corresponds to moderate precipitation,
   * and 0.4 in./hr. corresponds to heavy precipitation.
   *
   * @return The expected intensity of precipitation if available, <code>0.0d</code> otherwise.
   */
  @JsonProperty("precipIntensity")
  public final double getPrecipIntensity() {
    return mPrecipIntensity;
  }

  @JsonProperty("precipIntensity")
  public final void setPrecipIntensity(double pPrecipIntensity) {
    mPrecipIntensity = pPrecipIntensity;
  }

  @JsonProperty("precipProbability")
  public double getPrecipProbability() {
    return mPrecipProbability;
  }

  @JsonProperty("precipProbability")
  public void setPrecipProbability(double pPrecipProbability) {
    mPrecipProbability = pPrecipProbability;
  }

  @JsonProperty("precipIntensityError")
  public double getPrecipIntensityError() {
    return mPrecipIntensityError;
  }

  @JsonProperty("precipIntensityError")
  public void setPrecipIntensityError(double pPrecipIntensityError) {
    mPrecipIntensityError = pPrecipIntensityError;
  }

  @JsonProperty("precipType")
  public String getPrecipType() {
    return mPrecipType;
  }

  @JsonProperty("precipType")
  public void setPrecipType(String pPrecipType) {
    mPrecipType = pPrecipType;
  }

  // ===========================================================
  // Methods for/from SuperClass/Interfaces
  // ===========================================================

  // ===========================================================
  // Inner and Anonymous Classes
  // ===========================================================

}
