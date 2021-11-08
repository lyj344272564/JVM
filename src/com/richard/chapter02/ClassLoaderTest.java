package com.richard.chapter02;

public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);

        ClassLoader bootstrap = extClassLoader.getParent();
        System.out.println(bootstrap);

        System.out.println("---------------------------------------------------");
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        ClassLoader ex = classLoader.getParent();
        System.out.println(ex);
        ClassLoader boot = ex.getParent();
        System.out.println(boot);

        System.out.println("---------------------------");
        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1); // null

    }
}
