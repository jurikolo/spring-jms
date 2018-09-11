package me.jurikolo.springjms.model;

import java.util.Objects;

public class DummyPost {
    private String id;
    private String message;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DummyPost dummyPost = (DummyPost) o;
        return Objects.equals(id, dummyPost.id) &&
                Objects.equals(message, dummyPost.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, message);
    }
}
