package by.bemn.java_intro_online.string_and_basics_of_text_processing_03.regex_pattern_matcher;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и
 * его тип (открывающий тег, закрывающий тег, содержимое тега, тег без тела).
 * Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
 */

public class XmlParser {
    private static final String XML =
            "<notes>\n" +
                    "<note id = \"1\">\n" +
                    "<to>Вася</to>\n" +
                    "<from>Света</from>\n" +
                    "<heading>Напоминание</heading>\n" +
                    "<body>Позвони мне завтра!</body>\n" +
                    "</note>\n" +
                    "<note id = \"2\">\n" +
                    "<to>Петя</to>\n" +
                    "<from>Маша</from>\n" +
                    "<heading>Важное напоминание</heading>\n" +
                    "<body/>\n" +
                    "</note>\n" +
                    "</notes>";

    public static void main(String[] args) {
        /*
         * Map для хранения начала и конца тегов и их типов
         */
        Map<Integer, String> mapBeginIndexTag = findPairsIndexType(XML, true);
        Map<Integer, String> mapEndIndexTag = findPairsIndexType(XML, false);

        printTags(mapBeginIndexTag, mapEndIndexTag);
    }

    /*
     * Заполнение Мар значениями
     */
    private static Map<Integer, String> findPairsIndexType(String string, boolean isBeginFind) {
        Pattern pattern = Pattern.compile(isBeginFind == true ? "<\\w+" : "<\\w*/\\w*>");
        Matcher matcher = pattern.matcher(XML);

        Map<Integer, String> mapResult = new TreeMap<>();

        while (matcher.find()) {
            int index = isBeginFind == true ? matcher.start() : matcher.end();
            mapResult.put(index, typeTag(matcher.group()));
        }

        return mapResult;
    }

    /*
     * Вывод на консоль тегов
     */
    private static void printTags(Map<Integer, String> mapBeginIndexTag, Map<Integer, String> mapEndIndexTag) {
        int countTags = mapBeginIndexTag.size();
        for (int i = 1; i <= countTags; i++) {
            int beginIndexTag = findBegin(mapBeginIndexTag);
            int endIndexTag = findEnd(mapEndIndexTag, mapBeginIndexTag.get(beginIndexTag));

            System.out.println("\nTag #" + i + ":\n" + XML.substring(beginIndexTag, endIndexTag));

            mapBeginIndexTag.remove(beginIndexTag);
            mapEndIndexTag.remove(endIndexTag);
        }
    }

    /*
     * Поиск индекса для конца тега
     */
    private static int findEnd(Map<Integer, String> mapEndIndexTag, String typeTag) {
        int index = -1;
        Iterator it = mapEndIndexTag.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();

            if (pair.getValue().equals(typeTag)) {
                index = (int) pair.getKey();
                break;
            }
        }

        return index;
    }

    /*
     * Поиск начального индекса для тега
     */
    private static int findBegin(Map<Integer, String> mapIndexAndTypeTag) {
        Iterator it = mapIndexAndTypeTag.entrySet().iterator();
        Map.Entry pair = (Map.Entry) it.next();

        return (int) pair.getKey();
    }

    /*
     * Определение типа тега по индексу начала тега
     */
    private static String typeTag(String tag) {
        Pattern wordOnly = Pattern.compile("\\w+");
        Matcher matcherTypeTag = wordOnly.matcher(tag);
        String typeTag = "";

        while (matcherTypeTag.find()) {
            typeTag = matcherTypeTag.group();
        }

        return typeTag;
    }

}
