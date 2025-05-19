package DesignPatterns.Factory;

import DesignPatterns.Factory.Components.Button;
import DesignPatterns.Factory.Components.IOSButton;
import DesignPatterns.Factory.Components.IOSTextField;
import DesignPatterns.Factory.Components.TextField;

public class IOSUiFactory implements UiComponentFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public TextField createTextField() {
        return new IOSTextField();
    }
}
