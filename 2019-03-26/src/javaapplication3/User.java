package javaapplication3;

import java.util.UUID;

public class User
{
    private UUID cardId;
    private String name;
    private int accessLevel;

    public User(UUID cardId, String name, int accessLevel)
    {
        this.cardId = cardId;
        this.name = name;
        this.accessLevel = accessLevel;
    }

    public UUID getCardId()
    {
        return cardId;
    }

    public void setCardId(UUID cardId)
    {
        this.cardId = cardId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAccessLevel()
    {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel)
    {
        this.accessLevel = accessLevel;
    }
    
    @Override
    public String toString()
    {
        return "User{" + "cardId=" + cardId + ", name=" + name + ", accessLevel=" + accessLevel + '}';
    }
}
