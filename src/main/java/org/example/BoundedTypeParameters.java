package org.example;

// T faqat Number sinfi va uning vorislari (Integer, Double, Long va h.k.) bo'la oladi
public class BoundedTypeParameters<T extends Number> {
    private T number;

    public double square() {
        return number.doubleValue() * number.doubleValue();
    }

    public BoundedTypeParameters(T number) {
        this.number = number;
    }

    public static void main(String[] args) {
        // Integer
        BoundedTypeParameters<Integer> cal = new BoundedTypeParameters<>(5);
        System.out.println(cal.square());

        // Double
        BoundedTypeParameters<Double> cal2 = new BoundedTypeParameters<>(2.3);
        System.out.println(cal2.square());
    }
}
