package enumeration;

import example.enumerations.Enumerations;

public class EnumerationMain {

    public static void main(String[] args) {
        Enumerations.Enumeration enumeration = Enumerations.Enumeration.newBuilder()
               // .setEyeColor(Enumerations.EyeColor.EYE_COLOR_GREEN)
                .setEyeColorValue(1)
                .build();

        System.out.println(enumeration);

    }
}
