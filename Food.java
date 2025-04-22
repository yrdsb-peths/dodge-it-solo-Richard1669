import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Food extends Actor
{
    public void act()
    {
        move(-7);
        
        if(getX() <= 0) {
            resetFood();
        }
        if(isTouching(Hero.class)){
            Skull skull = new Skull();
            getWorld().addObject(skull, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    public void resetFood(){
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0) {
            setLocation(600, 100);
            
        } else{
            setLocation(600, 300);
        }
    }
}
