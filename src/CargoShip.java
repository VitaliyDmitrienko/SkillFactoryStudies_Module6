// Доп. Задача 3
class CargoShip extends Ship {
    private int tonnage;
    public CargoShip (String name, int yearOfManufacture, int tonnage) {
        super(name, yearOfManufacture);
        this.tonnage = tonnage;
    }
    public String toString() {
//Код для определения нужного окончания слова при согласовании с
        int lastDigit;
        if (tonnage < 10)
            lastDigit = tonnage;
        else
            lastDigit = tonnage % 10;
        String ending;
        if(lastDigit == 1){
            ending = "у";
        }else if(lastDigit>1 && lastDigit<=4){
            ending = "ы";
        }else{
            ending = "";
        }
        String output;
        output = super.toString().replace(".", " ");
        output += String.format("и способно перевезти %d тонн%s груза.",

                tonnage, ending);

        return output;
    }
}

