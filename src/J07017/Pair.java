package J07017;


/**
 * Create on 05/10/2024 07:11 by jayce
 */

public class Pair<K, V> {
    private K Key;
    private V Value;

    public Pair(K Key, V Value) {
        this.Key = Key;
        this.Value = Value;
    }

    public K getKey() {
        return Key;
    }
    public void setKey(K key) {
        Key = key;
    }

    public V getValue() {
        return Value;
    }
    public void setValue(V value) {
        Value = value;
    }

    public boolean equals(Pair<K, V> pair) {
        return Key.equals(pair.Key) && Value.equals(pair.Value);
    }

    public int hashCode() {
        return Key.hashCode() + Value.hashCode();
    }

    public String toString() {
        return Key.toString() + " " + Value;
    }

    public boolean checkPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public boolean isPrime() {
        return checkPrime(this.Key.hashCode()) && checkPrime(this.Value.hashCode());
    }

}
