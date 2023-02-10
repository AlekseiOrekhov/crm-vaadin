package com.example.crmvaadin;

import com.example.crmvaadin.user.service.UserService;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("")

public class MainView extends VerticalLayout {

    private final UserService userService;

    public MainView(UserService userService) {
        this.userService = userService;
//        VerticalLayout todosList = new VerticalLayout();
//        TextField taskField = new TextField();
//        Button addButton = new Button("Add");
//        addButton.addClickListener(click -> {
//            Checkbox checkbox = new Checkbox(taskField.getValue());
//            todosList.add(checkbox);
//        });
//        addButton.addClickShortcut(Key.ENTER);
//
//        add(
//                new H1("Vaadin Todo"),
//                todosList,
//                new HorizontalLayout(
//                        taskField,
//                        addButton
//                )
//        );
        VerticalLayout todosList = new VerticalLayout();
        TextField userName = new TextField();
        TextField password = new TextField();
        Button addButton = new Button("Add");
        addButton.addClickListener(click -> {

            this.userService.addUser(userName.getValue(), password.getValue());
//            Checkbox checkbox = new Checkbox(taskField.getValue());
//            todosList.add(checkbox);
        });
        addButton.addClickShortcut(Key.ENTER);

        add(
                new H1("Vaadin Todo"),
                todosList,
                new HorizontalLayout(
                        userName,
                        password,
                        addButton
                )
        );
    }
}
