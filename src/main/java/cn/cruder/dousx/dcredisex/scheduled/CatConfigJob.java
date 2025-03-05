package cn.cruder.dousx.dcredisex.scheduled;

import cn.cruder.dousx.dcredisex.config.OptionConfig;
import cn.cruder.dousx.dcredisex.config.ReaderConfig;
import cn.cruder.dousx.dcredisex.config.SealConfig;
import cn.cruder.dousx.dcredisex.cto.SealInfo;
import cn.cruder.tools.json.JsonUtilPool;
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
        log.debug("readerUrl:{} port:{} retry:{}", readerUrl, port, retry);
        SealInfo sealInfo = sealConfig.getSealInfo();
        log.debug("sealConfig, Id:{} height:{} width:{}", sealInfo.getId(), sealInfo.getHeight(), sealInfo.getWidth());
        List<String> strings = optionConfig.colorList();
        log.debug("colorList:{}", JsonUtilPool.toJsonString(strings));
    }
}
