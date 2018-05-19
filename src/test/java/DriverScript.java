/**
 * Created by Sanath on 5/8/2018.
 */
/*package executionEngine;

import config.ActionKeywords;
import utility.ExcelUtils;

public class DriverScript {

    public static void main(String[] args) throws Exception {

        String sPath = "E://Sanath//Sellenium sw//projects//DataEngine.xlsx";


        ExcelUtils.setExcelFile(sPath, "TestData");

        for (int iRow=1;iRow<=9;iRow++){
            //Storing the value of excel cell in sActionKeyword string variable
            String sActionKeyword = ExcelUtils.getCellData(iRow, 3);

            //Comparing the value of Excel cell with all the project keywords
            if(sActionKeyword.equals("openBrowser")){
                //This will execute if the excel cell value is 'openBrowser'
                //Action Keyword is called here to perform action
                ActionKeywords.openBrowser();}
            else if(sActionKeyword.equals("navigate")){
                ActionKeywords.navigate();}
            else if(sActionKeyword.equals("click_MyAccount")){
                ActionKeywords.click_MyAccount();}
            else if(sActionKeyword.equals("input_Username")){
                ActionKeywords.input_Username();}
            else if(sActionKeyword.equals("input_Password")){
                ActionKeywords.input_Password();}
            else if(sActionKeyword.equals("click_Login")){
                ActionKeywords.click_Login();}
            else if(sActionKeyword.equals("waitFor")){
                ActionKeywords.waitFor();}
            else if(sActionKeyword.equals("click_Logout")){
                ActionKeywords.click_Logout();}
            else if(sActionKeyword.equals("closeBrowser")){
                ActionKeywords.closeBrowser();}

        }
    }
}*/
