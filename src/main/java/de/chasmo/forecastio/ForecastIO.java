package de.chasmo.forecastio;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Wrapper class to execute the API requests and retrieve data.
 *
 * @author Martin Seeler <developer@chasmo.de>
 * @since 22.11.13 - 22:01
 */
public final class ForecastIO {

    // ===========================================================
    // Constants
    // ===========================================================

    /** Logging instance. */
    private static final Logger LOGGER = LoggerFactory.getLogger(ForecastIO.class);

    /** The base domain for API requests. */
    private static final String BASE_DOMAIN = "https://api.forecast.io/forecast";

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
    public Forecast getForecast(final double pLatitude, final double pLongitude) {
        URL url = null;
        try {
            url = new URL(BASE_DOMAIN + '/' + mApiKey + '/' + pLatitude + ',' + pLongitude + "?units=si");
            final InputStream responseStream = url.openStream();
            final ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(responseStream, Forecast.class);
        } catch (MalformedURLException e) {
            LOGGER.warn("There was an error building the URL for this request!", e);
        } catch (IOException e) {
            LOGGER.warn("There was an error while reading the data!", e);
        }
        return null;
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
