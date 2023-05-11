class LD extends Duck implements Flyable,Quackable
{
    public void fly()
    {
        System.out.println("\ti can fly");
    }
    public void quack()
    {
        System.out.println("\ti can quack");
    }
    void display()
    {
        System.out.println(" lake duck:");
        swim();
        fly();
        quack();
    }
}