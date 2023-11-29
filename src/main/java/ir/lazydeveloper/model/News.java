package ir.lazydeveloper.model;

import java.io.Serializable;

/**
 * Created by a_rayani on 11/18/2023
 */
public class News implements Serializable {
    private String name;

    public News(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public News setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "News{" +
                "name='" + name + '\'' +
                '}';
    }
}
