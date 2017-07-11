package iostring;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.*;
public class iobasic {
public static void main(String args[])
{
	try{
	FileInputStream f=new FileInputStream("E:\\vikram.jpg");
	FileOutputStream fr=new FileOutputStream("E:\\abc\\vik.jpg");
	int i;
	while((i=f.read())!=-1)
	{
		fr.write((byte)i);
	}
	fr.flush();
	}
catch(Exception e)
	{
	
	}

}

	
}
