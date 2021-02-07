package ticoyk.sfgtddexample;

public class Dollar {
    int amount;

    Dollar(){ }
    Dollar(int amount){
        this.amount = amount;
    }

    public void times(int value){
        this.amount*= value;
    }

}
