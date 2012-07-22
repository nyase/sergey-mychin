package Calck;

public class JobClas extends HeadFrame {

    JobClas Disp = new JobClas();

    public String Format() {
        String str = Disp.getDisp();            // получить строку
        int dlinna = str.length(), i = 0, foundpoint = 0;

        while (i != dlinna) {                   //цикл до конца строки
            if (str.charAt(i) == '.') {         //если найденна точка
                foundpoint++;                   //увеличить счетчик точек
                break;                          //и выйти из цикла
            } else {                            //если точка ненайденна
                i++;                            //перейти к следующему символу
            }

        }
        if (foundpoint == 0) {                  //если точка небыла найденна
            str = str + ".";                    //добавляем ее в конец строки
        }
        return str;                             //возвращаем получившуюся строку
    }
}