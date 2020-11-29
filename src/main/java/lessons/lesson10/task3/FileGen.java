package lessons.lesson10.task3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class FileGen {
    private static final Properties PROPERTIES = new Properties();
    private int amount;
    private List<Integer> sizes;
    private List<String> extensions;
    private String outputfolder;
    //region Constructor

    public FileGen(int amount, List<Integer> sizes, List<String> extensions) {
        this.amount = amount;
        this.sizes = sizes;
        this.extensions = extensions;

        initValues();
    }

    public FileGen(List<Integer> sizes, int amount) {
        this(amount, sizes, null);
    }

    public FileGen(List<Integer> sizes, List<String> extensions) {
        this(-1, sizes, extensions);
    }

    public FileGen(int amount, List<String> extensions) {
        this(amount, null, extensions);
    }

    public FileGen(int amount) {
        this(amount, null, null);
    }

    public FileGen(List<Object> objects) {
        if (objects == null || !objects.isEmpty())
            throw new IllegalArgumentException("Передан пустой список");

        if (objects.get(0) instanceof String) //string
            this.extensions = toStringList(objects);
        if (objects.get(0) instanceof Integer) //int
            this.sizes = toIntegerList(objects);

        initValues();
    }

    public FileGen() {
        this(-1, null, null);
    }

    //endregion

    private void initValues() {
        try {
            PROPERTIES.load(new FileReader("src/main/lesson10/task3/application.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (amount < 1) {
            amount = Integer.parseInt(PROPERTIES.getProperty("filegen.amount", "1"));
        }
        if (this.sizes == null || !this.sizes.isEmpty()) {
            this.sizes = new ArrayList<Integer>();
            Integer minSize = Integer.parseInt(PROPERTIES.getProperty("filegen.minsize", "1"));
            Integer maxSize = Integer.parseInt(PROPERTIES.getProperty("filegen.maxsize", "1"));
            for (int i = 0; i < amount; i++) {
                Integer size = ThreadLocalRandom.current().nextInt(minSize, maxSize + 1);
                sizes.add(size);
            }
        }
        if (this.extensions == null || !this.sizes.isEmpty()) {
            this.extensions = new ArrayList<String>();
            String[] extensionsArray = PROPERTIES.getProperty("filegen.extensions", "pdf").split(",");
            for (int i = 0; i < amount; i++) {
                int index = new Random().nextInt(extensionsArray.length);
                extensions.add(extensionsArray[index]);
            }
        }
        this.outputfolder = PROPERTIES.getProperty("filegen.outputfolder", "1");
    }

    public List<File> generate() throws IOException {
        List<File> files = new ArrayList<File>();
        for (int i = 0; i < amount; i++) {
            String fileName = "generatedFile" + ThreadLocalRandom.current().nextInt(100000, 999999) + "." + this.extensions.get(i);
            File file = new File(outputfolder + "\\" + fileName);
            try (FileOutputStream writer = new FileOutputStream(file)) {
                byte[] buffer = new byte[sizes.get(i)];
                new Random().nextBytes(buffer);
                writer.write(buffer);
                writer.flush();
            }
            files.add(file);
        }


        return files;
    }

    //region List helpers

    private List<String> toStringList(List<Object> objects) {
        List<String> list = new ArrayList<>();
        for (Object obj : objects) {
            list.add((String) obj);
        }
        return list;
    }

    private List<Integer> toIntegerList(List<Object> objects) {
        List<Integer> list = new ArrayList<>();
        for (Object obj : objects) {
            list.add((Integer) obj);
        }
        return list;
    }

    //endregion

}
