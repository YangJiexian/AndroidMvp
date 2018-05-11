package top.daxianwill.frame.local.table;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by admin on 2017/8/7.
 */
@Entity
public  class WeatherinfoEntity {

    /**
     * city : 北京
     * cityid : 101010100
     * temp : 10
     * WD : 东南风
     * WS : 2级
     * SD : 26%
     * WSE : 2
     * time : 10:25
     * isRadar : 1
     * Radar : JC_RADAR_AZ9010_JB
     * njd : 暂无实况
     * qy : 1012
     */
    @Id
    private long id;
    private String city;
    private String cityid;
    private String temp;
    @Property(nameInDb = "WD")
    private String WD;
    @Property(nameInDb = "WS")
    private String WS;
    private String SD;
    private String WSE;
    @Property(nameInDb = "TIME")
    private String time;
    private String isRadar;
    private String Radar;
    private String njd;
    private String qy;

    @Generated(hash = 393684342)
    public WeatherinfoEntity(long id, String city, String cityid, String temp,
            String WD, String WS, String SD, String WSE, String time,
            String isRadar, String Radar, String njd, String qy) {
        this.id = id;
        this.city = city;
        this.cityid = cityid;
        this.temp = temp;
        this.WD = WD;
        this.WS = WS;
        this.SD = SD;
        this.WSE = WSE;
        this.time = time;
        this.isRadar = isRadar;
        this.Radar = Radar;
        this.njd = njd;
        this.qy = qy;
    }

    @Generated(hash = 484346428)
    public WeatherinfoEntity() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getWD() {
        return WD;
    }

    public void setWD(String WD) {
        this.WD = WD;
    }

    public String getWS() {
        return WS;
    }

    public void setWS(String WS) {
        this.WS = WS;
    }

    public String getSD() {
        return SD;
    }

    public void setSD(String SD) {
        this.SD = SD;
    }

    public String getWSE() {
        return WSE;
    }

    public void setWSE(String WSE) {
        this.WSE = WSE;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getIsRadar() {
        return isRadar;
    }

    public void setIsRadar(String isRadar) {
        this.isRadar = isRadar;
    }

    public String getRadar() {
        return Radar;
    }

    public void setRadar(String Radar) {
        this.Radar = Radar;
    }

    public String getNjd() {
        return njd;
    }

    public void setNjd(String njd) {
        this.njd = njd;
    }

    public String getQy() {
        return qy;
    }

    public void setQy(String qy) {
        this.qy = qy;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
