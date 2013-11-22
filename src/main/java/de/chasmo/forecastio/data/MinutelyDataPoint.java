package de.chasmo.forecastio.data;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author Martin Seeler <developer@chasmo.de>
 * @since 23.11.13 - 00:05
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MinutelyDataPoint {

    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Members / Fields
    // ===========================================================

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

    @JsonProperty("time")
    public long getTime() {
        return mTime;
    }

    @JsonProperty("time")
    public void setTime(long pTime) {
        mTime = pTime;
    }

    @JsonProperty("precipIntensity")
    public double getPrecipIntensity() {
        return mPrecipIntensity;
    }

    @JsonProperty("precipIntensity")
    public void setPrecipIntensity(double pPrecipIntensity) {
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
