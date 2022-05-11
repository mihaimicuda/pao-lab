package model;

import java.util.ArrayList;
import java.util.List;

public class Notes {
    private String name;
    private String comments;

    public Notes(String name, String comments) {
        this.name = name;
        this.comments = comments;
    }
    public Notes( Notes notes){
        this.name = notes.name;
        this.comments = notes.comments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "name='" + name + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
