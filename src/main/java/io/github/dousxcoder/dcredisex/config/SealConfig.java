package io.github.dousxcoder.dcredisex.config;


import io.github.dousxcoder.dcredisex.cto.SealInfo;
import io.github.dousxcoder.dcredis.annotation.DcredisConfig;
import io.github.dousxcoder.dcredis.annotation.DcredisProperty;

@DcredisConfig
public interface SealConfig {

    @DcredisProperty(key = "seal:info", defaultValue = """
            {
              "height": 2.0,
              "id": "1",
              "width": 1.2
            }
            """)
    SealInfo getSealInfo();

}