package isp.lab6.exercise2;

import java.util.Objects;

public class Word {
    private String value;

    public Word(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }
    public boolean equals(Object o){
        if(o == null) return false;
        if(!(o instanceof Word)) return false;
        Word other = (Word) o;
        return this.value.equals(other.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.value);
    }

    @Override
    public String toString() {
        return "Word{" +
                "value='" + value + '\'' +
                '}';
    }
}
