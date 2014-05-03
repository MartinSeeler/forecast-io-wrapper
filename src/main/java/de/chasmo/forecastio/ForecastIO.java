package de.chasmo.forecastio;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gag.annotation.disclaimer.WrittenWhile;
import com.google.gag.annotation.remark.Magic;
import com.google.gag.annotation.remark.RTFM;
import com.google.gag.annotation.team.Visionary;
import com.google.gag.enumeration.MagicType;
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
@Visionary("chasmo")
@WrittenWhile("listening to top100station")
@RTFM("https://developer.forecast.io/docs/v2")
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
  private final String apiKey;

  // ===========================================================
  // Constructors
  // ===========================================================

  /**
   * Creates a new API wrapper to request some data from the API.
   *
   * @param apiKey Your Dark Sky API key to make requests.
   */
  public ForecastIO(final String apiKey) {
    this.apiKey = apiKey;
  }

  // ===========================================================
  // Methods
  // ===========================================================

  /**
   * Performs a request to the API with the geographic coordinates of a location.
   *
   * @param latitude  The requested latitude.
   * @param longitude The requested longitude.
   */
  @Magic(type = MagicType.WHITE)
  public Forecast getForecastFor(final double latitude, final double longitude) {
    try {
      final URL url =
          new URL(BASE_DOMAIN + '/' + apiKey + '/' + latitude + ',' + longitude + "?units=si");
      final InputStream responseStream = url.openStream();
      final ObjectMapper mapper = new ObjectMapper();
      return mapper.readValue(responseStream, Forecast.class);
    } catch (final MalformedURLException e) {
      LOGGER.warn("There was an error building the URL for this request!", e);
    } catch (final JsonParseException | JsonMappingException e) {
      LOGGER.warn("There was an error while parsing the data from JSON!", e);
    } catch (final IOException e) {
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

  @Override
  public String toString() {
    return "ForecastIO{ apiKey='" + apiKey + " }";
  }

  // ===========================================================
  // Inner and Anonymous Classes
  // ===========================================================

}

