package io.github.dousxcoder.dcredisex.scheduled;

import cn.cruder.tools.json.JsonUtilPool;
import io.github.dousxcoder.dcredisex.config.OptionConfig;
import io.github.dousxcoder.dcredisex.config.ReaderConfig;
import io.github.dousxcoder.dcredisex.config.SealConfig;
import io.github.dousxcoder.dcredisex.cto.SealInfo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Slf4j
@Component
public class CatConfigJob {

    private final ReaderConfig readerConfig;

    private final SealConfig sealConfig;

    private final OptionConfig optionConfig;

    @Scheduled(cron = "*/30 * * * * ?")
    public void catReaderConfig() {
        String readerUrl = readerConfig.getReaderUrl();
        Integer port = readerConfig.getReaderPort();
        Boolean retry = readerConfig.getReaderRetry();
        log.info("readerUrl:{} port:{} retry:{}", readerUrl, port, retry);
        SealInfo sealInfo = sealConfig.getSealInfo();
        log.info("sealConfig, Id:{} height:{} width:{}", sealInfo.getId(), sealInfo.getHeight(), sealInfo.getWidth());
        List<String> strings = optionConfig.colorList();
        log.info("colorList:{}", JsonUtilPool.toJsonString(strings));
    }
}
