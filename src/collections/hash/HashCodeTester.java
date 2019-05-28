package collections.hash;

import java.util.Objects;

/**
 * Created by anton on 6/22/2018 8:15 PM
 *  Node {
 *      int hash
 *      Key key
 *      Value value
 *      Node next
 *  }
 *
 *
 **/
public class HashCodeTester {
    public static void main(String[] args) {
        String name = "Sachin";
        Integer nameHashCode =name.hashCode();
        System.out.println(nameHashCode + " hash code of key "+nameHashCode.hashCode());

        Key key = new Key("sachin");

        Key index = new Key(key.hashCode()+"");


        System.out.println(key.hashCode() + " :: "+ index.hashCode()*(15));
    }
}

class Key
{
    String key;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key1 = (Key) o;
        return Objects.equals(key, key1.key);
    }

    @Override
    public int hashCode() {

        return Objects.hash(key);
    }

    Key(String key)
    {

        this.key = key;
    }

}
