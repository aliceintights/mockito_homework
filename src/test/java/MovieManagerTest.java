import org.example.MovieManager;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class MovieManagerTest {
    MovieManager manager = new MovieManager();

    @Test
    public void shouldReturnTitles() {

        manager.add("title1");
        manager.add("title2");
        manager.add("title3");
        manager.add("title4");
        manager.add("title5");
        manager.add("title6");
        manager.add("title7");
        manager.add("title8");

        String[] expected = {"title1", "title2", "title3", "title4", "title5", "title6", "title7", "title8"};
        String[] actual = manager.findAll();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnReverseTitles() {

        manager.add("title1");
        manager.add("title3");
        manager.add("title6");
        manager.add("title8");

        String[] expected = {"title8", "title6", "title3", "title1"};
        String[] actual = manager.findLast();

        Assert.assertArrayEquals(expected, actual);
    }
}