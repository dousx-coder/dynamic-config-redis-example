package cn.cruder.dousx.dcredisex.scheduled;

import cn.cruder.dousx.dcredisex.config.ReaderConfig;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Slf4j
@Component
public class CatConfigJob {

    private final ReaderConfig readerConfig;

    @Scheduled(cron = "*/5 * * * * ?")
    public void catReaderConfig() {
        String readerUrl = readerConfig.getReaderUrl();
        Integer port = readerConfig.getReaderPort();
        Boolean retry = readerConfig.getReaderRetry();
        log.debug("readerUrl:{} port:{} retry:{}", readerUrl, port, retry);
    }
}
