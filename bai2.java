package bttuan9;

public class bai2{
    public interface Movable {
        abstract void MoveUp();
        abstract void MoveDown();
        abstract void MoveLeft();
        abstract void MoveRight();
    
        
    }
    public class MovablePoint implements Movable{
        private int x, y, xSpeed, ySpeed;

        public MovablePoint(int x, int y, int xSpeed, int ySpeed){
            this.x =x;
            this.y =y;
            this.xSpeed =xSpeed;
            this.ySpeed =ySpeed;
        }
        public String toString(){
            return "x= "+x+"; y= "+y+"; xSpeed="+xSpeed+"; ySpeed= "+ySpeed;
        }

        @Override
        public void MoveUp(){
            y += ySpeed;
        }
        @Override
        public void MoveDown(){
            y -= ySpeed;
        }
        @Override
        public void MoveLeft(){
            x -= xSpeed;
        }
        @Override
        public void MoveRight(){
            x += xSpeed;
        }
    } 

    public class MovableCircle implements Movable{
        private int radius;
        private MovablePoint center;

        public MovableCircle(MovablePoint movablePoint, int radius){
            this.center = movablePoint;
            this.radius = radius;
        }
        
        @Override
        public String toString() {
            return "radius= "+radius+ "center= "+ center;
            //return super.toString();
        }
        
        @Override
        public void MoveUp(){
            center.MoveUp();
        }
        @Override
        public void MoveDown(){
            center.MoveDown();
        }
        @Override
        public void MoveLeft(){
            center.MoveLeft();
        }
        @Override
        public void MoveRight(){
            center.MoveRight();
        }

    }

    public static void main(String[] args) {
        bai2 outer = new bai2(); // Create an instance of the enclosing class
        
        // Correctly instantiate the inner classes using the outer instance
        MovablePoint mp1 = outer.new MovablePoint(1, 5, 1, 2);
        MovableCircle mc1 = outer.new MovableCircle(mp1, 2);
    
        // Test the MovableCircle functionality
        System.out.println("Initial MovableCircle: " + mc1.toString());
        mc1.MoveDown();
        System.out.println("After MoveDown: " + mc1.toString());
    }
}    
    

