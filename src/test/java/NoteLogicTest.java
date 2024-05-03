import example.note.NoteLogic;
import org.junit.Assert;
import org.junit.Test;

public class NoteLogicTest {
  /**
   * Тест команд всех NoteLogic
   */
  @Test
  public void logicTest() {
    NoteLogic note = new NoteLogic();

    Assert.assertEquals("Note added!", note.handleMessage("/add 123qwe"));
    Assert.assertEquals("Your notes: 123qwe", note.handleMessage("/notes"));

    Assert.assertEquals("Note edited!", note.handleMessage("/edit 123qwe 444rrr"));
    Assert.assertEquals("Your notes: 444rrr", note.handleMessage("/notes"));

    Assert.assertEquals("Note deleted!", note.handleMessage("/del 444rrr"));
    Assert.assertEquals("Your notes:", note.handleMessage("/notes"));

    Assert.assertEquals("Unknown command", note.handleMessage("/bla-bla"));

  }

}
