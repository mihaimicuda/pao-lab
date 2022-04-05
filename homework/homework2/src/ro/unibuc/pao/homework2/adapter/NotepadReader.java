package ro.unibuc.pao.homework2.adapter;

public class NotepadReader implements FileReader {

    FileAdapter adapter;

    @Override
    public void read(String type, String path) {
        if (type.equalsIgnoreCase("docx") || type.equalsIgnoreCase("RTF")) {
            adapter = new FileAdapter(type);
            adapter.read(type, path);
        } else if (type.equalsIgnoreCase("bin")) {
            System.out.println("Reading binary file at:" + path);
        } else {
            System.out.println("Unsuported file type");
        }
    }

}
