package lombok;

public class Main {
    public static void main(String[] args) {
        AnnotationsLombok annotationsLombok = new AnnotationsLombok("michal", "123", "MK");
        // jest getter
        System.out.println(annotationsLombok.getLogin());
        // jest setter
        annotationsLombok.setLogin("XXX");
        // jest toString
        System.out.println(annotationsLombok);
    }
}
