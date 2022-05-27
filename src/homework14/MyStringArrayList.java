package homework14;

public class MyStringArrayList {
    private  final int SIZE = 16;
    private  Object[] array = new Object[SIZE];
    private  int index = 0;

    public void add(int index, String string) {
        final int s;
        Object[] elementData;
        if ((s = this.index) == (elementData = this.array).length)
            resize(array.length+10);
        System.arraycopy(elementData, index,
                elementData, index + 1,
                s - index);
        elementData[index] = string;
        this.index++;
    }
    public void add(String item) {
        if (index == array.length - 1)
            resize(array.length*2);
        array[index++] = item;
    }
    public void set(int index, String item) {
        array[index] = item;
    }
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, index);
        array = newArray;
    }
    public String get(int index) {
        return (String) array[index];
    }
    public  int size() {
        return index;
    }
    public void remove(int index) {
        for (int i = index; i < this.index; i++)
            array[i] = array[i + 1];
        array[this.index] = null;
        this.index--;
    }

    public String toString() {
        String res = "Содержание списка: ";
        for (int i = 0; i < size(); i++) {
            res += " " + get(i) + ';' ;
        }
        return res;
    }

}
