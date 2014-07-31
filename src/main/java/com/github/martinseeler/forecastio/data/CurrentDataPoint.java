package com.github.martinseeler.forecastio.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gag.annotation.remark.RTFM;

/**
 * @author Martin Seeler
 * @since 05.05.2014 - 18:17
 */
@RTFM("https://developer.forecast.io/docs/v2")
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CurrentDataPoint extends HourlyDataPoint {

  // ===========================================================
  // Constants
  // ===========================================================

  private static final String NEAREST_STORM_DISTANCE = "nearestStormDistance";

  private static final String NEAREST_STORM_BEARING = "nearestStormBearing";

  // ===========================================================
  // Members / Fields
  // ===========================================================

  private double nearestStormDistance;

  private double nearestStormBearing;

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
   * @return A numerical value representing the distance to the nearest storm in miles. (This value
   * is very approximate and should not be used in scenarios requiring accurate results. In
   * particular, a storm distance of zero doesn’t necessarily refer to a storm at the requested
   * location, but rather a storm in the vicinity of that location.)
   */
  @JsonProperty(NEAREST_STORM_DISTANCE)
  public double getNearestStormDistance() {
    return nearestStormDistance;
  }

  @JsonProperty(NEAREST_STORM_DISTANCE)
  public void setNearestStormDistance(final double nearestStormDistance) {
    this.nearestStormDistance = nearestStormDistance;
  }

  /**
   * @return A numerical value representing the direction of the nearest storm in degrees, with true
   * north at 0° and progressing clockwise. (If {@link #getNearestStormDistance()} is zero, then
   * this value will not be defined. The caveats that apply to {@link #getNearestStormDistance()}
   * also apply to this value.)
   */
  @JsonProperty(NEAREST_STORM_BEARING)
  public double getNearestStormBearing() {
    return nearestStormBearing;
  }

  @JsonProperty(NEAREST_STORM_BEARING)
  public void setNearestStormBearing(final double nearestStormBearing) {
    this.nearestStormBearing = nearestStormBearing;
  }

  // ===========================================================
  // Methods for/from SuperClass/Interfaces
  // ===========================================================

  @Override
  public String toString() {
    return String.format("CurrentDataPoint{nearestStormDistance=%s, nearestStormBearing=%s} %s",
        nearestStormDistance, nearestStormBearing, super.toString());
  }

  // ===========================================================
  // Inner and Anonymous Classes
  // ===========================================================

}
