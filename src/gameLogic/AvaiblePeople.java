package gameLogic;

import gameLogic.staff.Director;
import gameLogic.staff.ScriptWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import movieMaker.MovieMaker.Constants;
import utils.FileHelper;
import utils.RandomHelper;

public class AvaiblePeople {

  private static List<Director> directorList = null;
  private static List<ScriptWriter> scriptWriterList = null;

  public static List<Director> directorList() {
    if (directorList == null) {
      directorList = new ArrayList<>();
      List<String> allNames = FileHelper.readTextFile(Constants.DIRECTOR_LIST_FILE_PATH);
      List<String> selectedNames = RandomHelper
              .selectQItemsFromList(allNames, Constants.NUMBER_OF_DIRECTORS);
      for (String name : selectedNames) {
        Director director = Director.createNewDirector(name);
        directorList.add(director);
      }
    }
    return directorList;
  }

  public static List<ScriptWriter> scriptWriterList() {
    if (scriptWriterList == null) {
      scriptWriterList = new LinkedList<>();
      List<String> allNames = FileHelper.readTextFile(Constants.WRITER_LIST_FILE_PATH);
      List<String> selectedNames = RandomHelper
              .selectQItemsFromList(allNames, Constants.NUMBER_OF_WRITERS);
      for (String name : selectedNames) {
        ScriptWriter writer = ScriptWriter.createNewScriptWriter(name);
        scriptWriterList.add(writer);
      }
    }
    return scriptWriterList;
  }

  /* No instanciate this class */
  private AvaiblePeople() {
    throw new AssertionError();
  }

}
