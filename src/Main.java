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

    }
}
