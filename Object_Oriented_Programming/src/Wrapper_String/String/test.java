package Wrapper_String.String;

/**
 * @author wyl
 * @create 2020-09-01
 * @Description
 * @Version
 */
public class test {
    public static void main(String[] args) {
        String mail = "19@395585578@163.com";
      /*  if ((mail.contains("@") && mail.contains("."))){
            if(mail.indexOf("@")==mail.lastIndexOf("@")){
                 if(mail.substring(mail.indexOf("@")).contains(".")) {
                     System.out.println("合法");
                 }
            }
            else {
                System.out.println("不合法");
            }
        }else {
            System.out.println("不合法");
        }*/

        System.out.println(isMail(mail));

        System.out.println(MyTrim("  hello  ff "));

        String string = "健康减肥,就发几款,骄傲空手道解放,就爱看积分";
        String string2 = "E://hello//tian";
        String[] poem = string.split(",");
        String [] test = string2.split("//");

        for (String s: poem){
            System.out.println(s);
        }

        for (String s :
                test) {
            System.out.println(s);
        }

        //字符串转字符数组
        String s1 ="hello";
        char[] chars = s1.toCharArray();
        for (char c:chars) {
            System.out.println(c);
        }
        //字符串比较
        String  a = "abc";
        String  b = "abcd";
        System.out.println(a.compareTo(b));

        //格式化字符串
        String name = "yuey";
        int age =10;
        double score =98.3/5;
        char gender = '男';
        String info =String.format("姓名是：%s,年龄是：%d,成绩是：%.2f,性别是：%c....",name,age,score,gender);
        System.out.println(info);

    }

    public static boolean isMail(String mail){
        int index1 = mail.indexOf('@');
        int index2 = mail.indexOf('.');
        return index1 >0 && index2 >index1 && (index1 == mail.lastIndexOf('@'));
    }

    public static  String MyTrim(String s){
        int i=0;
        int j=s.length();
        while (s.charAt(i)==' ') i++;
        while (s.charAt(j-1) == ' ') j--;
        return s.substring(i,j);
    }
}


