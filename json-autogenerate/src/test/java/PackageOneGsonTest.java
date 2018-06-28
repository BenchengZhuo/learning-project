import com.bencheng.learn.learn.json.DMProtocolPackageOne;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;

/**
 * Created by Bencheng on 2018/5/7.
 */
public class PackageOneGsonTest {


    @Test
    public  void test() {
        String json = "{\n" +
                "\"MOS\": [\n" +
                "{\n" +
                "\"DDF\": \"http://www.vendor.com/DDF/devinfo1.0.ddf\",\n" +
                "\"MOID\": \"urn:oma:mo:oma-dm-devinfo:1.0\",\n" +
                "\"MIID\": [\"miid1\"]\n" +
                "},\n" +
                "{\n" +
                "\"DDF\": \"http://www.vendor.com/DDF/oma-sessioninfomo1.0.ddf\",\n" +
                "\"MOID\": \"urn:oma:mo:oma-sessioninfomo:1.0\",\n" +
                "\"MIID\": [\"miid1\"]\n" +
                "}\n" +
                "],\n" +
                "\"Alert\": [\n" +
                "{\n" +
                "\"AlertType\": \"urn:oma:at:scomo:1.0:OperationComplete\",\n" +
                "\"SourceURI\": \"urn:oma:mo:oma-scomo:1.0/SCOMO1/Download/Package1/Operations/DownloadInstall\",\n" +
                "\"TargetURI\": \"urn:oma:mo:oma-scomo:1.0/SCOMO1/Inventory/Deployed/Component1\",\n" +
                "\"Mark\": \"warning\",\n" +
                "\"DataType\": \"text/xml\",\n" +
                "\"Data\": {\n" +
                "\"DM1x\": \"<ResultCode>1200</ResultCode> <!-- SCOMO Result Code --><Identifier>Component1ID</Identifier>\"\n" +
                "}\n" +
                "},\n" +
                "{\n" +
                "\"AlertType\": \"urn:oma:at:scomo:1.0:OperationComplete\",\n" +
                "\"SourceURI\": \"urn:oma:mo:oma-scomo:1.0/SCOMO1/Download/Package1/Operations/DownloadInstall\",\n" +
                "\"TargetURI\": \"urn:oma:mo:oma-scomo:1.0/SCOMO1/Inventory/Deployed/Component2\",\n" +
                "\"DataType\": \"text/xml\",\n" +
                "\"Data\": {\n" +
                "\"DM1x\": \"<ResultCode>1200</ResultCode> <!-- SCOMO Result Code --><Identifier>Component1ID</Identifier>\"\n" +
                "}\n" +
                "}\n" +
                "]\n" +
                "}";
        Gson gson = new Gson();
        DMProtocolPackageOne dmProtocolPackageOne = gson.fromJson(json, DMProtocolPackageOne.class);
//        System.out.println(dmProtocolPackageOne.toString());
        System.out.println(gson.toJson(dmProtocolPackageOne, DMProtocolPackageOne.class));

        JsonDes

    }
}
