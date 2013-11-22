package de.chasmo.forecastio.data;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author Martin Seeler <developer@chasmo.de>
 * @since 23.11.13 - 00:04
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DailyDataBlock {

    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Members / Fields
    // ===========================================================

    private String mSummary;

    private String mIcon;

    private DailyDataPoint[] mDataPoints;

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
    public DailyDataPoint[] getDataPoints() {
        return mDataPoints;
    }

    @JsonProperty("data")
    public void setDataPoints(DailyDataPoint[] pDataPoints) {
        mDataPoints = pDataPoints;
    }

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
