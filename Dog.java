package factoryPattern;

public class Dog implements Pet{
    private String breed = "Golden retriever";

    @Override
    public String makeSound(){
        return "Woof!";
    }
    @Override
    public String play(){
        return "Dog is fetching the ball!";
    }
    public String getBreed() {
        return breed;
    }
}
