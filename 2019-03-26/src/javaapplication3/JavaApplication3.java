package javaapplication3;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.UUID;

public class JavaApplication3
{
    public static final UUID MY_UUID = UUID.fromString("00000000-1111-2222-3333-444444444444");
    
    public static void main(String[] args)
    {
        Map<UUID, User> users = new HashMap<>();
        
        users.put(MY_UUID, new User(MY_UUID, "Nick", 5));
        
        for(int i = 0; i < 5; i++)
        {
            UUID uuid = UUID.randomUUID();
            users.put(uuid, new User(uuid, "Some Random Person", 1));
        }
        
        System.out.println(users.values());
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter card ID: ");
        String input = scanner.next();
        UUID inputId = UUID.fromString(input);
        
        if(!users.containsKey(inputId))
        {
            System.out.println("Unknown card");
            return;
        }
        
        User selectedUser = users.get(inputId);
        System.out.println(selectedUser);
        
        if(selectedUser.getAccessLevel() > 3)
        {
            System.out.println("Grant access");
        }
        else
        {
            System.out.println("Deny access");
        }
    }
}
