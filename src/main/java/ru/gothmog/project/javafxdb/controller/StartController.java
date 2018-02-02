package ru.gothmog.project.javafxdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.gothmog.project.javafxdb.fxml.StartView;
import ru.gothmog.project.javafxdb.service.UserService;

@Component
public class StartController {
    @Autowired
    private UserService userService;

    @Autowired
    private StartView startView;
}
