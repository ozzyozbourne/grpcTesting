package testpac;

import example.test.Test;

import java.util.Arrays;

public class TestPacMain {


    private static Test.Cleaner getCleaner(int id, Iterable<String> i){
        return Test.Cleaner.newBuilder().setId(id).addAllValu(i).build();
    }

    private static Test.ThirdMsg getThirdMsg(int id , Iterable<Float> i){
        return Test.ThirdMsg.newBuilder().setId(id).addAllFl(i).build();
    }

    private static Test.TestMsg getTestMsg(int id, String name, boolean val, Iterable<String> i){
        return Test.TestMsg.newBuilder().setId(id).setName(name).setIsTrue(val).addAllOthers(i).build();
    }

    public static void main(String[] args) {
        Test.Composed message = Test.Composed.newBuilder()
                .setC1(getCleaner(10, Arrays.asList("one", "two", "three")))
                .setT1(getTestMsg(50, "ozzy", true, Arrays.asList("wsad", "right", "lrft", "etc")))
                .setT2(getThirdMsg(90, Arrays.asList(10.5f, 50.45f, 80.45f)))
                .build();

        System.out.println(message);
    }
}
