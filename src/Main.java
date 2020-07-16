import java.util.*;

public class Main {
//Метод меняющий обекты в массиве местами
    public static Object[] arrayChanger(int elementOne, int elementTwo, Object[] array){
        Object buffer = new Object();

        buffer = array[elementOne];

        array[elementOne] = array[elementTwo];
        array[elementTwo] = buffer;

        return array;

    }
//Метод принимающий пустой лист и массив с которого нужно взять значения для листа
    public static ArrayList<Object> arrayToList(Object[] array,ArrayList arrayList){


        List<Object> arrayListFromArr = new ArrayList<Object>();

        Collections.addAll(arrayList,array);



        return arrayList;

    }
//Ещё один метод который мы подставляем в пустой лист не внося его в метод
    public static ArrayList<Object> arrayToList2(Object[] array){
        ArrayList<Object> arrListFromArr = new ArrayList<Object>();

        Collections.addAll(arrListFromArr,array);

        return arrListFromArr;

    }


    public static void main(String[] args) {
//Пустой лист для копирования в него массива
        ArrayList<Object> arrayListForArr = new ArrayList<Object>();


        Object[] arr = new Object[10];


        for (int i = 0; i < arr.length; i++) {
        arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr));

        arrayChanger(0,4,arr);

        System.out.println(Arrays.toString(arr));

        arrayToList(arr, arrayListForArr);

        System.out.println(arrayListForArr.toString());

        arrayListForArr = arrayToList2(arr);
//создаём яблоки
        Apple apple = new Apple(1.0f,"apple");
        Apple apple2 = new Apple(1.0f,"apple");
        Apple apple3 = new Apple(1.0f,"apple");
        Apple apple4 = new Apple(1.0f,"apple");
        Apple apple5 = new Apple(1.0f,"apple");
        Apple apple6 = new Apple(1.0f,"apple");
        Apple apple7 = new Apple(1.0f,"apple");

//создаём арельсины
        Orange orange = new Orange(1.5f,"orange");
        Orange orange2 = new Orange(1.5f,"orange");
        Orange orange3 = new Orange(1.5f,"orange");
        Orange orange4 = new Orange(1.5f,"orange");


//Создаём арай листы и закидываем нашы созданые фрукты
       ArrayList<Apple> apples = new ArrayList<>();

        ArrayList<Apple> apples2 = new ArrayList<>();

        apples2.add(apple5);
        apples2.add(apple6);
        apples2.add(apple7);


       apples.add(apple);
       apples.add(apple2);
       apples.add(apple3);


       ArrayList<Orange> oranges = new ArrayList<>();

       oranges.add(orange);
       oranges.add(orange2);
       oranges.add(orange3);
       oranges.add(orange4);


       Box<ArrayList<Apple>> appleBox = new Box<>(apples);

       Box<ArrayList<Orange>> orangeBox = new Box<>(oranges);

       Box<ArrayList<Apple>> appleBox2 = new Box<>(apples2);


    appleBox.getWeight();

        System.out.println( appleBox.compare(orangeBox));

        appleBox.fruitAdd(apple4);

        appleBox.moveFruits(appleBox2);

        appleBox2.getWeight();

        appleBox.getWeight();

        appleBox.moveFruits(orangeBox);





















    }
}
