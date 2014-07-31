package com.github.martinseeler.forecastio;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.io.InputStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public final class ForecastTest {

  private static Forecast FIXTURE;

  @BeforeClass
  public static void init() throws Exception {
    final InputStream sampleData = ClassLoader.getSystemResourceAsStream("sample1.json");
    final ObjectMapper mapper = new ObjectMapper();
    FIXTURE = mapper.readValue(sampleData, Forecast.class);
    sampleData.close();
  }

  @Test
  public void testGetLatitude() throws Exception {
    // GIVEN
    assertThat("Fixture should be loaded", FIXTURE, is(notNullValue()));
    // WHEN
    final double latitude = FIXTURE.getLatitude();
    // THEN
    assertThat("latitude value should match", latitude, is(51.03d));
  }

  @Test
  public void testGetLongitude() throws Exception {
    // GIVEN
    assertThat("Fixture should be loaded", FIXTURE, is(notNullValue()));
    // WHEN
    final double longitude = FIXTURE.getLongitude();
    // THEN
    assertThat("longitude value should match", longitude, is(13.44d));
  }

  @Test
  public void testGetTimezone() throws Exception {
    // GIVEN
    assertThat("Fixture should be loaded", FIXTURE, is(notNullValue()));
    // WHEN
    final String timezone = FIXTURE.getTimezone();
    // THEN
    assertThat("timezone value should match", timezone, is(equalTo("Europe/Berlin")));
  }

  @Test
  public void testGetOffset() throws Exception {
    // GIVEN
    assertThat("Fixture should be loaded", FIXTURE, is(notNullValue()));
    // WHEN
    final int offset = FIXTURE.getOffset();
    // THEN
    assertThat("offset value should match", offset, is(2));
  }

  @Test
  public void testGetCurrentHour() throws Exception {
    // GIVEN

    // WHEN

    // THEN

  }

  @Test
  public void testGetMinutely() throws Exception {
    // GIVEN

    // WHEN

    // THEN

  }

  @Test
  public void testSetMinutely() throws Exception {
    // GIVEN

    // WHEN

    // THEN

  }

  @Test
  public void testGetHourly() throws Exception {
    // GIVEN

    // WHEN

    // THEN

  }

  @Test
  public void testSetHourly() throws Exception {
    // GIVEN

    // WHEN

    // THEN

  }

  @Test
  public void testGetDaily() throws Exception {
    // GIVEN

    // WHEN

    // THEN

  }

  @Test
  public void testGetToday() throws Exception {
    // GIVEN

    // WHEN

    // THEN

  }

  @Test
  public void testGetTomorrow() throws Exception {
    // GIVEN

    // WHEN

    // THEN

  }

  @Test
  public void testGetTodayInOneWeek() throws Exception {
    // GIVEN

    // WHEN

    // THEN

  }

  @Test
  public void testSetDaily() throws Exception {
    // GIVEN

    // WHEN

    // THEN

  }

  @Test
  @Ignore("JSON equality not necessary.")
  public void testJSONequal() throws Exception {
    // GIVEN
    final String sampleData =
        Resources.toString(Resources.getResource("sample1.json"), Charsets.UTF_8);
    // WHEN
    final ObjectMapper mapper = new ObjectMapper();
    final String ourData = mapper.writeValueAsString(FIXTURE);
    // THEN
    JSONAssert.assertEquals(sampleData, ourData, JSONCompareMode.LENIENT);
  }
}
