package com.github.martinseeler.forecastio.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gag.annotation.remark.RTFM;

import java.util.Arrays;

/**
 * @author Martin Seeler
 * @since 23.11.13 - 00:04
 */
@RTFM("https://developer.forecast.io/docs/v2")
@JsonIgnoreProperties(ignoreUnknown = true)
public final class MinutelyDataBlock {

  // ===========================================================
  // Constants
  // ===========================================================

  // ===========================================================
  // Members / Fields
  // ===========================================================

  /** A human-readable text summary of the next minutes. */
  private String summary;

  /** The machine-readable text summary. */
  private String icon;

  private MinutelyDataPoint[] minutelyDataPoints;

  // ===========================================================
  // Constructors
  // ===========================================================

  // ===========================================================
  // Methods
  // ===========================================================

  // ===========================================================
  // Getter & Setter
  // ===========================================================

  /** @return A human-readable text summary of the next minutes. */
  @JsonProperty(DailyDataBlock.SUMMARY_PROPERTY)
  public String getSummary() {
    return summary;
  }

  @JsonProperty(DailyDataBlock.SUMMARY_PROPERTY)
  public void setSummary(final String summary) {
    this.summary = summary;
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

  @JsonProperty(DailyDataBlock.DATA_PROPERTY)
  public MinutelyDataPoint[] getDataPoints() {
    return minutelyDataPoints;
  }

  @JsonProperty(DailyDataBlock.DATA_PROPERTY)
  public void setDataPoints(final MinutelyDataPoint[] dataPoints) {
    minutelyDataPoints = dataPoints;
  }

  // ===========================================================
  // Methods for/from SuperClass/Interfaces
  // ===========================================================

  @Override
  public String toString() {
    return String.format("MinutelyDataBlock{summary='%s', icon='%s', minutelyDataPoints=%s}",
        summary, icon, Arrays.toString(minutelyDataPoints));
  }

  // ===========================================================
  // Inner and Anonymous Classes
  // ===========================================================

}
