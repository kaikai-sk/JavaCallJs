package com.example.demo.db;

import org.junit.Test;

import javax.script.*;

import static com.example.demo.utils.FileIOUtils.getFileContentAsString;

public class DbHelperTest {
    @Test
    public void testDbHelper() {
        DbHelper dbHelper = new DbHelper();

    }

    @Test
    public void test_getJsObject() {
        try {
            ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
            Compilable compilable = (Compilable) engine;
            String script = getFileContentAsString("G:\\JavaCallJs\\src\\test\\java\\com\\example\\demo\\db\\getMySqlDriver.js"); //定义函数并调用
            CompiledScript JSFunction = compilable.compile(script); //解析编译脚本函数
            Bindings bindings = engine.createBindings(); //Local级别的Binding
            Object result = JSFunction.eval(bindings);
            //调用缓存着的脚本函数对象，Bindings作为参数容器传入
            System.out.println(result);
        }
        catch (ScriptException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test_function() {
        try {
            ScriptEngine engine = new ScriptEngineManager().getEngineByName("javascript");
            Compilable compilable = (Compilable) engine;
            Bindings bindings = engine.createBindings(); //Local级别的Binding
            String script = "function add(op1,op2){return op1+op2} add(a, b)"; //定义函数并调用
            CompiledScript JSFunction = compilable.compile(script); //解析编译脚本函数
            bindings.put("a", 1);bindings.put("b", 2); //通过Bindings加入参数
            Object result = JSFunction.eval(bindings);
            System.out.println(result); //调用缓存着的脚本函数对象，Bindings作为参数容器传入
        }
        catch (ScriptException e) {}
    }
}
