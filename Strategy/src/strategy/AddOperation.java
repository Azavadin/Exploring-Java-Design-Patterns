package strategy;

class AddOperation implements Strategy{
    public int doOperation(int a, int b){
        return a+b;
    }
}