
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.*;
// imports Junit and assert

public class MarkdownParseTest {

    @Test // declares addition a test method
    public void addition() {
        assertEquals(2, 1 + 1);
        // checks a given value, 1+1, is equal to the expected value
    }

    @Test
    public void checkList() throws IOException {
        List<String> expectedList = List.of("https://something.com", "some-thing.html");

        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        MarkdownParse links = new MarkdownParse();
        assertEquals(expectedList, links.getLinks(content));
    }
}
