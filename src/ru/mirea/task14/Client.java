package ru.mirea.task14;

public class Client
{

    Chair chair;

    /**
     * Sets the current chair to the provided one.
     * @param chair The chair to switch to
     */
    public void setChair(Chair chair)
    {
        this.chair = chair;
    }

    /**
     * Sits on the current chair.
     */
    public void Sit() {
        chair.Sit();
    }
}
