//package JsonMapper;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.core.type.TypeReference;
//
//import java.util.HashMap;
//
//public class JsonMap {
//
//    public static void main(String[] args) throws JsonProcessingException {
//
//        String str  = "{\n" +
//                "  \"glossary\": {\n" +
//                "    \"title\": \"example glossary\",\n" +
//                "    \"GlossDiv\": {\n" +
//                "      \"title\": \"S\",\n" +
//                "      \"GlossList\": {\n" +
//                "        \"GlossEntry\": {\n" +
//                "          \"ID\": \"SGML\",\n" +
//                "          \"SortAs\": \"SGML\",\n" +
//                "          \"GlossTerm\": \"Standard Generalized Markup Language\",\n" +
//                "          \"Acronym\": \"SGML\",\n" +
//                "          \"Abbrev\": \"ISO 8879:1986\",\n" +
//                "          \"GlossDef\": {\n" +
//                "            \"para\": \"A meta-markup language, used to create markup languages such as DocBook.\",\n" +
//                "            \"GlossSeeAlso\": [\n" +
//                "              \"GML\",\n" +
//                "              \"XML\"\n" +
//                "            ]\n" +
//                "          },\n" +
//                "          \"GlossSee\": \"markup\"\n" +
//                "        }\n" +
//                "      }\n" +
//                "    }\n" +
//                "  }";
//
//
//        HashMap<String, String> map;
//        ObjectMapper mapper = new ObjectMapper();
//
//        map = mapper.readValue(str, new TypeReference<HashMap>(){});
//
//        System.out.println(map);
//    }
//}
