package io.github.dousxcoder.dcredisex.controller;


import io.github.dousxcoder.bal.annotation.AopLogger;
import io.github.dousxcoder.bal.enums.LevelEnum;
import io.github.dousxcoder.dcredis.component.DcredisConfigUpdater;
import io.github.dousxcoder.dcredis.record.UpdateConfigRecord;
import io.github.dousxcoder.tools.rest.CommonRestResult;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class ConfigController {

    private final DcredisConfigUpdater dcredisConfigUpdater;

    /**
     * <li/>示例1：
     *
     * <pre>{@code
     * curl --location --request PUT 'http://127.0.0.1:7210/rce/update-config' `
     * --header 'Content-Type: application/json' `
     * --data '{
     *     "key":"reader:port",
     *     "config":555
     * }'
     * }
     * </pre>
     * <li/>示例2：
     * <pre>{@code
     * curl --location --request PUT 'http://127.0.0.1:7210/rce/update-config' `
     * --header 'Content-Type: application/json' `
     * --data '{
     *     "key": "seal:info",
     *     "config": {
     *         "height": 2.3,
     *         "id": "1",
     *         "width": 1.452
     *     }
     * }'
     * }
     * </pre>
     * <li/>示例3：
     * <pre>{@code
     * curl --location --request PUT 'http://127.0.0.1:7210/rce/update-config' `
     * --header 'Content-Type: application/json' `
     * --data '{
     *     "key": "option:color",
     *     "config": [
     *         "REA",
     *         "green",
     *         "white"
     *     ]
     * }'
     * }
     *
     * </pre>
     *
     * @param param {@link UpdateConfigRecord}
     * @return {@link CommonRestResult}
     */
    @AopLogger(level = LevelEnum.INFO, describe = "更新配置")
    @PutMapping("/rce/update-config")
    public CommonRestResult<String> updateConfig(@RequestBody UpdateConfigRecord param) {
        dcredisConfigUpdater.updateRedisConfig(param);
        return CommonRestResult.ok();
    }
}
