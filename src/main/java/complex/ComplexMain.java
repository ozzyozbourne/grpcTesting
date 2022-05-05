package complex;

import example.complex.ComplexOuterClass;

import java.util.Arrays;

public class ComplexMain {

    private static ComplexOuterClass.Dummy newDummy(int id, String name){
        return ComplexOuterClass.Dummy.newBuilder()
                .setId(id)
                .setName(name)
                .build();
    }

    public static void main(String[] args) {
        ComplexOuterClass.Complex message  = ComplexOuterClass.Complex.newBuilder()
                .setDummyOne(newDummy(55, "One_Dummy"))
                .addAllDummies(Arrays.asList(
                        newDummy(66, "Two_Dummy"),
                        newDummy(78, "Three_Dummy"),
                        newDummy(99, "Four_Dummy")
                ))
                .build();
        System.out.println(message);

    }
}
