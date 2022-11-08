import lombok.*;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Quote {

    private final int id;
    private final String author;
    private final String quote;
    @Setter
    private boolean favourite;

}

