package OOP.重载;
public class Test01{ 
public void show(int x, float y, int z) { } 
public void show(int x,int z,float y) {}
public void show(float x,int y,int z) {}//与参数列表的顺序无关
//public int show(int z,float y,int x){return 0;}//与是否有返回值无关
//public void show(int h,int i,float j) {}//与参数名无关
}