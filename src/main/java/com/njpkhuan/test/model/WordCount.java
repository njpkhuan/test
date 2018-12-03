package com.njpkhuan.test.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author huan
 */
@Data
public class WordCount implements Serializable {

    private String word;
    private Integer count;
}
