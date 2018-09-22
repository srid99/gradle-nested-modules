package in.srid;

import in.srid.core.Shared;

public class ApplicationOne {
    public static void main(String[] args) {
        System.out.println(ApplicationOne.class.getSimpleName() + " is using " + Shared.schema(1));
    }
}
