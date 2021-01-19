package ReceiveModels;

public class FileModel {
    private String Extension ;

    public String getExtension() {
        return Extension;
    }

    public void setExtension(String extension) {
        Extension = extension;
    }

    private String FileName ;

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String fileName) {
        FileName = fileName;
    }

    private byte[] BinaryForm ;

    public byte[] getBinaryForm() {
        return BinaryForm;
    }

    public void setBinaryForm(byte[] binaryForm) {
        BinaryForm = binaryForm;
    }
}

