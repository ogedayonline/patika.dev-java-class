public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    public void run(){
        if(isCheck()){
            while (this.f1.health>0&&this.f2.health>0){
                if(f1.isYaziTura()){
                    f2.health=f1.hit(f2);
                    System.out.println(this.f2.name+" 'in canı "+this.f2.health);
                }
                if(f2.isYaziTura()){
                    f1.health=f2.hit(f1);
                    System.out.println(this.f1.name+" 'in canı "+this.f1.health);
                }
                f2.isYaziTura();
                System.out.println("=====Yeni Round=====");
                f2.health=f1.hit(f2);
                System.out.println(this.f2.name+" 'in canı "+this.f2.health);
                if(isWin()){
                    break;}
                f1.health=f2.hit(f1);
                System.out.println(this.f1.name+" 'in canı "+this.f1.health);
                if(isWin()){
                break;}
            }

        }
        else {
            System.out.println("Dövüşçüler aynı siklette değil.");

        }

    }
    boolean isCheck(){
        return (this.f1.weight>minWeight&&this.f1.weight<maxWeight) && (this.f2.weight>minWeight&&this.f2.weight<maxWeight);
    }
    boolean isWin(){
        if(f1.health<=0){
            System.out.println(this.f2.name+" "+this.f1.name+" 'i devirdi ");
            return true;
        }
        else if(f2.health<=0){
            System.out.println(this.f1.name+" "+this.f2.name+" 'i devirdi ");
            return true;
        }
        return false;
    }
}
