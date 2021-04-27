package example.core;

/**
 * Generates a hello message.
 */
public class HelloMessageGenerator {

  /**
   * Generate a hello message.
   *
   * @param name recipient name
   * @return hello message
   */
  public static String helloMessage(final String name) {
    if (name == null) {
      return "Hello, World!";
    } else {
      return String.format("Hello, %s!", name);
    }
  }
}
