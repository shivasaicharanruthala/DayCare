package neu.edu.csye6200.interfaces;

import java.util.List;


public interface DataManagement<T> {
    public List<T> getDataList();

    public List<T> getDataList(String key);

    public List<T> getDataList(int key);

    public List<T> getDataList(int min, int max);

    public List<T> getDataList(String min, String max);

    public void registerOneObject(T t);

    public void deleteOneObject(T t);

    public void updateOneObject(T t);

    public void rewriteData(List<T> list);
}
    
