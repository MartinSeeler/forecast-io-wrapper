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
import static org.junit.Assert.assertThat;

public final class HourlyDataPointTest {

  private static HourlyDataPoint FIXTURE;

  @BeforeClass
  public static void init() throws Exception {
    final InputStream sampleData = ClassLoader.getSystemResourceAsStream("sample4.json");
    final ObjectMapper mapper = new ObjectMapper();
    final Forecast forecast = mapper.readValue(sampleData, Forecast.class);
    FIXTURE = forecast.getHourly().getDataPoints()[0];
  }

  @Test
  public void testGetSummary() throws Exception {
    // GIVEN
    assertThat("Fixture should be loaded", FIXTURE, is(notNullValue()));
    // WHEN
    final String summary = FIXTURE.getSummary();
    // THEN
    assertThat("summary should be correct!", summary, is("Mostly Cloudy"));
  }

  @Test
  public void testGetIcon() throws Exception {
    // GIVEN
    assertThat("Fixture should be loaded", FIXTURE, is(notNullValue()));
    // WHEN
    final String icon = FIXTURE.getIcon();
    // THEN
    assertThat("icon should be correct!", icon, is("partly-cloudy-day"));
  }

  @Test
  public void testGetTemperature() throws Exception {
    // GIVEN
    assertThat("Fixture should be loaded", FIXTURE, is(notNullValue()));
    // WHEN
    final double temperature = FIXTURE.getTemperature();
    // THEN
    assertThat("temperature should be correct!", temperature, is(56.41d));
  }

  @Test
  public void testGetApparentTemperature() throws Exception {
    // GIVEN
    assertThat("Fixture should be loaded", FIXTURE, is(notNullValue()));
    // WHEN
    final double apparentTemperature = FIXTURE.getApparentTemperature();
    // THEN
    assertThat("apparentTemperature should be correct!", apparentTemperature, is(56.41d));
  }

  @Test
  public void testGetDewPoint() throws Exception {
    // GIVEN
    assertThat("Fixture should be loaded", FIXTURE, is(notNullValue()));
    // WHEN
    final double dewPoint = FIXTURE.getDewPoint();
    // THEN
    assertThat("dewPoint should be correct!", dewPoint, is(47.81d));
  }

  @Test
  public void testGetHumidity() throws Exception {
    // GIVEN
    assertThat("Fixture should be loaded", FIXTURE, is(notNullValue()));
    // WHEN
    final double humidity = FIXTURE.getHumidity();
    // THEN
    assertThat("humidity should be correct!", humidity, is(0.73d));
  }

  @Test
  public void testGetWindSpeed() throws Exception {
    // GIVEN
    assertThat("Fixture should be loaded", FIXTURE, is(notNullValue()));
    // WHEN
    final double windSpeed = FIXTURE.getWindSpeed();
    // THEN
    assertThat("windSpeed should be correct!", windSpeed, is(6.47d));
  }

  @Test
  public void testGetWindBearing() throws Exception {
    // GIVEN
    assertThat("Fixture should be loaded", FIXTURE, is(notNullValue()));
    // WHEN
    final int windBearing = FIXTURE.getWindBearing();
    // THEN
    assertThat("windBearing should be correct!", windBearing, is(253));
  }

  @Test
  public void testJsonEquality() throws Exception {
    // GIVEN
    final ObjectMapper mapper = new ObjectMapper();
    final String sampleData =
        Resources.toString(Resources.getResource("sample4.json"), Charsets.UTF_8);
    final JsonNode sampleNode = mapper.readTree(sampleData).get("hourly").get("data").get(0);
    // WHEN
    final String ourData = mapper.writeValueAsString(FIXTURE);
    // THEN
    JSONAssert.assertEquals(sampleNode.toString(), ourData, false);
  }
}
