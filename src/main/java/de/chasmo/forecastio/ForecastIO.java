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

    // ===========================================================
    // Members / Fields
    // ===========================================================

    /** The Dark Sky API key. */
    private final String mApiKey;

    // ===========================================================
    // Constructors
    // ===========================================================

    /**
     * Creates a new API wrapper to make requests against the API.
     *
     * @param pApiKey Your Dark Sky API key to access the data.
     */
    public ForecastIO(String pApiKey) {
        mApiKey = pApiKey;
    }

    // ===========================================================
    // Methods
    // ===========================================================

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
