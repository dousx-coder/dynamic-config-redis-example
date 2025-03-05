package cn.cruder.dousx.dcredisex;

import cn.cruder.dousx.dcredisex.config.ReaderConfig;
import cn.cruder.dousx.dcredisex.cto.SealInfo;
import cn.cruder.tools.json.JsonUtilPool;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.redisson.api.RedissonClient;
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
