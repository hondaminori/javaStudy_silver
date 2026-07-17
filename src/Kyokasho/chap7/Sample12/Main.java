package Kyokasho.chap7.Sample12;

public class Main {
    public static void main(String[] args) {
        try (ResourceSample resource = new ResourceSample()) {
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch: " + e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }
}
