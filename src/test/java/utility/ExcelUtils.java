package utility;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.nio.file.NoSuchFileException;

//import org.apache.poi.ss.usermodel.Sheet;

public class ExcelUtils {
    //private static XSSFSheet ExcelWSheet;
    public static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;

    public static void setExcelFile(String Path,String SheetName) throws Exception {

            try {
                //String sPath = "E://Sanath//Sellenium sw//projects//DataEngine.xlsx";

                FileInputStream ExcelFile = new FileInputStream(Path);
                ExcelWBook = new XSSFWorkbook(ExcelFile);
                ExcelWSheet = ExcelWBook.getSheet(SheetName);

               // Iterator<Row> itRow = ExcelWSheet.iterator();

            }catch (NoSuchFileException ex){
                System.out.println("No file");
            }
    }

    public static String getCellData(int RowNum, int ColNum) throws Exception{
        Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
        String CellData = Cell.getStringCellValue();

        System.out.print(CellData);
        return CellData;

       //System.out.print(CellData);


    }

}