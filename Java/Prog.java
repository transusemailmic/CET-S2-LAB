class CPU{
    double price;
    CPU(int price){
        this.price=price;
    }
    class Processor{
        int no_cores;
        String manufacturer;
        Processor(int no_cores, String manufacturer){
            this.no_cores=no_cores;
            this.manufacturer=manufacturer;
        }
    }
    static class RAM{
        int memory;
        String manufacturer;
        RAM(int memory, String manufacturer){
            this.memory=memory;
            this.manufacturer=manufacturer;
        }
    }
}
public class Prog1{
    public static void main(String args[]){
        CPU cpu=new CPU(5000);
        CPU.Processor processor=cpu.new Processor(4,"Intel");
        CPU.RAM ram=cpu.new RAM(2048,"Corsair");
    }
}