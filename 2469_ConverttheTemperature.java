class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = (celsius + 273.15) % Math.pow(10, 5);
        double farenheit = (celsius * 1.80 + 32.00) % Math.pow(10, 5);
        return new double[]{kelvin, farenheit};
    }
}
