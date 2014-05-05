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

public final class CurrentDataPointTest {

  private static CurrentDataPoint FIXTURE;

  @BeforeClass
  public static void init() throws Exception {
    final InputStream sampleData = ClassLoader.getSystemResourceAsStream("sample4.json");
    final ObjectMapper mapper = new ObjectMapper();
    final Forecast forecast = mapper.readValue(sampleData, Forecast.class);
    FIXTURE = forecast.getCurrently();
  }

  @Test
  public void testGetNearestStormDistance() throws Exception {
    // GIVEN
    assertThat("Fixture should be loaded", FIXTURE, is(notNullValue()));
    // WHEN
    final double nearestStormDistance = FIXTURE.getNearestStormDistance();
    // THEN
    assertThat("nearestStormDistance should be correct!", nearestStormDistance, is(119.0d));
  }

  @Test
  public void testGetNearestStormBearing() throws Exception {
    // GIVEN
    assertThat("Fixture should be loaded", FIXTURE, is(notNullValue()));
    // WHEN
    final double nearestStormBearing = FIXTURE.getNearestStormBearing();
    // THEN
    assertThat("nearestStormBearing should be correct!", nearestStormBearing, is(139.0d));
  }

  @Test
  public void testJSONequal() throws Exception {
    // GIVEN
    final ObjectMapper mapper = new ObjectMapper();
    final String sampleData = Resources.toString(Resources.getResource("sample4.json"), Charsets.UTF_8);
    final JsonNode sampleNode = mapper.readTree(sampleData).get("currently");
    // WHEN
    final String ourData = mapper.writeValueAsString(FIXTURE);
    // THEN
    JSONAssert.assertEquals(sampleNode.toString(), ourData, false);
  }
}
