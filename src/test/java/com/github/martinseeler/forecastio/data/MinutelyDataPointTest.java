package com.github.martinseeler.forecastio.data;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.martinseeler.forecastio.Forecast;
import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import org.junit.BeforeClass;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import java.io.InputStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class MinutelyDataPointTest {

  private static MinutelyDataPoint FIXTURE;

  @BeforeClass
  public static void init() throws Exception {
    final InputStream sampleData = ClassLoader.getSystemResourceAsStream("sample4.json");
    final ObjectMapper mapper = new ObjectMapper();
    final Forecast forecast = mapper.readValue(sampleData, Forecast.class);
    FIXTURE = forecast.getMinutely().getDataPoints()[0];
  }

  @Test
  public void testGetTime() throws Exception {
    // GIVEN
    assertThat("Fixture should be loaded", FIXTURE, is(notNullValue()));
    // WHEN
    final long time = FIXTURE.getTime();
    // THEN
    assertThat("time should be correct!", time, is(1399137780L));
  }

  @Test
  public void testGetPrecipIntensity() throws Exception {
    // GIVEN
    assertThat("Fixture should be loaded", FIXTURE, is(notNullValue()));
    // WHEN
    final double precipIntensity = FIXTURE.getPrecipIntensity();
    // THEN
    assertThat("precipIntensity should be correct!", precipIntensity, is(0.0d));
  }

  @Test
  public void testGetPrecipProbability() throws Exception {
    // GIVEN
    assertThat("Fixture should be loaded", FIXTURE, is(notNullValue()));
    // WHEN
    final double precipProbability = FIXTURE.getPrecipProbability();
    // THEN
    assertThat("precipProbability should be correct!", precipProbability, is(0.0d));
  }

  @Test
  public void testGetPrecipIntensityError() throws Exception {
    // GIVEN
    assertThat("Fixture should be loaded", FIXTURE, is(notNullValue()));
    // WHEN
    final double precipIntensityError = FIXTURE.getPrecipIntensityError();
    // THEN
    assertThat("precipIntensityError should be correct!", precipIntensityError, is(0.0d));
  }

  @Test
  public void testGetPrecipType() throws Exception {
    // GIVEN
    assertThat("Fixture should be loaded", FIXTURE, is(notNullValue()));
    // WHEN
    final String precipType = FIXTURE.getPrecipType();
    // THEN
    assertThat("precipType should be correct!", precipType, is(nullValue()));
  }

  @Test
  public void testGetCloudCover() throws Exception {
    // GIVEN
    assertThat("Fixture should be loaded", FIXTURE, is(notNullValue()));
    // WHEN
    final double cloudCover = FIXTURE.getCloudCover();
    // THEN
    assertThat("cloudCover should be correct!", cloudCover, is(0.0d));
  }

  @Test
  public void testGetPressure() throws Exception {
    // GIVEN
    assertThat("Fixture should be loaded", FIXTURE, is(notNullValue()));
    // WHEN
    final double pressure = FIXTURE.getPressure();
    // THEN
    assertThat("pressure should be correct!", pressure, is(0.0d));
  }

  @Test
  public void testGetOzone() throws Exception {
    // GIVEN
    assertThat("Fixture should be loaded", FIXTURE, is(notNullValue()));
    // WHEN
    final double ozone = FIXTURE.getOzone();
    // THEN
    assertThat("ozone should be correct!", ozone, is(0.0d));
  }

  @Test
  public void testJsonEquality() throws Exception {
    // GIVEN
    final ObjectMapper mapper = new ObjectMapper();
    final String sampleData =
        Resources.toString(Resources.getResource("sample4.json"), Charsets.UTF_8);
    final JsonNode sampleNode = mapper.readTree(sampleData).get("minutely").get("data").get(0);
    // WHEN
    final String ourData = mapper.writeValueAsString(FIXTURE);
    // THEN
    JSONAssert.assertEquals(sampleNode.toString(), ourData, false);
  }
}
