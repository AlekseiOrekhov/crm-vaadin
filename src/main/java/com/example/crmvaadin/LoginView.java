package com.example.crmvaadin;

import com.example.crmvaadin.user.exceptions.UserException;
import com.example.crmvaadin.user.service.UserService;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.*;

@Route("/auth")
public class LoginView extends VerticalLayout implements AfterNavigationObserver, BeforeEnterObserver {
    private LoginOverlay login = new LoginOverlay();
    public LoginView() {
        VerticalLayout todosList = new VerticalLayout();
        TextField userName = new TextField();
        TextField password = new TextField();
        Button addButton = new Button("Login");
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

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
//        if (SecurityAccess.isUserLoggedIn()) {
//            event.rerouteTo(MainView.class);
//        }
    }

    @Override
    public void afterNavigation(AfterNavigationEvent event) {
        login.setError(event.getLocation().getQueryParameters().getParameters().containsKey("error"));
    }

}
