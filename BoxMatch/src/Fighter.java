public class Fighter {
    String name;
    int health, damage, weight;
    int dodge;
    int yaziTura;

    public Fighter(String name, int health, int damage, int weight,int dodge,int yaziTura) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.weight = weight;
        this.dodge=dodge;
        this.yaziTura=yaziTura;
    }

    int hit(Fighter foe) {
        if(foe.isDodge()){
            System.out.println(foe.name+" Dodge'ladı");
            return foe.health;
        }
        if (foe.health - this.damage <= 0) {
            return 0;
        }
        else {
            System.out.println("==================");
            System.out.println(this.name + "Vurdu");
            return foe.health - this.damage;
        }
    }
    boolean isDodge(){
        double randomNumber=Math.random()*100;
        return randomNumber<=this.dodge;
    }
    boolean isYaziTura(){
        double randomNumber=Math.random()*100;
        return randomNumber<=this.yaziTura;
    }
}