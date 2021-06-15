package The_property_management.util;

//用于判断字符串是否为空
public class StringUtil {

    public static boolean isEmpty(String str) {
        if(str == null||"".equals(str.trim())) {
            return true;
        }
        else {
            return false;
        }
    }


    //判断不是为空的
    public static boolean isNotEmpty(String str) {
        if((str!=null)&&!"".equals(str.trim())) {
            return true;
        }
        else
            return  false;

    }
}
