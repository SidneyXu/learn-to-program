package org.mrseasons.coffeetime.groovy._23_groovy_java

import junit.framework.TestCase
import org.junit.Test

/**
 * Created by mrseasons on 3/5/15.
 */
class JavaCallGroovyTest extends TestCase {

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
    public void testGroovyClassLoader() throws Exception {
        GroovyClassLoader loader = new GroovyClassLoader();
        File file = new File("src/main/groovy/org/mrseasons/coffeetime/groovy/_23_groovy_java/GroovyBean.groovy");

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
    public void testGroovyScriptEngine() throws Exception {
        //可以实现动态脚本更新，运行时修改系统属性等功能
        String[] roots = {"src/main/groovy/org/mrseasons/coffeetime/groovy/_23_groovy_java"};
        GroovyScriptEngine engine = new GroovyScriptEngine(roots);
        Binding binding = new Binding();
        binding.setVariable("x", 3);
        binding.setVariable("y", 2.1);

        Object output = engine.run("engine.groovy", binding);
        assertEquals(5.1, output);
    }
}
