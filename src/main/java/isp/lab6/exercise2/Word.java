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

    /**
     * this method overwrite the equals method for compare tow instances from the point of value
     * @param o the object to compare
     * @return false if is not the same or true if it is the same value for both objects
     */
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
