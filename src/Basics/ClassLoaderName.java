package Basics;

public class ClassLoaderName {
    public static void main(String[] args) {
        //Print Class Loader Name
        Class<ClassLoaderName> c = ClassLoaderName.class;
        System.out.println(c.getClassLoader());
        System.out.println(String.class.getClassLoader());
    }
}
