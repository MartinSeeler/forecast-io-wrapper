package com.github.martinseeler.forecastio.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gag.annotation.remark.RTFM;

import java.util.Arrays;

/**
 * @author Martin Seeler <developer@chasmo.de>
 * @since 23.11.13 - 00:04
 */
@RTFM("https://developer.forecast.io/docs/v2")
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DailyDataBlock {

  // ===========================================================
  // Constants
  // ===========================================================

  public static final String SUMMARY_PROPERTY = "summary";

  private static final String ICON_PROPERTY = "icon";

  private static final String DATA_PROPERTY = "data";

  // ===========================================================
  // Members / Fields
  // ===========================================================

  /** A human-readable text summary of the next days. */
  private String summary;

  /** The machine-readable text summary. */
  private String icon;

  private DailyDataPoint[] dataPoints;

  // ===========================================================
  // Constructors
  // ===========================================================

  // ===========================================================
  // Methods
  // ===========================================================

  // ===========================================================
  // Getter & Setter
  // ===========================================================

  /** @return A human-readable text summary of the next days. */
  @JsonProperty(SUMMARY_PROPERTY)
  public String getSummary() {
    return summary;
  }

  @JsonProperty(SUMMARY_PROPERTY)
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
  @JsonProperty(ICON_PROPERTY)
  public String getIcon() {
    return icon;
  }

  @JsonProperty(ICON_PROPERTY)
  public void setIcon(final String icon) {
    this.icon = icon;
  }

  @JsonProperty(DATA_PROPERTY)
  public DailyDataPoint[] getDataPoints() {
    return dataPoints;
  }

  @JsonProperty(DATA_PROPERTY)
  public void setDataPoints(final DailyDataPoint[] dataPoints) {
    this.dataPoints = dataPoints;
  }

  // ===========================================================
  // Methods for/from SuperClass/Interfaces
  // ===========================================================

  @Override
  public String toString() {
    return String.format("DailyDataBlock{summary='%s', icon='%s', dataPoints=%s}", summary, icon,
        dataPoints == null ? "null" : Arrays.asList(dataPoints).toString());
  }

  // ===========================================================
  // Inner and Anonymous Classes
  // ===========================================================

}
