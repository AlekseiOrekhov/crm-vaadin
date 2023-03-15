package com.example.crmvaadin.frontend;

import com.example.crmvaadin.user.exceptions.UserException;
import com.example.crmvaadin.user.service.UserService;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("/addUser")

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
        Notification notification = new Notification();
        Button closeButton = new Button(new Icon("lumo", "cross"));
        closeButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY_INLINE);
        closeButton.getElement().setAttribute("aria-label", "Close");
        closeButton.addClickListener(event -> {
            notification.close();
        });
        Div text = new Div();
        addButton.addClickListener(click -> {
            try {
                userService.addUser(userName.getValue(), password.getValue());
                text.add(new Text("Новый пользователь добавлен!"));
                notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
            } catch (UserException e) {
                notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
                text.add(new Text(e.getMessage()));
            } catch (Exception e) {
                notification.addThemeVariants(NotificationVariant.LUMO_ERROR);
                text.add(new Text(e.getMessage()));
            }

        });
        HorizontalLayout layout = new HorizontalLayout(text, closeButton);
        layout.setAlignItems(Alignment.CENTER);

        notification.add(layout);
        addButton.addClickShortcut(Key.ENTER);
        notification.open();
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
