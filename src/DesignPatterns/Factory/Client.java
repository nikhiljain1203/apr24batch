package DesignPatterns.Factory;

public class Client {
    public static void main(String[] args) {
//        Platform platform = new Android();
//        platform.createButton().render();
//        platform.createTextField().render();
//
//        platform = new IOS();
//        platform.createButton().render();
//        platform.createTextField().render();

        System.out.println("Please Enter Platform");
        String platformName = new java.util.Scanner(System.in).nextLine();

//        Platform platform = null;
//        if (platform.equals("Android")) {
//            platform = new Android();
//        } else if (platform.equals("IOS")) {
//            platform = new IOS();
//        } else {
//            System.out.println("Invalid platform");
//            return;
//        }

        Platform platform = PlatformFactory.createPlatform(platformName);
        UiComponentFactory ui = platform.createUiComponentFactory();
        ui.createButton();
    }
}
