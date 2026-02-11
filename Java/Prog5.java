class CPU{
    double price;
    class Processor{
        int no_of_cores;
        String manufacturer;
        Processor(int no_of_cores, String manufacturer){
            this.no_of_cores=no_of_cores;
            this.manufacturer=manufacturer;
        }
        void display(){
            System.out.println("Number of Cores: "+no_of_cores);
            System.out.println("CPU Manufacturer: "+manufacturer);
        }
    }
    static class RAM{
        int memory;
        String manufacturer;
        RAM(int memory, String manufacturer){
            this.memory=memory;
            this.manufacturer=manufacturer;
        }
        void display(){
            System.out.println("Memory: "+memory);
            System.out.println("RAM Manufacturer: "+manufacturer);
        }
    }
    CPU(double price){
        this.price=price;
    }
    void display(){
        System.out.println("CPU Price: "+price);
    }
}
public class Prog5 {
    public static void main(String args[]){
        CPU cpu=new CPU(12000.0);
        CPU.Processor processor=cpu.new Processor(4,"Intel");
        CPU.RAM ram=new CPU.RAM(4096,"Corsair");
        cpu.display();
        processor.display();
        ram.display();
    }
}
