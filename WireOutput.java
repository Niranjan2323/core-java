class WireOutput{
public static void main(String[] args) {

        Wire wire = new Wire();
        wire.material = "Copper";
        wire.length = 100;
        wire.thickness = 1.5;
        wire.grade = 'A';
        wire.isInsulated = true;
        wire.price = 500;

        Wire wire1 = new Wire();
        wire1.material = "Aluminium";
        wire1.length = 200;
        wire1.thickness = 2.0;
        wire1.grade = 'B';
        wire1.isInsulated = false;
        wire1.price = 800;

        Wire wire2 = new Wire();
        wire2.material = "Steel";
        wire2.length = 150;
        wire2.thickness = 1.8;
        wire2.grade = 'C';
        wire2.isInsulated = true;
        wire2.price = 600;    
    }
}