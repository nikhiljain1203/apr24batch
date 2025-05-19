package DesignPatterns.Factory;

import DesignPatterns.Factory.Components.Button;
import DesignPatterns.Factory.Components.IOSButton;
import DesignPatterns.Factory.Components.IOSTextField;
import DesignPatterns.Factory.Components.TextField;

public class IOS extends Platform {

    @Override
    public UiComponentFactory createUiComponentFactory() {
        return new IOSUiFactory();
    }
}
