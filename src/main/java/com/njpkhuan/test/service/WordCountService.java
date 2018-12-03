package com.njpkhuan.test.service;

import com.njpkhuan.test.model.WordCount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huan
 */
@Service
public class WordCountService {
    public List<WordCount> getDefault() {
        List<WordCount> wordCountList = new ArrayList<WordCount>();
        WordCount wordCount = new WordCount();
        wordCount.setWord("hellow");
        wordCount.setCount(10);
        wordCountList.add(wordCount);
        wordCount = new WordCount();
        wordCount.setWord("world");
        wordCount.setCount(20);
        wordCountList.add(wordCount);
        return wordCountList;
    }
}
