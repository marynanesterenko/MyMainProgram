package com.java.class43_Dec20_Map;
/*
! The less you touch your code, the more stable it is"
NEXT TOPIC: REGEX
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

enum InputField{
    AMOUNT, FROM_ACCOUNT, TO_ACCOUNT, NOTE
}

public class EnumExample {
    public static void main(String[] args) {
        System.out.println("Opening a Bank website");
        Map<String, String> dataOnInputPage = enterDetailsAndClickContinue();
        Map<String, String> dataOnReviewPage = getDataOnReviewPage();

        Set<String> keys = dataOnInputPage.keySet();
        for (String key : keys){
            System.out.println(dataOnInputPage.get(key));
            System.out.println(dataOnReviewPage.get(key));
            System.out.println(dataOnInputPage.get(key).equals(dataOnReviewPage.get(key)));
        }
    }

    public static Map<String, String> getDataOnReviewPage() {
        String fromAcc = "456-234-457-343";
        String toAcc = "3453-234-897-343";
        int amount = 2000;
        String note = " Salary Payment";

        Map<String, String> dataOnReviewPage = new HashMap<>();

        dataOnReviewPage.put(InputField.FROM_ACCOUNT.toString(), fromAcc);
        dataOnReviewPage.put(InputField.TO_ACCOUNT.toString(), toAcc);
        dataOnReviewPage.put(InputField.AMOUNT.toString(), String.valueOf(amount));
        dataOnReviewPage.put(InputField.NOTE.toString(), note);

        return dataOnReviewPage;
    }

    public static Map<String, String> enterDetailsAndClickContinue(){
        String fromAcc = "456-234-457-343";
        String toAcc = "3453-234-897-343";
        int amount = 2000;
        String note = " Salary Payment";

        System.out.println(" Entering from account " + fromAcc);
        System.out.println(" Entering to account " + toAcc);
        System.out.println(" Entering amount " + amount);
        System.out.println(" Entering note" + note);
        System.out.println(" Continue Button");

        Map<String, String> dataOnInputPage = new HashMap<>();

        dataOnInputPage.put(InputField.FROM_ACCOUNT.toString(), fromAcc);
        dataOnInputPage.put(InputField.TO_ACCOUNT.toString(), toAcc);
        //dataOnInputPage.put(InputField.AMOUNT.toString(), amount.toString());
        dataOnInputPage.put(InputField.NOTE.toString(), note);
        return dataOnInputPage;
    }
}
