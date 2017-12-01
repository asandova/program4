

public class Circle2 extends Circle
{

public Circle2(double x, double y, double radius)
{
   //super(y,x,radius);//incorrect
   super(x,y,radius);//correct
}

public boolean intersects(Circle other)
{
   double d;
   d = Math.sqrt(Math.pow(center.x - other.center.x, 2) + 
                 Math.pow(center.y - other.center.y, 2));
   // if (d < radius)//incorrect
   if (d < radius + other.radius && d > Math.abs( other.radius - radius )  )//correct
      return true;
   else
      return false;
}

}

