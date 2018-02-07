package Lesson2;
/**
 * Class L02P02MedicalPlants keeps variables about the description of herb
 *<br><br>
 *
 * Class implements two methods:
 * <ul>
 *		<li>1 - Constructor L02P02MedicalPlants</li>
 *		<li>2 - herb_data()</li>
 * </ul>
 *
 * @version 29.01.2018
 * @author Rafał Urbański
 */
public class L02P02MedicalPlants {

     int id;
     int gid;
    String englishName;
    String polishName;
    String binomialName;
    String otherName;
    String medicinalPart;
    String therapeuticalUses;
    /**
     * Constructor L02P02MedicalPlants
     * <br>Makes operation assignment on variables type:<br><br>
     * @param id
     * @param gid
     * @param englishName
     * @param polishName
     * @param binomialName
     * @param otherName
     * @param medicinalPart
     * @param therapeuticalUses
     */
    public L02P02MedicalPlants(int id, int gid, String englishName, String polishName, String binomialName, String otherName, String medicinalPart, String therapeuticalUses) {
        this.id = id;
        this.gid = gid;
        this.englishName = englishName;
        this.polishName = polishName;
        this.binomialName = binomialName;
        this.otherName = otherName;
        this.medicinalPart = medicinalPart;
        this.therapeuticalUses = therapeuticalUses;
    }

    /**
     * herb_data()
     * displays information about a herb
     */
    public void herb_data() {
        System.out.println("Plant name: " + englishName + "/" + polishName + "/" + otherName
                + " are other names for " + binomialName + ", which is " + therapeuticalUses + " herb, thanks to "
                + medicinalPart + " ("+ id +":"+ gid +")");
    }


}
