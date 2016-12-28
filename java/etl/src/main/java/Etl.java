import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Etl {
  public Map<String, Integer> transform(Map<Integer, List<String>> old) {

    Map<String, Integer> modified = new HashMap<>();

    for (Entry<Integer, List<String>> entry : old.entrySet()) {
      addToModifiedMap(modified, entry.getKey(), entry.getValue());
    }

    return modified;
  }

  private void addToModifiedMap(Map<String, Integer> modified, Integer point, List<String> stringList) {

    for (int i = 0; i < stringList.size(); i++) {
      modified.put(stringList.get(i).toLowerCase(), point);
    }
  }
}
