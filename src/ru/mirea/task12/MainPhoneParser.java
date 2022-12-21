package ru.mirea.task12;


public class MainPhoneParser
{

    public static void main(String[] args)
    {
        // write your code here

        String[] raw_phones = new String[]{
                "+79161234567",
                "89161234567",
                "+104289652211",
                "88005553535",
                "+1031234567890",
        };

        for (String phone : raw_phones)
        {
            System.out.println(PhoneParser.GetFormattedPhone(phone));
        }
    }

}

