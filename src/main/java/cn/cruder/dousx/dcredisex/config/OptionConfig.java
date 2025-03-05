package cn.cruder.dousx.dcredisex.config;

import cn.cruder.dousx.dcredis.annotation.DcredisConfig;
import cn.cruder.dousx.dcredis.annotation.DcredisProperty;

import java.util.List;

@DcredisConfig
public interface OptionConfig {
    @DcredisProperty(key = "option:color", defaultValue = """
            ["REA","BLACK","green"]
            """)
    List<String> colorList();
}
