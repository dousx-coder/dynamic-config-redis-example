package io.github.dousxcoder.dcredisex.config;


import io.github.dousxcoder.dcredis.annotation.DcredisConfig;
import io.github.dousxcoder.dcredis.annotation.DcredisProperty;

@DcredisConfig
public interface ReaderConfig {
    @DcredisProperty(key = "reader:url", defaultValue = "localhost")
    String getReaderUrl();

    @DcredisProperty(key = "reader:port", defaultValue = "6369")
    Integer getReaderPort();

    @DcredisProperty(key = "reader:retry", defaultValue = "true")
    Boolean getReaderRetry();

}