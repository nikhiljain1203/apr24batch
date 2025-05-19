package DesignPatterns.Factory;

import DesignPatterns.Factory.Components.AndroidButton;
import DesignPatterns.Factory.Components.AndroidTextField;
import DesignPatterns.Factory.Components.Button;
import DesignPatterns.Factory.Components.TextField;

public class AndroidUiFactory implements UiComponentFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public TextField createTextField() {
        return new AndroidTextField();
    }
}
