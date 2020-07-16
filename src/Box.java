import java.util.ArrayList;

public class Box <T> {

    public T obj;

    public Box(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    //Метод вычисляющий вес коробки
    public void getWeight(){
    this.obj = obj;
        ArrayList<Object>  fruitBoxList = (ArrayList<Object>) obj;

        float fruitsWeight = 0.0f;

        for (int i = 0; i <fruitBoxList.size() ; i++) {

            Fruit fruit = (Fruit) fruitBoxList.get(i);

            fruitsWeight += fruit.getFruitWeight();
            }
        System.out.println("Fruits weight " + fruitsWeight);
        }
//Метод сравнивающий коробки
        public boolean compare(Box box){
        this.obj = obj;

        ArrayList<Object> fruitBox1 = (ArrayList<Object>) obj;
        ArrayList<Object> fruitBox2 = (ArrayList<Object>) box.getObj();

        if(fruitBox1.size() == fruitBox2.size()){
            return true;
        }
        return false;
        }
//Метод добавления фрукта в коробку
        public void fruitAdd(Fruit fruit){
        this.obj = obj;

        ArrayList<Object> fruitBox1 = (ArrayList<Object>) obj;

        Fruit fruitType = (Fruit) fruitBox1.get(0);

        if(fruitType.getType() == fruit.getType()){

            fruitBox1.add(fruit);
        }else {
            System.out.println("Wrong fruit type");
        }
    }
//метод пересыпающий фрукты в коробку
        public void moveFruits(Box box){
        this.obj = obj;

        ArrayList<Object> fruitBox1 = (ArrayList<Object>) obj;

        ArrayList<Object> fruitBox2 = (ArrayList<Object>) box.getObj();

        Fruit typeBox1 = (Fruit) fruitBox1.get(0);
        Fruit typeBox2 = (Fruit) fruitBox2.get(0);

        if(typeBox1.getType() == typeBox2.getType()){
            fruitBox1.addAll(fruitBox2);
            fruitBox2.clear();
        }
            System.out.println("Wrong fruit box type");
        }
    }





