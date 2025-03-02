package cn.cruder.dousx.dcredisex.config;


import cn.cruder.dousx.dcredis.annotation.DcredisConfig;
import cn.cruder.dousx.dcredis.annotation.DcredisProperty;
import cn.cruder.dousx.dcredisex.cto.SealInfo;

@DcredisConfig
public interface SealConfig {

    @DcredisProperty(key = "seal.info", defaultValue = """
            {
              "height": 2.0,
              "id": "1",
              "width": 1.2
            }
            """)
    SealInfo getSealInfo();

}