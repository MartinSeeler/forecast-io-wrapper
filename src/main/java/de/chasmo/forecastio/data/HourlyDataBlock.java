package de.chasmo.forecastio.data;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author Martin Seeler <developer@chasmo.de>
 * @since 23.11.13 - 00:04
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HourlyDataBlock {

    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Members / Fields
    // ===========================================================

    private String mSummary;

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
