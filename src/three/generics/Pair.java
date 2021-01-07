package three.generics;

public interface Pair<K extends Number,V>{
    public K getKey();
    public V getValue();
}
