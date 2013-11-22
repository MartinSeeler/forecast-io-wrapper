package de.chasmo.forecastio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Martin Seeler <developer@chasmo.de>
 * @since 22.11.13 - 22:01
 */
public class ForecastIO {

    // ===========================================================
    // Constants
    // ===========================================================

    /** Logging instance. */
    private static final Logger LOGGER = LoggerFactory.getLogger(ForecastIO.class);

    /** The base domain for API requests. */
    private static final String BASE_DOMAIN = "https://api.forecast.io/forecast/";

    // ===========================================================
    // Members / Fields
    // ===========================================================

    /** The Dark Sky API key. */
    private final String mApiKey;

    // ===========================================================
    // Constructors
    // ===========================================================

    /**
     * Creates a new API wrapper to request some data from the API.
     *
     * @param pApiKey Your Dark Sky API key to make requests.
     */
    public ForecastIO(String pApiKey) {
        mApiKey = pApiKey;
    }

    // ===========================================================
    // Methods
    // ===========================================================

    /**
     * Performs a request to the API with the geographic coordinates of a location.
     *
     * @param pLatitude  The requested latitude.
     * @param pLongitude The requested longitude.
     */
    public void getForecast(final double pLatitude, final double pLongitude) {
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * Performs a request to the API with the geographic coordinates of a location at a given time.
     *
     * @param pLatitude  The requested latitude.
     * @param pLongitude The requested longitude.
     */
    public void getForecast(final double pLatitude, final double pLongitude, final long pUnixtime) {
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    // ===========================================================
    // Getter & Setter
    // ===========================================================

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
