package ticoyk.sfgtddexample;

public class Dollar {
    public final int amount;

    Dollar(int amount){
        this.amount = amount;
    }

    public Dollar times(int value){
        return new Dollar(this.amount * value);
    }

}
