package com.alibaba.fastjson.issue_3100;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class Issue3109 {
    @Test
    public void test_for_issue() throws Exception {
        ParserConfig config = new ParserConfig();
//        config.addAccept("test");
        JSON.parseObject("{\"@type\":\"testxx\",\"dogName\":\"dog1001\"}", Dog.class);
    }

    public static class Dog  {
        public String dogName;
    }
}
