package DesignPatterns.Factory;

// Practical Factory
public class PlatformFactory {
    public static Platform createPlatform(String platformType) {
        if (platformType.equalsIgnoreCase("Android")) {
            return new Android();
        } else if (platformType.equalsIgnoreCase("IOS")) {
            return new IOS();
        } else {
            throw new IllegalArgumentException("Unknown platform type: " + platformType);
        }
    }
}
