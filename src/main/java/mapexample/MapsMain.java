package mapexample;

import example.maps.Maps;

import java.util.Map;

public class MapsMain {

    public static Maps.IdWrapper getWrap(int id){
        return Maps.IdWrapper.newBuilder().setId(id).build();
    }

    public static void main(String[] args) {
        Maps.MapExample message = Maps.MapExample.newBuilder()
                .putIds("myIds", getWrap(11))
                .putAllIds(Map.of(
                        "newids", getWrap(10),
                        "another", getWrap(50),
                        "dvsesc", getWrap(60)
                ))
                .build();

        System.out.println(message);
        System.out.println(getWrap(100));
    }
}
