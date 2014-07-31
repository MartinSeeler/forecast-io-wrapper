package com.github.martinseeler.forecastio.data;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.martinseeler.forecastio.Forecast;
import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.io.InputStream;

public class DailyDataPointTest {

  private static DailyDataPoint FIXTURE;

  @BeforeClass
  public static void init() throws Exception {
    final InputStream sampleData = ClassLoader.getSystemResourceAsStream("sample4.json");
    final ObjectMapper mapper = new ObjectMapper();
    final Forecast forecast = mapper.readValue(sampleData, Forecast.class);
    FIXTURE = forecast.getDaily().getDataPoints()[0];
  }

  @Test
  public void testGetSunriseTime() throws Exception {
    // GIVEN

    // WHEN

    // THEN

  }

  @Test
  public void testGetSunsetTime() throws Exception {
    // GIVEN

    // WHEN

    // THEN

  }

  @Test
  public void testGetMoonPhase() throws Exception {
    // GIVEN

    // WHEN

    // THEN

  }

  @Test
  public void testGetPrecipIntensityMax() throws Exception {
    // GIVEN

    // WHEN

    // THEN

  }

  @Test
  public void testGetPrecipIntensityMaxTime() throws Exception {
    // GIVEN

    // WHEN

    // THEN

  }

  @Test
  public void testGetPrecipAccumulation() throws Exception {
    // GIVEN

    // WHEN

    // THEN

  }

  @Test
  @Ignore("JSON equality not necessary.")
  public void testJsonEquality() throws Exception {
    // GIVEN
    final ObjectMapper mapper = new ObjectMapper();
    final String sampleData =
        Resources.toString(Resources.getResource("sample4.json"), Charsets.UTF_8);
    final JsonNode sampleNode = mapper.readTree(sampleData).get("daily").get("data").get(0);
    // WHEN
    final String ourData = mapper.writeValueAsString(FIXTURE);
    // THEN
    JSONAssert.assertEquals(sampleNode.toString(), ourData, JSONCompareMode.LENIENT);
  }
}
