package Pets.mammal;

public class Mammal {
        private String species;
        private String fur;
        private int paws;

    public Mammal(){

    }
    public Mammal(String species, String fur, int paws) {
        setSpecies(species);
        setFur(fur);
        setPaws(paws);
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        if(paws < 0  || paws > 5) {
            return ;
        }
        this.paws = paws;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "species='" + species + '\'' +
                ", fur='" + fur + '\'' +
                ", paws=" + paws +
                '}';
    }


}

