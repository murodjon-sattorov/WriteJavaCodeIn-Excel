import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    //Blank workbook
    public static XSSFWorkbook workbook = new XSSFWorkbook();
    public static void main(String[] args) {

        firstCategories();
        secondCategories();
        thirdCategories();


        try {
            //Write the workbook in file system
            FileOutputStream out = new FileOutputStream(new File("notebooks.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("notebooks.xlsx written successfully on disk.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void firstCategories(){

        int count = 1;

        XSSFSheet sheet = workbook.createSheet("Class 1");

        //This data needs to be written (Object[])
        Map<String, Object[]> data = new TreeMap<>();
        data.put("0", new Object[]{"Brand", "Model Processor", "ozu", "Hard disc", "Fingerprint", "Number of Processor",
                "Wi-fi", "Bluetooth", "Type video card", "Video memory", "Screen size", "Material corps"});

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 2; j++) {
                for (int k = 1; k <= 1; k++) {
                    for (int l = 1; l <= 6; l++) {
                        for (int m = 1; m <= 1; m++) {
                            for (int n = 1; n <= 2; n++) {
                                for (int o = 1; o <= 2; o++) {
                                    for (int p = 1; p <= 2; p++) {
                                        for (int q = 1; q <= 1; q++) {
                                            for (int r = 1; r <= 1; r++) {
                                                for (int s = 1; s <= 4; s++) {
                                                    for (int t = 1; t <= 1; t++) {
                                                        data.put(String.valueOf(count), new Object[]{i, j, k, l, m, n, o, p, q, r, s, t});
                                                        count++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        //Iterate over data and write to sheet
        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset) {
            Row row = sheet.createRow(rownum++);
            Object[] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr) {
                Cell cell = row.createCell(cellnum++);
                if (obj instanceof String)
                    cell.setCellValue((String) obj);
                else if (obj instanceof Integer)
                    cell.setCellValue((Integer) obj);
            }
        }

    }

    private static void secondCategories(){

        int count = 1;

        XSSFSheet sheet = workbook.createSheet("Class 2");

        //This data needs to be written (Object[])
        Map<String, Object[]> data = new TreeMap<>();
        data.put("0", new Object[]{"Brand", "Model Processor", "ozu", "Hard disc", "Fingerprint", "Number of Processor",
                "Wi-fi", "Bluetooth", "Type video card", "Video memory", "Screen size", "Material corps"});

        for (int i = 1; i <= 5; i++) {
            for (int j = 3; j <= 4; j++) {
                for (int k = 2; k <= 3; k++) {
                    for (int l = 7; l <= 9; l++) {
                        for (int m = 1; m <= 2; m++) {
                            for (int n = 3; n <= 4; n++) {
                                for (int o = 2; o <= 2; o++) {
                                    for (int p = 2; p <= 2; p++) {
                                        for (int q = 2; q <= 2; q++) {
                                            for (int r = 2; r <= 4; r++) {
                                                for (int s = 5; s <= 6; s++) {
                                                    for (int t = 1; t <= 3; t++) {
                                                        data.put(String.valueOf(count), new Object[]{i, j, k, l, m, n, o, p, q, r, s, t});
                                                        count++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        //Iterate over data and write to sheet
        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset) {
            Row row = sheet.createRow(rownum++);
            Object[] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr) {
                Cell cell = row.createCell(cellnum++);
                if (obj instanceof String)
                    cell.setCellValue((String) obj);
                else if (obj instanceof Integer)
                    cell.setCellValue((Integer) obj);
            }
        }

    }

    private static void thirdCategories(){

        int count = 1;

        XSSFSheet sheet = workbook.createSheet("Class 3");

        //This data needs to be written (Object[])
        Map<String, Object[]> data = new TreeMap<>();
        data.put("0", new Object[]{"Brand", "Model Processor", "ozu", "Hard disc", "Fingerprint", "Number of Processor",
                "Wi-fi", "Bluetooth", "Type video card", "Video memory", "Screen size", "Material corps"});

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j <= 7; j++) {
                for (int k = 4; k <= 8; k++) {
                    for (int l = 10; l <= 14; l++) {
                        for (int m = 1; m <= 2; m++) {
                            for (int n = 5; n <= 6; n++) {
                                for (int o = 2; o <= 2; o++) {
                                    for (int p = 2; p <= 2; p++) {
                                        for (int q = 3; q <= 3; q++) {
                                            for (int r = 5; r <= 7; r++) {
                                                for (int s = 7; s <= 8; s++) {
                                                    for (int t = 2; t <= 3; t++) {
                                                        data.put(String.valueOf(count), new Object[]{i, j, k, l, m, n, o, p, q, r, s, t});
                                                        count++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        //Iterate over data and write to sheet
        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset) {
            Row row = sheet.createRow(rownum++);
            Object[] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr) {
                Cell cell = row.createCell(cellnum++);
                if (obj instanceof String)
                    cell.setCellValue((String) obj);
                else if (obj instanceof Integer)
                    cell.setCellValue((Integer) obj);
            }
        }

    }


}
