package cn.cruder.dousx.dcredisex.config;


import cn.cruder.dousx.dcredis.annotation.DynamicConfig;
import cn.cruder.dousx.dcredis.annotation.DynamicConfigProperty;


@DynamicConfig
public interface ReaderConfig {

    @DynamicConfigProperty(key = "reader.url", defaultValue = "localhost")
    String getReaderUrl();

    @DynamicConfigProperty(key = "reader.port", defaultValue = "6369")
    Integer getReaderPort();

    @DynamicConfigProperty(key = "reader.retry", defaultValue = "true")
    Boolean getReaderRetry();
}