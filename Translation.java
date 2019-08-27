public class Translation
{
    public String isReverse(String original, String reversed)
    {
        char[] reverse = new char[original.length()];

        for (int i = 0; i < original.length(); i++)
        {
            reverse[i] = original.charAt(original.length() - (1 + i));
        }

        if(String.valueOf(reverse).equals(reversed))
        {
            return "YES";
        }

        return "NO";
    }
}
