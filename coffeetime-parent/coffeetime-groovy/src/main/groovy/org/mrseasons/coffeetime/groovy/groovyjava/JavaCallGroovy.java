package org.mrseasons.coffeetime.groovy.groovyjava;

import groovy.lang.Binding;
import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyObject;
import groovy.lang.GroovyShell;
import groovy.util.GroovyScriptEngine;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by mrseasons on 2015/2/2.
 */
public class JavaCallGroovy {

    @Test
    public void testGroovyShell() {
        //用于计算简单的表达式和脚本
        Binding binding = new Binding();
        binding.setVariable("x", 3);
        binding.setVariable("y", 2.1);

        GroovyShell shell = new GroovyShell(binding);
        Object value = shell.evaluate("x+y");
        assertEquals(5.1, value);
    }

    @Test
    public void testGroovyClassLoader() throws Exception{
        GroovyClassLoader loader = new GroovyClassLoader();
        File file = new File("src/main/groovy/org/mrseasons/coffeetime/groovy/groovyjava/GroovyBean.groovy");

        Class<?> groovyClass = loader.parseClass(file);
        GroovyObject groovyObject = (GroovyObject) groovyClass.newInstance();
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        Object[] arguments = {list};
        Object value = groovyObject.invokeMethod("calc", arguments);
        assertEquals(8, value);
    }

    @Test
    public void testGroovyScriptEngine() throws Exception{
        //可以实现动态脚本更新，运行时修改系统属性等功能
        String[] roots = {"src/main/groovy/org/mrseasons/coffeetime/groovy/groovyjava"};
        GroovyScriptEngine engine = new GroovyScriptEngine(roots);
        Binding binding = new Binding();
        binding.setVariable("x", 3);
        binding.setVariable("y", 2.1);

        Object output = engine.run("First.groovy", binding);
        assertEquals(5.1, output);
    }

}
