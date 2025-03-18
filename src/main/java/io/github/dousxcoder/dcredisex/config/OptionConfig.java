package io.github.dousxcoder.dcredisex.config;


import io.github.dousxcoder.dcredis.annotation.DcredisConfig;
import io.github.dousxcoder.dcredis.annotation.DcredisProperty;

import java.util.List;

@DcredisConfig
public interface OptionConfig {
    @DcredisProperty(key = "option:color", defaultValue = """
            ["REA","BLACK","green"]
            """)
    List<String> colorList();
}
