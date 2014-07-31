package com.github.martinseeler.forecastio.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gag.annotation.remark.RTFM;

/**
 * @author Martin Seeler
 * @since 23.11.13 - 00:24
 */
@RTFM("https://developer.forecast.io/docs/v2")
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ForecastFlags {

  private static final String SOURCES = "sources";

  private static final String ISD_STATIONS = "isd-stations";

  private static final String MADIS_STATIONS = "madis-stations";

  private static final String METNO_LICENSE = "metno-license";

  private static final String UNITS = "units";

  private String[] sources;

  private String[] isdStations;

  private String[] madisStations;

  private String metnoLicense;

  private String units;

  @JsonProperty(SOURCES)
  public String[] getSources() {
    return sources;
  }

  @JsonProperty(SOURCES)
  public void setSources(final String... sources) {
    this.sources = sources;
  }

  @JsonProperty(ISD_STATIONS)
  public String[] getIsdStations() {
    return isdStations;
  }

  @JsonProperty(ISD_STATIONS)
  public void setIsdStations(final String[] isdStations) {
    this.isdStations = isdStations;
  }

  @JsonProperty(MADIS_STATIONS)
  public String[] getMadisStations() {
    return madisStations;
  }

  @JsonProperty(MADIS_STATIONS)
  public void setMadisStations(final String[] madisStations) {
    this.madisStations = madisStations;
  }

  @JsonProperty(METNO_LICENSE)
  public String getMetnoLicense() {
    return metnoLicense;
  }

  @JsonProperty(METNO_LICENSE)
  public void setMetnoLicense(final String metnoLicense) {
    this.metnoLicense = metnoLicense;
  }

  @JsonProperty(UNITS)
  public String getUnits() {
    return units;
  }

  @JsonProperty(UNITS)
  public void setUnits(final String units) {
    this.units = units;
  }
}
