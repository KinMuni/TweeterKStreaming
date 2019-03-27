package kin.muni.app.config;

public class KafkaConfiguration {
    public static final String SERVERS = "localhost-1:9095, localhost-2:9095, localhost:9095";
    public static final String TOPIC = "bigdata-tweets";
    public static final long SLEEP_TIMER = 1000;
}
