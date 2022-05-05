package simple;

import example.simple.SimpleOuterClass;

import java.util.Arrays;

public class SimpleMain {

    public static void main(String[] args) {
        SimpleOuterClass.Simple message = SimpleOuterClass.Simple.newBuilder()
                .setId(42)
                .setIsSimple(true)
                .setName("Ozzy Osbourne")
                .addSampleList(1)
                .addSampleList(2)
                .addSampleList(3)
                .addAllSampleList(Arrays.asList(4,5,6,7,8))
                .build();

        System.out.println(message);
    }
}
