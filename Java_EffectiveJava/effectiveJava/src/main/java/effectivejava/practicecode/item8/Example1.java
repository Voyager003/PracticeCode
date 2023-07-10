package effectivejava.practicecode.item8;

import java.io.*;

import static org.springframework.util.FileCopyUtils.BUFFER_SIZE;

public class Example1 {
    public static void copy(String src, String dst) throws IOException {
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst)) {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }
    }
}
