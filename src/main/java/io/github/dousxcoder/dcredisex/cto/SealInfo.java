package io.github.dousxcoder.dcredisex.cto;

import io.github.dousxcoder.tools.json.JsonUtilPool;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class SealInfo implements Serializable {

    private String id;

    private Double width;

    private Double height;

    @Override
    public String toString() {
        return JsonUtilPool.toJsonString(this);
    }
}
