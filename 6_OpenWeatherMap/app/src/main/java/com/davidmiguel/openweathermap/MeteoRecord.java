package com.davidmiguel.openweathermap;

import android.support.annotation.Nullable;

import java.util.Date;

/**
 * Model class for saving the a meteorology record.
 */
@SuppressWarnings("unused")
public class MeteoRecord {

    private long id;

    /**
     * Time of data calculation.
     */
    private Date timestamp;

    /**
     * City name.
     */
    @Nullable
    private String cityName;

    /**
     * Id of the weather condition (http://openweathermap.org/weather-conditions).
     */
    private int weatherCondition;

    /**
     * Weather icon id, e.g: "04n".
     */
    @Nullable
    private String weatherConditionIcon;

    /**
     * Temperature in Kelvin, e.g: 274.03.
     */
    private double temperature;

    /**
     * Minimum temperature, e.g: 273.15.
     */
    private double temperatureMin;

    /**
     * Maximum temperature in Kelvin, e.g: 274.82.
     */
    private double temperatureMax;

    /**
     * Pressure, e.g: 1023.
     */
    private int pressure;

    /**
     * Percentage of humidity, e.g: 18.
     */
    private int humidity;

    /**
     * Wind speed in meter/sec, e.g: 6.17.
     */
    private double windSpeed;

    /**
     * Wind direction in degrees (meteorological), e.g: 209.5.
     */
    private double windDegrees;

    /**
     * Percentage of cloudiness, e.g: 56.
     */
    private int clouds;

    /**
     * Rain volume (mm) for the last 3 hours, e.g: 3.25.
     */
    private double rain;

    /**
     * Snow volume (mm) for the last 3 hours, e.g: 2.3.
     */
    private double snow;

    public MeteoRecord() {
        // Needed by Realm
    }

    private MeteoRecord(long id, Date timestamp, @Nullable String cityName, int weatherCondition,
                        @Nullable String weatherConditionIcon, double temperature, double temperatureMin,
                        double temperatureMax, int pressure, int humidity, double windSpeed,
                        double windDegrees, int clouds, double rain, double snow) {
        this.id = id;
        this.timestamp = timestamp;
        this.cityName = cityName;
        this.weatherCondition = weatherCondition;
        this.weatherConditionIcon = weatherConditionIcon;
        this.temperature = temperature;
        this.temperatureMin = temperatureMin;
        this.temperatureMax = temperatureMax;
        this.pressure = pressure;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.windDegrees = windDegrees;
        this.clouds = clouds;
        this.rain = rain;
        this.snow = snow;
    }

    public MeteoRecord(Date timestamp, String cityName, int weatherCondition,
                       String weatherConditionIcon, double temperature, double temperatureMin,
                       double temperatureMax, int pressure, int humidity, double windSpeed,
                       double windDegrees, int clouds, double rain, double snow) {
        this(-1, timestamp, cityName, weatherCondition, weatherConditionIcon, temperature,
                temperatureMin, temperatureMax, pressure, humidity, windSpeed, windDegrees,
                clouds, rain, snow);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Nullable
    public String getCityName() {
        return cityName;
    }

    public void setCityName(@Nullable String cityName) {
        this.cityName = cityName;
    }

    public int getWeatherCondition() {
        return weatherCondition;
    }

    public void setWeatherCondition(int weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    @Nullable
    public String getWeatherConditionIcon() {
        return weatherConditionIcon;
    }

    public void setWeatherConditionIcon(@Nullable String weatherConditionIcon) {
        this.weatherConditionIcon = weatherConditionIcon;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperatureMin() {
        return temperatureMin;
    }

    public void setTemperatureMin(double temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    public double getTemperatureMax() {
        return temperatureMax;
    }

    public void setTemperatureMax(double temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getWindDegrees() {
        return windDegrees;
    }

    public void setWindDegrees(double windDegrees) {
        this.windDegrees = windDegrees;
    }

    public int getClouds() {
        return clouds;
    }

    public void setClouds(int clouds) {
        this.clouds = clouds;
    }

    public double getRain() {
        return rain;
    }

    public void setRain(double rain) {
        this.rain = rain;
    }

    public double getSnow() {
        return snow;
    }

    public void setSnow(double snow) {
        this.snow = snow;
    }

    @Override
    public String toString() {
        return "MeteoRecord{" +
                "id=" + id +
                ", timestamp=" + timestamp +
                ", cityName='" + cityName + '\'' +
                ", weatherCondition=" + weatherCondition +
                ", weatherConditionIcon='" + weatherConditionIcon + '\'' +
                ", temperature=" + temperature +
                ", temperatureMin=" + temperatureMin +
                ", temperatureMax=" + temperatureMax +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", windSpeed=" + windSpeed +
                ", windDegrees=" + windDegrees +
                ", clouds=" + clouds +
                ", rain=" + rain +
                ", snow=" + snow +
                '}';
    }
}
