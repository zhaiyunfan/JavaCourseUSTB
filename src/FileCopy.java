import java.io.*;

public class FileCopy
{
    public static void main(String[] args)
    {
        String sourceFileName = args[0];
        File source = new File(sourceFileName);

        String targetFileName = args[1];
        File target = new File(targetFileName);

        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try
        {
            fileReader = new FileReader(source);
            fileWriter = new FileWriter(target);

            char lastCopy = 'a';
            char[] c = new char[1];
            int temp = 0;

            while ((temp = fileReader.read(c)) != -1)
            {
                //输出到文件
                if (c[0] == lastCopy && lastCopy == ' ')
                {
                    continue;
                }
                if (c[0] == '\t' && lastCopy == ' ')
                {
                    continue;
                }
                if (c[0] == '\t')
                {
                    c[0] = ' ';
                }
                lastCopy = c[0];
                fileWriter.write(c, 0, temp);
                System.out.print(c);
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            //关闭流
            try
            {
                if (fileReader != null)
                {
                    fileReader.close();
                }
                if (fileWriter != null)
                {
                    fileWriter.close();
                }
            } catch (IOException e)
            {
                e.printStackTrace();
            }


        }
    }
}
