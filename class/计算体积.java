package class_demo;
import java.util.Scanner;

/*
* 主要是当父类有构造函数的时候,子类的构造函数怎么操作
*/

class Rectangle{
	protected double length;  //只允许子类和包内访问,public也行吧
    protected double width;
    
    Rectangle(double length, double width){
    	this.length = length;
    	this.width = width;
    }
    public double area() {		
    	return length * width;					
    }
}

class Cuboid extends Rectangle{  
    private double height;
    
    Cuboid(double length, double width, double height) {  
        super(length, width);
        this.height = height;
    }
    
    public double getVolume(){			//返回数据
    	return length * width * height;
    }
    public double getlength() {return length;}
    public double getwidth() {return width;}
    public double getheight() {return height;}
}

public class Experi_1_02 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Enter the length,width,height");  
        
        double length = scanner.nextDouble();  
        double width = scanner.nextDouble();  
        double height = scanner.nextDouble();  
        Cuboid cuboid = new Cuboid(length, width, height);  
        System.out.println("the length is " + cuboid.getlength() + ",the width is " + cuboid.getwidth() + ",the height is " + cuboid.getheight());  
        System.out.println("the volume is:" + cuboid.getVolume());  
    }
}
