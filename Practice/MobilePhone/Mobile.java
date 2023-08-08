package Oops;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Mobile {
	public static void main(String[] args) throws Exception{
		Phone ph=Container.get();
		ph.feature();
	}
}
class Container{
	public static Phone get() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
		Scanner sc=new Scanner(System.in);
		Factory f=new PrasannaFactory();
		WholeSaleSeller w=new KeerthanaShop();
		w.setF(f);
		System.out.print("Enter the type of phone : ");
		String str=sc.next();
		Object obj=w.sell(str.toLowerCase());
		Class c=obj.getClass();
		Method m=c.getDeclaredMethod("feature");
		m.setAccessible(true);
		Photo p=(Photo)m.getAnnotation(Photo.class);
		if(p!=null)
		{
		if(obj instanceof Vivo)
		{
			Vivo ob=(Vivo)obj;
			ob.setCam(new Camera());
			ob.setBt(new Battery());
			ob.setM(new Memory());
			ob.setP(p);
			return ob;
		}
		else if(obj instanceof Redmi)
		{
			Redmi ob=(Redmi)obj;
			ob.setCam(new Camera());
			ob.setBt(new Battery());
			ob.setM(new Memory());
			ob.setP(p);
			return ob;
		}
		else if(obj instanceof Iphone)
		{
			Iphone ob=(Iphone)obj;
			ob.setCam(new Camera());
			ob.setBt(new Battery());
			ob.setM(new Memory());
			ob.setP(p);
			return ob;
		}
		else if(obj instanceof Samsung)
		{
			Samsung ob=(Samsung)obj;
			ob.setCam(new Camera());
			ob.setBt(new Battery());
			ob.setM(new Memory());
			ob.setP(p);
			return ob;
		}
		}
		return w.sell(str.toLowerCase());
		
	}
}
@Retention(RetentionPolicy.RUNTIME)
@interface Photo{
}
class Camera{
	public void cam(Vivo v)
	{
		System.out.println("64pixel");
	}
	public void cam(Redmi r)
	{
		System.out.println("40pixel");
	}
	public void cam(Iphone i)
	{
		System.out.println("100pixel");
	}
	public void cam(Samsung s)
	{
		System.out.println("900pixel");
	}
	
}
class Memory{
	public void mem(Vivo v)
	{
		System.out.println("16GB");
	}
	public void mem(Redmi r)
	{
		System.out.println("32GB");
	}
	public void mem(Iphone i)
	{
		System.out.println("256GB");
	}
	public void mem(Samsung s)
	{
		System.out.println("128GB");
	}
	
}
class Battery{
	public void bat(Vivo v)
	{
		System.out.println("3000mah");
	}
	public void bat(Redmi r)
	{
		System.out.println("4000mah");
	}
	public void bat(Iphone i)
	{
		System.out.println("6000mah");
	}
	public void bat(Samsung s)
	{
		System.out.println("4500mah");
	}
	
}
abstract class Phone{abstract void feature();}
class Vivo extends Phone{
	Camera cam;
	Battery bt;
	Memory M;
	Photo p;
	public void setP(Photo p) {
		this.p = p;
	}

	public void setCam(Camera cam) {
		this.cam = cam;
	}

	public void setBt(Battery bt) {
		this.bt = bt;
	}

	public void setM(Memory m) {
		M = m;
	}

	@Override
	@Photo
	void feature() {
		if(p!=null)
		{
			cam.cam(this);
			bt.bat(this);
			M.mem(this);
		}
		else {
			System.out.println("Camera Normal Quality");
			System.out.println("Battery normal Quality");
			System.out.println("Memory normal Quality");
		}
		
	}
}
class Redmi extends Phone{
	Camera cam;
	Battery bt;
	Memory M;
	Photo p;
	public void setP(Photo p) {
		this.p = p;
	}
	public void setCam(Camera cam) {
		this.cam = cam;
	}

	public void setBt(Battery bt) {
		this.bt = bt;
	}

	public void setM(Memory m) {
		M = m;
	}
	@Override
	@Photo
	void feature() {
		if(p!=null)
		{
			cam.cam(this);
			bt.bat(this);
			M.mem(this);
		}
		else {
			System.out.println("Camera Normal Quality");
			System.out.println("Battery normal Quality");
			System.out.println("Memory normal Quality");
		}
		
	}
}
class Iphone extends Phone{
	Camera cam;
	Battery bt;
	Memory M;
	Photo p;
	public void setP(Photo p) {
		this.p = p;
	}
	public void setCam(Camera cam) {
		this.cam = cam;
	}

	public void setBt(Battery bt) {
		this.bt = bt;
	}

	public void setM(Memory m) {
		M = m;
	}
	@Override
	@Photo
	void feature() {
		if(p!=null)
		{
			cam.cam(this);
			bt.bat(this);
			M.mem(this);
		}
		else {
			System.out.println("Camera Normal Quality");
			System.out.println("Battery normal Quality");
			System.out.println("Memory normal Quality");
		}
		
	}
}
class Samsung extends Phone{
	Camera cam;
	Battery bt;
	Memory M;
	Photo p;
	public void setP(Photo p) {
		this.p = p;
	}
	public void setCam(Camera cam) {
		this.cam = cam;
	}

	public void setBt(Battery bt) {
		this.bt = bt;
	}

	public void setM(Memory m) {
		M = m;
	}
	@Override
	@Photo
	void feature() {
		if(p!=null)
		{
			cam.cam(this);
			bt.bat(this);
			M.mem(this);
		}
		else {
			System.out.println("Camera Normal Quality");
			System.out.println("Battery normal Quality");
			System.out.println("Memory normal Quality");
		}
		
	}
}
interface Manufacturer2{
	public Phone makephone(String str);
}
interface PhoneManufacturer extends Manufacturer2{
	default public Phone makephone(String str)
	{
		return make(str);
	}
	public Phone make(String str);
}
abstract class Factory implements PhoneManufacturer{}
class PrasannaFactory extends Factory{
	@Override
	public Phone make(String str) {
		if(str.equals("vivo"))
		{
			return new Vivo();
		}
		else if(str.equals("redmi")){
			return new Redmi();
		}
		else if(str.equals("iphone")){
			return new Iphone();
		}
		else if(str.equals("samsung"))
		{
			return new Samsung();
		}
		return null;
	}
}
interface Seller{
	public Phone phonesell(String str);
}
interface PhoneSeller{
	default public Phone phonesell(String str)
	{
		return sell(str);
	}
	public Phone sell(String str);
}
abstract class WholeSaleSeller implements PhoneSeller{
	private Factory f;

	public Factory getF() {
		return f;
	}

	public void setF(Factory f) {
		this.f = f;
	}
	
}
class KeerthanaShop extends WholeSaleSeller{
	@Override
	public Phone sell(String str) {
		// TODO Auto-generated method stub
		return getF().make(str);
	}
}
























