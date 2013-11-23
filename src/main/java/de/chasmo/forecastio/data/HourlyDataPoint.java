package de.chasmo.forecastio.data;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author Martin Seeler <developer@chasmo.de>
 * @since 23.11.13 - 00:24
 */
public class HourlyDataPoint extends MinutelyDataPoint {

    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Members / Fields
    // ===========================================================

    private String mSummary;

    private String mIcon;

    private double mTemperature;

    private double mApparentTemperature;

    // ===========================================================
    // Constructors
    // ===========================================================

    // ===========================================================
    // Methods
    // ===========================================================

    // ===========================================================
    // Getter & Setter
    // ===========================================================

    @JsonProperty("summary")
    public String getSummary() {
        return mSummary;
    }

    @JsonProperty("summary")
    public void setSummary(String pSummary) {
        mSummary = pSummary;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return mIcon;
    }

    @JsonProperty("icon")
    public void setIcon(String pIcon) {
        mIcon = pIcon;
    }

    @JsonProperty("temperature")
    public double getTemperature() {
        return mTemperature;
    }

    @JsonProperty("temperature")
    public void setTemperature(double pTemperature) {
        mTemperature = pTemperature;
    }

    @JsonProperty("apparentTemperature")
    public double getApparentTemperature() {
        return mApparentTemperature;
    }

    @JsonProperty("apparentTemperature")
    public void setApparentTemperature(double pApparentTemperature) {
        mApparentTemperature = pApparentTemperature;
    }

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
