package cn.cruder.dousx.dcredisex.config;


import cn.cruder.dousx.dcredis.annotation.DcredisConfig;
import cn.cruder.dousx.dcredis.annotation.DcredisProperty;
import cn.cruder.dousx.dcredisex.cto.SealInfo;

@DcredisConfig
public interface ReaderConfig {
    @DcredisProperty(key = "reader.url", defaultValue = "localhost")
    String getReaderUrl();

    @DcredisProperty(key = "reader.port", defaultValue = "6369")
    Integer getReaderPort();

    @DcredisProperty(key = "reader.retry", defaultValue = "true")
    Boolean getReaderRetry();

}