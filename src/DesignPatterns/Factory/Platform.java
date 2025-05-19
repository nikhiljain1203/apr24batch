package DesignPatterns.Factory;

import DesignPatterns.Factory.Components.Button;
import DesignPatterns.Factory.Components.TextField;

import java.nio.Buffer;

public abstract class Platform {
    public abstract UiComponentFactory createUiComponentFactory();
}
