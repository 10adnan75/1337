// 9 ms
class ParkingSystem {
    public int big, medium, small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        switch (carType) {
            case 1: return this.big-- > 0;
            case 2: return this.medium-- > 0;
            case 3: return this.small-- > 0;
        }
        return true;
    }
}

// 7 ms
class ParkingSystem {
    public int[] parking;

    public ParkingSystem(int big, int medium, int small) {
        this.parking = new int[] {big, medium, small};
    }
    
    public boolean addCar(int carType) {
        return parking[carType-1]-- > 0;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
