public class Vehicle1 {
     double load, maxLoad; // no.4(protected) dan 5(default menggunakan acces modifier)
    public Vehicle1 (double max){   
        this.maxLoad = max;
    }
        public double getLoad(){ //no.1 method accessor getter
            return this.load;
        }
        public double getMaxLoad(){ ///method accessor getter
            return this.maxLoad;
        }
        public boolean addBox(double weight){
            double temp = 0.0D;
            temp = this.load + weight;
        if(temp <= maxLoad){
            this.load = this.load + weight;
            return true;
        } else {
            return false;
        }
    }
}




