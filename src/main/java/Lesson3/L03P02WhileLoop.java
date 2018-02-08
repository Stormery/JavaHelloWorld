package Lesson3;
/**
 * Class L03P01ForLoop displays description of herbs iterating them by While loop
 * <br><br>
 *
 * Class implements three methods
 * <ul>
 *     <li>1 - Constructor L03P02WhileLoop</li>
 *     <li>2 - herb_data()</li>
 *     <li>3 - main method</li>
 * </ul>
 *
 * @version 31.01.2018
 * @author Rafał Urbański
 */
public class L03P02WhileLoop {
    int id;
    int gid;
    String englishName;
    String polishName;
    String binomialName;
    String otherName;
    String medicinalPart;
    String therapeuticalUses;
    /**
     * Constructor L03P02WhileLoop
     * <br> Makes operation assigment on variables type:<br><br>
     * @param id
     * @param gid
     * @param englishName
     * @param polishName
     * @param binomialName
     * @param otherName
     * @param medicinalPart
     * @param therapeuticalUses
     */
    private L03P02WhileLoop(int id, int gid, String englishName, String polishName, String binomialName, String otherName, String medicinalPart, String therapeuticalUses) {
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
     * Print informations from constructor about herb
     */
    private void herb_data() {
        System.out.println("Plant name: " + englishName + "/" + polishName + "/" + otherName
                + " are other names for " + binomialName + ", which is " + therapeuticalUses + " herb, thanks to "
                + medicinalPart + " (" + id + ":" + gid + ")");
    }

    /**
     *  The entry main() method
     * <br> Makes operation assignment on variables type: <br><br>
     *     <ul>
     *         <li><code>L03P02WhileLoop medicalPlants1, medicalPlants2, medicalPlants3, medicalPlants4, medicalPlants5, medicalPlants6, medicalPlants7
     *         medicalPlants8 -  </code></li>
     *         <li>shows informations about L03P02WhileLoop constructor objects</li>
     *     </ul>
     * @param args Args
     */
    public static void main(String[] args) {
        int id = 1;
        //groupId 100 - Antibacterial
        L03P02WhileLoop medicalPlants1 = new L03P02WhileLoop(id++, 100, "Aloe", "Aloes", "Aloe vera", "Aloes", "Leaves", "Antibacterial");
        //groupId 200 - Antitussive
        L03P02WhileLoop medicalPlants2 = new L03P02WhileLoop(id++, 200, "Althaea", "Prawoślaz", "Altaea officinalis", "Marshmallows", "Leafs and roots", "Antitussive");
        //groupId 300 - Protective screening
        L03P02WhileLoop medicalPlants3 = new L03P02WhileLoop(id++, 300, "Flax", "Len", "Linum usitatissimum", "Linseed", "Seeds", "Protective screening");
        L03P02WhileLoop medicalPlants4 = new L03P02WhileLoop(id++, 300, "Psyllium", "Płesznik", "Plantago ovata ", "Ispaghula", "Seeds", "Protective screening");
        //groupId 400 - Laxative
        L03P02WhileLoop medicalPlants5 = new L03P02WhileLoop(id++, 400, "Poplar", "Topola", "Populus alba", "Abele", "Leaves", "Laxative");
        L03P02WhileLoop medicalPlants6 = new L03P02WhileLoop(id++, 400, "Rhubarb", "Rzewień", "Rheum officinale", "Rhabarber", "Roots", "Laxative");
        //groupId 500 - Cardiac insufficiency
        L03P02WhileLoop medicalPlants7 = new L03P02WhileLoop(id++, 500, "Hawthorn", "Gług", "Crataegus rhipidophylla", "Thornapple", "Fruits and flowers", "Cardiac insufficiency");
        //groupId 600 - Diuretic
        L03P02WhileLoop medicalPlants8 = new L03P02WhileLoop(id++, 600, "Horsetail", "Skrzyp", "Equisetum arvense", "Snake Grass", "Whole Plant", "Diuretic");

        int i = 1;
        while (i <= id) {
            if(i==1){
                medicalPlants1.herb_data();
            }
            if(i==2){
                medicalPlants2.herb_data();
            }
            if(i==3){
                medicalPlants3.herb_data();
            }
            if(i==4){
                medicalPlants4.herb_data();
            }if(i==5){
                medicalPlants5.herb_data();
            }
            if(i==6){
                medicalPlants6.herb_data();
            }
            if(i==7){
                medicalPlants7.herb_data();
            }
            if(i==8){
                medicalPlants8.herb_data();
            }
            i++;
        }

    }

}
