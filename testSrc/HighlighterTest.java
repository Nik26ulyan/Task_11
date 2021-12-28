import org.junit.Assert;
import org.junit.Test;
import ru.vsu.sc.uliyanov_n_s.Highlighter;
import ru.vsu.sc.uliyanov_n_s.Utils.ListUtils;

import java.io.FileNotFoundException;
import java.util.List;


public class HighlighterTest {
    Highlighter highlighter = new Highlighter();

    @Test
    public void testHighlightTextWithOneLine() throws FileNotFoundException {
        List<String> input = ListUtils.readListFromFile("testSrc/testWithOneLine.html");
        List<String> expected = ListUtils.readListFromFile("testSrc/answerForOneLine.txt");

        List<String> actual = highlighter.highlightText(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHighlightTextWithTwoLines() throws FileNotFoundException {
        List<String> input = ListUtils.readListFromFile("testSrc/testWithTwoLines.html");
        List<String> expected = ListUtils.readListFromFile("testSrc/answerForTwoLines.txt");

        List<String> actual = highlighter.highlightText(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHighlightTextWithThreeLines() throws FileNotFoundException {
        List<String> input = ListUtils.readListFromFile("testSrc/testWithThreeLines.html");
        List<String> expected = ListUtils.readListFromFile("testSrc/answerForThreeLines.txt");

        List<String> actual = highlighter.highlightText(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHighlightTextWithMoreLines() throws FileNotFoundException {
        List<String> input = ListUtils.readListFromFile("testSrc/testWithMoreLines.html");
        List<String> expected = ListUtils.readListFromFile("testSrc/answerForMoreLines.txt");

        List<String> actual = highlighter.highlightText(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHighlightTextWithLOngText() throws FileNotFoundException {
        List<String> input = ListUtils.readListFromFile("testSrc/testWithLongText.html");
        List<String> expected = ListUtils.readListFromFile("testSrc/answerForLongText.txt");

        List<String> actual = highlighter.highlightText(input);

        Assert.assertEquals(expected, actual);
    }
}