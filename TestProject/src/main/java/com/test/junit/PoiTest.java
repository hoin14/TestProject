package com.test.junit;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import com.documents4j.api.DocumentType;
import com.documents4j.api.IConverter;
import com.documents4j.job.LocalConverter;


public class PoiTest {

	public static void main(String[] args) throws IOException {
		
		// documents4j API
		Path temp = Paths.get("C:\\Users\\hoin\\Desktop\\gari");
		Files.createDirectories(temp);
		IConverter converter = LocalConverter.builder().baseFolder(temp.toFile())
			.workerPool(20, 25, 2, TimeUnit.SECONDS).processTimeout(5, TimeUnit.SECONDS).build();
		try {
			System.out.println("start");

			Future<Boolean> conversion = converter
				.convert(new File("C:\\Users\\hoin\\Desktop\\gari\\abc.xlsx")).as(DocumentType.MS_EXCEL)
				.to(new File("C:\\Users\\hoin\\Desktop\\gari\\abc.pdf")).as(DocumentType.PDF)
				.schedule();

			System.out.println("end: " + conversion.get());
		} catch (InterruptedException | ExecutionException e) {
			throw new IOException(e);
		} finally {
			converter.shutDown();
		}
        
		
		//apache poi
//		String inputFile = "C:\\Users\\hoin\\Desktop\\gari\\abc.xlsx";
//		String outputFile = "C:\\Users\\hoin\\Desktop\\gari\\abc.pdf";
//		
//		FileInputStream in;
//		try {
//			in = new FileInputStream(inputFile);
//			XWPFDocument document = new XWPFDocument(in);
//
//			File outFile = new File(outputFile);
//			OutputStream out = new FileOutputStream(outFile);
//			PdfOptions options = null;
//			PdfConverter.getInstance().convert(document, out, options);
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		
		/*aspose로할때*/
//		try {
//			Workbook wb = new Workbook("C:\\Users\\hoin\\Desktop\\gari\\abc.xlsx");
//			wb.save("C:\\Users\\hoin\\Desktop\\gari\\abc.pdf", SaveFormat.PDF);
//		
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		FileOutputStream outS = null;
//		InputStream Ins = null;
//		
//		try {
//			
//			Ins = new FileInputStream("C:\\Users\\hoin\\Desktop\\gari\\abc.xlsx");
//			XSSFWorkbook wb = new XSSFWorkbook(Ins);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		Workbook wb = new Workbook();
//		wb.loadFromFile("C:\\Users\\hoin\\Desktop\\gari\\abc.xlsx");
//
//		Worksheet sheet = wb.getWorksheets().get(1);
//		sheet.saveToPdf("abc.pdf");
		
		// PDF로 저장함
//		wb.saveToFile("a.pdf", FileFormat.PDF);

		// PdfDocument doc = new PdfDocument();
		//
		// doc.loadFromFile("c:/Users/hoin/Desktop/gari/반환신청서.pdf");
		// doc.saveToFile("C:/Users/hoin/Desktop/gari/a.doc", FileFormat.DOC);
		//
		// doc.close();

	}

}
