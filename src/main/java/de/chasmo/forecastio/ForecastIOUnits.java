package de.chasmo.forecastio;

/**
 * Use these units to specify the units used in the response fields.
 *
 * @author Martin Seeler <developer@chasmo.de>
 * @since 22.11.13 - 22:57
 */
public enum ForecastIOUnits {

    /** The default units used by the API. (Imperial units) */
    US,

    /**
     * The the International System of Units.
     * <p/>
     * In particular, properties now have the following units:
     * <ul>
     * <li>summary: Any summaries containing temperature or snow
     * accumulation units will have their values in degrees Celsius or in
     * centimeters (respectively).</li>
     * <li>precipIntensity: Millimeters per hour.</li>
     * <li>precipIntensityMax: Millimeters per hour.</li>
     * <li>precipAccumulation: Centimeters.</li>
     * <li>temperature: Degrees Celsius.</li>
     * <li>temperatureMin: Degrees Celsius.</li>
     * <li>temperatureMax: Degrees Celsius.</li>
     * <li>apparentTemperature: Degrees Celsius.</li>
     * <li>dewPoint: Degrees Celsius.</li>
     * <li>windSpeed: Meters per second.</li>
     * <li>pressure: Hectopascals (which are, conveniently,
     * equivalent to the default millibars).</li>
     * <li>visibility: Kilometers.</li>
     * </ul>
     */
    SI,

    /** Identical to {@link ForecastIOUnits#SI}, except that windSpeed is in kilometers per hour. */
    CA,

    /** Identical to {@link ForecastIOUnits#SI}, except that windSpeed is in miles per hour, as in {@link ForecastIOUnits#US}. (This option is provided because adoption of SI in the UK has been inconsistent.) */
    UK,

    /** Selects the relevant units automatically, based on geographic location. */
    AUTO
}
