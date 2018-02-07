package Lesson2;

public class L02P02Herbarium {

    /**
     * The entry main() method.
     * Creates a L02P02MedicalPlants objects from the given data and displays it.
     *<ul>
     *     <li><code>L02P02MedicalPlants (medicalPlants1, medicalPlants2, medicalPlants3, medicalPlants4,
     *     medicalPlants5,medicalPlants6,medicalPlants7,medicalPlants8)</code> - Creates herb objects from the given data</li>
     *     <li>Displays created herb data</li>
     *</ul>
     *
     * @param args Args
     */
    public static void main(String[] args){
        int id=1;
        //groupId 100 - Antibacterial
        L02P02MedicalPlants medicalPlants1 = new L02P02MedicalPlants(id++,100,"Aloe","Aloes","Aloe vera", "Aloes", "Leaves","Antibacterial");
        //groupId 200 - Antitussive
        L02P02MedicalPlants medicalPlants2 = new L02P02MedicalPlants(id++,200,"Althaea","Prawoślaz","Altaea officinalis", "Marshmallows", "Leafs and roots","Antitussive");
        //groupId 300 - Protective screening
        L02P02MedicalPlants medicalPlants3 = new L02P02MedicalPlants(id++,300,"Flax","Len","Linum usitatissimum", "Linseed", "Seeds","Protective screening");
        L02P02MedicalPlants medicalPlants4 = new L02P02MedicalPlants(id++,300,"Psyllium","Płesznik","Plantago ovata ", "Ispaghula", "Seeds","Protective screening");
        //groupId 400 - Laxative
        L02P02MedicalPlants medicalPlants5 = new L02P02MedicalPlants(id++,400,"Poplar","Topola","Populus alba", "Abele", "Leaves","Laxative");
        L02P02MedicalPlants medicalPlants6 = new L02P02MedicalPlants(id++,400,"Rhubarb","Rzewień","Rheum officinale", "Rhabarber", "Roots","Laxative");
        //groupId 500 - Cardiac insufficiency
        L02P02MedicalPlants medicalPlants7 = new L02P02MedicalPlants(id++,500,"Hawthorn","Gług","Crataegus rhipidophylla", "Thornapple", "Fruits and flowers","Cardiac insufficiency");
        //groupId 600 - Diuretic
        L02P02MedicalPlants medicalPlants8 = new L02P02MedicalPlants(id++,600,"Horsetail","Skrzyp","Equisetum arvense", "Snake Grass", "Whole Plant","Diuretic");

        medicalPlants1.herb_data();
        medicalPlants2.herb_data();
        medicalPlants3.herb_data();
        medicalPlants4.herb_data();
        medicalPlants5.herb_data();
        medicalPlants6.herb_data();
        medicalPlants7.herb_data();
        medicalPlants8.herb_data();


    }
}
