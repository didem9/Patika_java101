public class Ring {
        Fighter f1;
        Fighter f2;
        int minWeight;
        int maxWeight;

        public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
            if (isWhichFighter()){
                this.f1 = f1;
                this.f2 = f2;
            }else {
                this.f1 = f2;
                this.f2 = f1;
            }
            this.minWeight = minWeight;
            this.maxWeight = maxWeight;
        }

        public void run() {

            if (checkWeight()) {
                while (f1.health > 0 && f2.health > 0) {
                    System.out.println("======== YENİ ROUND ===========");
                    f2.health = f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    printScore();
                }

            } else {
                System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
            }
        }

        public boolean checkWeight() {
            return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
        }

        public boolean isWin() {
            if (f1.health == 0) {
                System.out.println("Maçı Kazanan : " + f2.name);
                return true;
            } else if (f2.health == 0){
                System.out.println("Maçı Kazanan : " + f2.name);
                return true;
            }

            return false;
        }
        public boolean isWhichFighter(){
            double randomNumber = Math.random() * 100;
            if ( randomNumber < 50){
                return true;            //true ise f1 önce başlar

            }else
                return  false;
        }


        public void printScore() {
            System.out.println("------------");
            System.out.println(f1.name + " Kalan Can \t:" + f1.health);
            System.out.println(f2.name + " Kalan Can \t:" + f2.health);
        }
}
