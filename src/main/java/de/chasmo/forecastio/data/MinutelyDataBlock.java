package de.chasmo.forecastio.data;

import com.google.gag.annotation.remark.RTFM;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author Martin Seeler <developer@chasmo.de>
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
    private String mSummary;

    /** The machine-readable text summary. */
    private String mIcon;

    private MinutelyDataPoint[] mDataPoints;

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
    @JsonProperty("summary")
    public String getSummary() {
        return mSummary;
    }

    @JsonProperty("summary")
    public void setSummary(String pSummary) {
        mSummary = pSummary;
    }

    /**
     * A machine-readable text summary of this data point, suitable for selecting an icon for display. If defined, this
     * property will have one of the following values: clear-day, clear-night, rain, snow, sleet, wind, fog, cloudy,
     * partly-cloudy-day, or partly-cloudy-night.
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
    public MinutelyDataPoint[] getDataPoints() {
        return mDataPoints;
    }

    @JsonProperty("data")
    public void setDataPoints(MinutelyDataPoint[] pDataPoints) {
        mDataPoints = pDataPoints;
    }

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
