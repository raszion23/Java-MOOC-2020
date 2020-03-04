
public class Main {

    public static void main(String[] args) {
        HealthStation childHospital = new HealthStation();

        Person elijah = new Person("Eliajh", 4, 45, 45);
        Person darlesia = new Person("Darlesia", 24, 67, 185);

        System.out.println(elijah.getName() + " weight: " + childHospital.weigh(elijah) + " kilos");
        System.out.println(darlesia.getName() + " weight: " + childHospital.weigh(darlesia) + " kilos");
        
        childHospital.feed(darlesia);
        childHospital.feed(elijah);
        childHospital.feed(elijah);
        childHospital.feed(elijah);
        
        System.out.println(elijah.getName() + " weight: " + childHospital.weigh(elijah) + " kilos");
        System.out.println(darlesia.getName() + " weight: " + childHospital.weigh(darlesia) + " kilos");
        
        childHospital.feed(elijah);
        childHospital.feed(darlesia);
        
        System.out.println(elijah.getName() + " weight: " + childHospital.weigh(elijah) + " kilos");
        System.out.println(darlesia.getName() + " weight: " + childHospital.weigh(darlesia) + " kilos");
        
        System.out.println("weightings performed: " + childHospital.weighings());
    }
}
