package pom;

public interface DefaultPage {
    /**
     * Interface Method to post url from config.properties file.
     * @return [String]
     */
    <T> String getUrl(T... values);

    /**
     * Interface Method to visit a page using getUrl() method for the page.
     */
    <T> void load(T... values);

    /**
     * Interface Method to check html field's validations in the page.
     * @param element [String]
     * @param attribute [String]
     * @param value [String]
     * @return [boolean]
     */
    boolean validateField(String element, String attribute, String value);
}
