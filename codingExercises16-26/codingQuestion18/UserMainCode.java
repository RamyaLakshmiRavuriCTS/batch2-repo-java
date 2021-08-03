public class UserMainCode
{

    //returns 1 if valid PAN number otherwise return 2 2
    public static int validatePAN(String pan)
    {
        boolean isValid=pan.matches("^(?=.*[A-Z]).{3}(?=.*[0-9]).{4}(?=.*[A-Z]).$");

        if(isValid)
        {
            return 1;
        }

        return 2;
    }

}