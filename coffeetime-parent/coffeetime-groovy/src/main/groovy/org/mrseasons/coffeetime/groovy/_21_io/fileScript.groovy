package org.mrseasons.coffeetime.groovy._21_io

/**
 * Created by mrseasons on 2015/3/15.
 */
//file path starts with current directory
//output
def file = new File("file.txt")
if (!file.exists()) {
    file.createNewFile()
} else {
    file.delete()
}
file.append("test\n")

def fos = new FileOutputStream(file, true)
fos.write("abc".getBytes())
fos.close()

//input
def fis = new FileInputStream(file)
fis.eachLine { line ->
    println(line)
}
