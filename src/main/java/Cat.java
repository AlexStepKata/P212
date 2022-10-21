import java.util.Objects;

public class Cat {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return massage.equals(cat.massage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(massage);
    }

    private String massage;

    public String getMessage() {
        return massage;
    }
    public void setMessage(String massage){
        this.massage = massage;
    }


}
