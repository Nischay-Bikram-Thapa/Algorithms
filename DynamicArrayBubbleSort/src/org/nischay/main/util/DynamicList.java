package org.nischay.main.util;

public class DynamicList {

    private int[] number = new int[0];
    private int counter = -1;

    public void add(int n) {
        int count = size();
        if (count == 0) {
            number = new int[1];
            number[0] = n;
        } else {
            int[] nextNumber = new int[count + 1];
            for (int i = 0; i < size(); i++) {
                nextNumber[i] = number[i];
            }
            nextNumber[count] = n;
            number = nextNumber;
        }
    }

    public int getIndex(int index) {
        return number[index];
    }

    public int[] getAll() {
        return number;
    }

    public boolean next() {
        counter++;
        if (counter == size()) {
            counter = size() - 1;
            return false;
        }
        return true;
    }

    public void bubbleSort() {
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] > number[j]) {
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
    }

    public int getValue() {
        return number[counter];
    }

    public int size() {
        return number.length;
    }
}
