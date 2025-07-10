package controller;

import service.UserService;
import model.Subscriber;

public class SubscriberController {
    private UserService userService = new UserService();

    public void register(Subscriber s) {
        userService.register(s);
    }
}
