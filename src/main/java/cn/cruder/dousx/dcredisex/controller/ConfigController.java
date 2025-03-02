package cn.cruder.dousx.dcredisex.controller;

import cn.cruder.dousx.dcredis.component.ConfigUpdater;
import cn.cruder.tools.rest.CommonRestResult;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class ConfigController {

    private final ConfigUpdater configUpdater;

    /**
     * curl --location --request PUT 'http://127.0.0.1:7210/rce/update-config/reader.url/newv'
     *
     * @param key   key
     * @param value 新值
     * @return {@link CommonRestResult}
     */
    @PutMapping("/rce/update-config/{key}/{value}")
    public CommonRestResult<String> updateConfig(@PathVariable(value = "key") String key,
                                                 @PathVariable(value = "value") String value) {
        configUpdater.updateRedisConfig(key, value);
        return CommonRestResult.ok();
    }
}
