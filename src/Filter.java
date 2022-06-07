import java.util.ArrayList;
import java.util.List;

public class Filter {

    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        int num = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) > treshold) {
                result.add(source.get(i));
                logger.log("Элемент " + source.get(i) + " проходит");
                num++;
            } else {
                logger.log("Элемент " + source.get(i) + " не проходит");
            }
        }
        logger.log("Прошло фильтр " + num + " элемента из " + source.size());
        return result;
    }
}
