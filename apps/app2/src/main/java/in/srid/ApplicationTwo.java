package in.srid;

import in.srid.core.Shared;

public class ApplicationTwo {
    public static void main(String[] args) {
        System.out.println(ApplicationTwo.class.getSimpleName() + " is using " + Shared.schema(2));
    }
}
