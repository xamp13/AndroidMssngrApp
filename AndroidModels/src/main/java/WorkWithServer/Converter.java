package WorkWithServer;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Converter {
    public Bitmap ConvertByteToImage(byte[] binaryImage)
    {
        Bitmap image =
                BitmapFactory.decodeByteArray(binaryImage,0,binaryImage.length);
        return image;
    }
}
