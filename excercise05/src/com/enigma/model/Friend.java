package com.enigma.model;

import java.util.Objects;

public class Friend {
    String friend;

    public Friend(String friends) {
        this.friend = friends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friend friend1 = (Friend) o;
        return Objects.equals(friend, friend1.friend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(friend);
    }

    public String getFriend() {
        return friend;
    }

    public void setFriend(String friend) {
        this.friend = friend;
    }
}
