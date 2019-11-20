package lombok;

// model java beans
//@ToString            // dodaje metode toString()
//@Setter              // dodaje settery do wszystkich pol
//@Getter              // dodaje gettery do wszystkich pol
//@NoArgsConstructor   // dodaje kontruktor domyslny - bez argumentow
@AllArgsConstructor    // dodaje konstruktor z wszystkimi polami klasowymi w argumencie
@Data                  // dodaje gettery, settery i toString() do wszystkich pol klasowych
public class AnnotationsLombok {
    private String login;
    private String password;
    private String acronim;

}
