package DesignPatterns.Factory;

import DesignPatterns.Factory.Components.Button;
import DesignPatterns.Factory.Components.TextField;

public interface UiComponentFactory {
    public abstract Button createButton();
    public abstract TextField createTextField();
}
