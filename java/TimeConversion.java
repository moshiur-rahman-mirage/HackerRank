import java.io.*;




public class TimeConversion {
    public static void main(String[] args) throws IOException {

        long start = System.nanoTime();

        String s = "04:59:59PM";
        String ampm = s.substring(8);
        String hour = s.substring(0,2);
        int h;
        String newHour="";

        if(ampm.equals("PM")){

            h=Integer.parseInt(hour)+12;
            if(h==24){
                newHour="12";
            }else {
                newHour=String.valueOf(h);

            }

        }
        else{
            h=Integer.parseInt(hour);
            if(h==12){
                newHour="00";
            }else {
                newHour=String.format("%02d",h);

            }

        }
        StringBuilder resultBuilder = new StringBuilder(newHour);
        resultBuilder.append(s, 2, 8);
        System.out.println(resultBuilder.toString());

//        System.out.println(newHour.concat(s.substring(2,8)));
        long end = System.nanoTime();
        System.out.println("Location: " + (end - start));


    }
}

