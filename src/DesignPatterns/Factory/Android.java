package DesignPatterns.Factory;

import DesignPatterns.Factory.Components.AndroidButton;
import DesignPatterns.Factory.Components.AndroidTextField;
import DesignPatterns.Factory.Components.Button;
import DesignPatterns.Factory.Components.TextField;

public class Android extends Platform {

    @Override
    public UiComponentFactory createUiComponentFactory() {
        return new AndroidUiFactory();
    }
}
