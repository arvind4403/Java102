import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args){
        try {
            FileWriter file=new FileWriter("C:\\Users\\krarv\\Downloads\\demo\\java102\\Simple.txt");
            try {
                file.write("Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let programmers write once, run anywhere (WORA),[17] meaning that compiled Java code can run on all platforms that support Java without the need to recompile.[18] Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but has fewer low-level facilities than either of them. The Java runtime provides dynamic capabilities (such as reflection and runtime code modification) that are typically not available in traditional compiled languages. As of 2019, Java was one of the most popular programming languages in use according to GitHub,[citation not found][19][20] particularly for client–server web applications, with a reported 9 million developers.");
            }finally {
                file.close();
            }
            System.out.println("Successfully data Wrote in file");

        }catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
