package ru.mirea.task19;

/// Create a class Human with the following fields:
/// - Head
/// - Torso
/// - Hands
/// - Legs
/// - Name
/// - Age
public class Human
{
    Head head;
    Torso torso;
    Hand leftHand;
    Hand rightHand;
    Leg leftLeg;
    Leg rightLeg;
    String name;
    int age;

    public Head getHead()
    {
        return head;
    }

    public Torso getTorso()
    {
        return torso;
    }

    public Hand getLeftHand()
    {
        return leftHand;
    }

    public Hand getRightHand()
    {
        return rightHand;
    }

    public Leg getLeftLeg()
    {
        return leftLeg;
    }

    public Leg getRightLeg()
    {
        return rightLeg;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Human(String name, int age)
    {
        this.name = name;
        this.age = age;

        // create a new head with random condition between 0 and 100
        head = new Head((float) Math.random() * 100);
        // create a new torso with random condition between 0 and 100
        torso = new Torso((float) Math.random() * 100);
        // create a new left hand with random condition between 0 and 100
        leftHand = new Hand((float) Math.random() * 100);
        // create a new right hand with random condition between 0 and 100
        rightHand = new Hand((float) Math.random() * 100);
        // create a new left leg with random condition between 0 and 100
        leftLeg = new Leg((float) Math.random() * 100);
        // create a new right leg with random condition between 0 and 100
        rightLeg = new Leg((float) Math.random() * 100);
    }

    /// Print out the condition of each body part
    public void printCondition()
    {
        head.printCondition();
        torso.printCondition();
        leftHand.printCondition();
        rightHand.printCondition();
        leftLeg.printCondition();
        rightLeg.printCondition();
    }
}
