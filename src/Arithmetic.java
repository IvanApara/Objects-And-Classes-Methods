public class Arithmetic {

    private int a;
    private int b;

    public  Arithmetic(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int sum(){
        return a + b;
    }

    public int multyply(){
        return a * b;
    }

    public int max(){
        return a > b ? a : b;
    }

    public int min(){
        return a<b ? a : b;
    }

    public void print(){
        System.out.println("Сумма чисел: " + sum());
        System.out.println("Произведение чисел: " + multyply());
        System.out.println("Максимальное значение: " + max());
        System.out.println("Минимальное значение: " + min());
    }



}