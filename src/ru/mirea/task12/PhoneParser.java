package ru.mirea.task12;

public class PhoneParser
{

    public static String GetFormattedPhone(String phone) {
        if (phone.startsWith("+"))
        {
            String code = phone.substring(1, phone.length() - 10);
            return "+" + code + phone.substring(1 + code.length(), 1 + code.length() + 3) + "-" + phone.substring(1 + code.length() + 3, 1 + code.length() + 6) + "-" + phone.substring(1 + code.length() + 6, 1 + code.length() + 10);
        }
        else if (phone.startsWith("8"))
        {
            return "+7" + phone.substring(1, 4) + "-" + phone.substring(4, 7) + "-" + phone.substring(7, 11);
        }

        return "";
    }
}


