package six.patterns;

//Josh Bloch Effective Java
// thread safe , reflection, cloning, serializujete
public enum SingletonEnum {
    INSTANCE;

    public String getDescription(){
        return "I am singleton...created through enum";
    }
}
