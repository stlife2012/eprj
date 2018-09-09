package stlife.dev.boot.hospital.dcm.facade;

/**
 * @Classname DicomUtil
 * @Description TODO
 * @Author Stlife
 * @Date 2018/9/9 10:37
 * @Version 1.0
 **/

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

import org.dcm4che3.data.Attributes;
import org.dcm4che3.data.BulkData;
import org.dcm4che3.data.Fragments;
import org.dcm4che3.data.Tag;
import org.dcm4che3.data.UID;
import org.dcm4che3.data.VR;
import org.dcm4che3.imageio.codec.Compressor;
import org.dcm4che3.imageio.codec.Decompressor;
import org.dcm4che3.io.DicomEncodingOptions;
import org.dcm4che3.io.DicomInputStream;
import org.dcm4che3.io.DicomInputStream.IncludeBulkData;
import org.dcm4che3.io.DicomOutputStream;
import org.dcm4che3.util.SafeClose;
import org.dcm4che3.util.StreamUtils;

public class DicomUtil {
    private static String fp = "G:\\02_data\\dicom\\test\\collect.dcm";

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
		getPixelData();
//		modify();
//		cudDicm(new File(fp),new File("out/cut"));
//		getDicm(new File(fp),new File("out/4.dcm"),4);
//		unPixelData();
//		long strtime = System.currentTimeMillis();
//        dicom2Img();
//		long endtime = System.currentTimeMillis();
//		System.out.println(endtime - strtime);
    }

    public static void getPixelData() {
        Attributes fmi;
        Attributes dataset;
        DicomInputStream dis = null;
        try {
            dis = new DicomInputStream(new File(fp));
            fmi = dis.readFileMetaInformation();
            dis.setIncludeBulkData(DicomInputStream.IncludeBulkData.URI);
            dataset = dis.readDataset(-1, -1);

            Object pixeldata = dataset.getValue(Tag.PixelData);
            if (pixeldata instanceof Fragments) {
                Integer size = ((Fragments) pixeldata).size();
                for(int idx = 1; idx < size; idx ++) {
                    Object obj = ((Fragments) pixeldata).get(idx);
                    BulkData imgdata = (BulkData) obj;
                    InputStream in = imgdata.openStream();
                    byte[] fdata = new byte[imgdata.length()];
                    StreamUtils.readFully(in, fdata, 0, fdata.length);
//            		String eStr = Base64Util.encode(fdata);
//            		FileOutputStream out = new FileOutputStream(new File("out/dcm.data"));
//            		out.write(fdata);
//            		out.close();

                    System.out.print((imgdata.length() / 2) + "idx=>" + idx);
                    System.out.println(imgdata);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ;
        }finally {
            SafeClose.close(dis);
        }
    }
}
