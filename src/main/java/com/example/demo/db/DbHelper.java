package com.example.demo.db;

import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Object;

import static com.example.demo.utils.FileIOUtils.getFileContentAsString;

public class DbHelper {
    public DbHelper() {
        String createConnectCode = getFileContentAsString("G:\\JavaCallJs\\src\\main\\resources\\static\\getConnection.js");
        V8 v8 = V8.createV8Runtime();
        V8Object connection = v8.executeObjectScript(createConnectCode);
    }
}
