package model;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;

public enum License {
    NONE, TRAUMATIC, HUNTER, POLICE, MILITARY;
    //    level       INT AUTO_INCREMENT PRIMARY KEY,
    //    name        VARCHAR(128) NOT NULL,
    //    description VARCHAR(1024)

    public static Optional<License> valueOf(int id) {
        return Arrays.stream(values())
            .filter(license -> license.ordinal() == id)
            .findAny();
    }
}