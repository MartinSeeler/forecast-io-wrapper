package de.chasmo.forecastio.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gag.annotation.remark.RTFM;

/**
 * @author Martin Seeler <developer@chasmo.de>
 * @since 23.11.13 - 00:04
 */
@RTFM("https://developer.forecast.io/docs/v2")
@JsonIgnoreProperties(ignoreUnknown = true)
public final class HourlyDataBlock {

  // ===========================================================
  // Constants
  // ===========================================================

  // ===========================================================
  // Members / Fields
  // ===========================================================

  /** A human-readable text summary of the next hours. */
  private String mSummary;

  /** The machine-readable text summary. */
  private String mIcon;

  private HourlyDataPoint[] mDataPoints;

  // ===========================================================
  // Constructors
  // ===========================================================

  // ===========================================================
  // Methods
  // ===========================================================

  // ===========================================================
  // Getter & Setter
  // ===========================================================

  /** @return A human-readable text summary of the next hours. */
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

  @JsonProperty("data")
  public HourlyDataPoint[] getDataPoints() {
    return mDataPoints;
  }

  @JsonProperty("data")
  public void setDataPoints(HourlyDataPoint[] pDataPoints) {
    mDataPoints = pDataPoints;
  }

  // ===========================================================
  // Methods for/from SuperClass/Interfaces
  // ===========================================================

  // ===========================================================
  // Inner and Anonymous Classes
  // ===========================================================

}
