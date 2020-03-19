import java.util.Comparator;

public class NewAgeComparator implements Comparator<Patients> {
    @Override
    public int compare(Patients a, Patients b) {

        if (a.getGen() == "Ж" && a.getAge() > b.getAge() && a.getAge() >= 60)
            return -1;
        else if (a.getGen() == "Ж" && a.getAge() > b.getAge() && a.getAge() < 60)
            return 1;
        else if (a.getGen() == "Ж" && a.getAge() < b.getAge() && a.getAge() < 60)
            return 1;
        else if (a.getGen() == "Ж" && a.getAge() > b.getAge() && a.getAge() < 60)
            return 1;
        else if (a.getGen() == "Ж" && a.getAge() < b.getAge() && a.getAge() < 60)
            return 1;
        else {
            if (a.getGen() == "М" && a.getAge() > b.getAge() && a.getAge() >= 65)
                return -1;
            else if (a.getGen() == "М" && a.getAge() > b.getAge() && a.getAge() < 65)
                return 1;
            else if (a.getGen() == "М" && a.getAge() < b.getAge() && a.getAge() < 65)
                return 1;
            else if (a.getGen() == "М" && a.getAge() > b.getAge() && a.getAge() < 65)
                return 1;
            else if (a.getGen() == "М" && a.getAge() < b.getAge() && a.getAge() < 65)
                return 1;
            else
                return 0;
        }
    }
}
