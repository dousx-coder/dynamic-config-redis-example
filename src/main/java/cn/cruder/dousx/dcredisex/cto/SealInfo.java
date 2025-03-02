package cn.cruder.dousx.dcredisex.cto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class SealInfo implements Serializable {

    private String id;

    private Double width;

    private Double height;

}
