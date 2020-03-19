import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Класс "Пациенты".
 */
public class Patients {
    private final String fio;
    private final String gender;
    private final int age;
    private final int numberInsPolicy;

    public Patients (String fio, String gender, int age, int numberInsPolicy) {
        this.fio = fio;
        this.gender = gender;
        this.age = age;
        this.numberInsPolicy = numberInsPolicy;
    }
    public String getID () {
        return Integer.toString(numberInsPolicy);
    }
    public String getPatient (){
        return Integer.toString(age) + ", "+ fio + ", "+ gender ;
    }
    public String getGen () {
        return gender;
    }
    public int getAge () {
        return age;
    }



}