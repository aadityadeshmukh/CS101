//Program to demonstrate the efficient way of reading and writing a file
import java.io.*;
class FileIO
{
    String inFile, outFile,line; 
    BufferedReader source; //Efficient way to read a file
    PrintWriter destination; //Efficient way to write a file
    FileIO(String ipFile, String opFile)
    {
        inFile = ipFile;
        outFile = opFile;
    }
    public boolean OpenFiles()
    {
         System.out.println("Opening Files...");
        //Open files for reading or writing
        try
        {
            source = new BufferedReader(new FileReader(inFile));
        }
        catch (IOException iox)
        { 
            System.out.println("Input File could not be accessed!");
            return false;
        }
        
        try
        {
            destination = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));
        }
        catch (IOException iox)
        {
            System.out.println("Output File could not be accessed!");
            return false;
        }
        return true;
    }
    public void ReaderProg()
    {
         System.out.println("Reading and writing data...");
        //Reading the inp file and passing the data to output file
        try
        {
            while((line = source.readLine())!= null) 
                destination.println(line);
        }
        catch (IOException iox)
        {
            System.out.println("Files could not be accessed!");
        }
    }
    public void CloseFiles()
    {
         System.out.println("closing files...");
        //Close files
        try
        {
            source.close();
        }
        catch (IOException iox)
        {
            System.out.println("Problem closing!");
        }
        
        destination.close(); //output is more reliable than input
    }
    
    public static void main(String [] args)
    {
        System.out.println("Commence...");
        if(args.length == 3 && (args[1].toUpperCase().equals("TO")))
        {
            System.out.println("Commence...");
            FileIO writer = new FileIO(args[0],args[2]);
            if(writer.OpenFiles())
            {
                writer.ReaderProg();
                writer.CloseFiles();
            }
            System.out.println("File IO complete");
        }
        
    }
}