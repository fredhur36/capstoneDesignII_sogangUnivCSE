package asan.hospital.asanbeacon;
//비콘 정보들을 저장하는 부분.
/*
 * Created by 15U560 on 2017-10-26.
 */

public class Item {

    private String address;
    private double rssi;// log 로 표현된 신호세기. -> 이걸 우리에게 익숙한 미터법으로 변환시켜야하는데.
    private int txPower;
    private double distance;
    private int major;
    private int minor;
    private String ID;
    private int nearSingal;
    public Item(String ID,String address, double rssi, int txPower, double distance, int major, int minor, int near) {
        this.address = address;
        this.rssi = rssi;
        this.txPower = txPower;
        this.distance = distance;
        this.major = major;
        this.minor = minor;
        this.ID = ID;
        this.nearSingal = near;
    }
    public int getNearSignal(){

        return nearSingal;
    }
    public int getMajor() {
        return major;
    }

    public int getMinor() {
        return minor;
    }

    public String getAddress() {
        return address;
    }

    public String getID() {return ID;}

    public double getRssi() {
        return rssi;
    }

    public int getTxPower() {
        return txPower;
    }

    public double getDistance() {
        return distance;
    }

    public void setRssi(double rssi) {
        this.rssi = rssi;
    }

    public void setTxPower(int txPower) {
        this.txPower = txPower;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
