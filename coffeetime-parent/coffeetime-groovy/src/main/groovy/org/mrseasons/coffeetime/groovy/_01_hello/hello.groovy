package org.mrseasons.coffeetime.groovy._01_hello

println "Hello World"


String str = "\\u7248\\u672c\\u5347\\u7ea7\\u6807\\u9898"
str = str.replace("\\", "")
String[] arr = str.split("u")
StringBuilder builder = new StringBuilder()
for (int i = 1; i < arr.length; i++) {
    int hexVal = Integer.parseInt(arr[i], 16);
    builder.append((char) hexVal)
}
System.out.println(builder.toString());