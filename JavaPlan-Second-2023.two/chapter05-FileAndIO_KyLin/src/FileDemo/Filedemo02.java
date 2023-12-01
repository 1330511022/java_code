package FileDemo;


import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FilenameFilter;

public class Filedemo02 {
    @Test
    public void test() {
        File file = new File("/home/kylin/");
        printFileName(file);
    }

    public void printFileName(File file) {
        if (file.isFile()) {
            System.out.println(file.getName());
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                printFileName(f);
            }
        }
    }

    @Test
    public void test2() {
        File file = new File("/home/kylin/java_code/JavaPlan-First-2023.One/chapter02-First/src/chapter02");
        FilenameFilter filenameFilter = new FilenameFilter() {
            @Override
            public boolean accept(File file, String s) {
                if (s.endsWith(".java")) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        String[] list = file.list(filenameFilter);
        for (String s : list) {
            System.out.println(s);
        }

    }
}