package kadai2;

public abstract class Character {
    int hp;
    String name;
    public abstract void attack(Matango hp);
    public void run(){
        System.out.println(this.name+"は逃げ出した");
    }
}
