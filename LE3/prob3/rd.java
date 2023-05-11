class RD extends Duck implements Quackable 
{
    public void quack()
    {
        System.out.println("\ti can squeaks");
    }
     void display()
    {
        System.out.println(" red headed duck:");
        swim();
        quack();
    }
}