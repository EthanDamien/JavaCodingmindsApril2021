package animaltest;

public class Animal {
    private String name;
    private String sound;
    private int height = 1;
    private double weight = 1.5;

    public Animal(String fullname, String sound){
        this.name = fullname;
        this.sound = sound;
    }

    public void getName(){
        System.out.println(name);
    }

    public String getSound(){
        return sound;
    }

    public double getheightplusweight(){
        return height + weight;
    }


}
