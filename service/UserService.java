package service;
import java.util.*;

import model.Subscriber;

public class UserService {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void register(Subscriber s) {
        subscribers.add(s);
    }

    // Other user-related methods can be added here
}
