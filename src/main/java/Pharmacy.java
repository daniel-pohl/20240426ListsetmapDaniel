import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Pharmacy {

    private Map<String, Medication> medicationMap= new HashMap<>();

    public Pharmacy() {
    }

    public int getCount() {
        return medicationMap.size();
    }

    public void save(Medication medication) {
        medicationMap.put(medication.getName(), medication);
    }

    public Medication find(String medicationName) {
        if (medicationMap.containsKey(medicationName)) {
            return medicationMap.get(medicationName);
        } else {
            return null;
        }
    }

    public void delete(String medicationName) {
        medicationMap.remove(medicationName);
        System.out.println("One Med deleted: "+medicationName);
    }

    public void printAllMedications() {
        System.out.println("------------------------------");
        System.out.println("Medications in the pharmacy:");
        for (Medication medication : medicationMap.values()) {
            System.out.println("Name: " + medication.getName() +
                    ", Price: " + medication.getPrice() +
                    ", Availability: " + (medication.getAvailability() ? "Available" : "Not available"));
        }
        System.out.println("------------------------------");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return Objects.equals(medicationMap, pharmacy.medicationMap);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(medicationMap);
    }


}
