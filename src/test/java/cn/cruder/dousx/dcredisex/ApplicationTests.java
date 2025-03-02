package cn.cruder.dousx.dcredisex;

import cn.cruder.dousx.dcredisex.config.ReaderConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class ApplicationTests {


    @Autowired
    private ReaderConfig readerConfig;

    @Test
    void t1() {
        String readerUrl = readerConfig.getReaderUrl();
        Integer port = readerConfig.getReaderPort();
        Boolean retry = readerConfig.getReaderRetry();
        log.debug("readerUrl:{} port:{} retry:{}", readerUrl, port, retry);
    }
}
