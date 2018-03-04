package com.weixin.vo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "pg_user")
public class User implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String realname;

    private String groupname;

    private String pass;

    private String power;

    private String lasttime;

    private String nowtime;

    private String lastip;

    private String nowip;

    private String officecall;

    private String homecall;

    private String mobilenumber;

    private String shortnumber;

    private String email;

    private String qq;

    private String msn;

    private String address;

    private String zhicheng;

    private String xuewei;

    private String banji;

    private String zhuanyename;

    private Integer zhidaorenshu;

    private String jidiname;

    private String innerteachername;

    private String outerteachername;

    @Column(name = "A")
    private Integer a;

    @Column(name = "B")
    private Integer b;

    @Column(name = "C")
    private Integer c;

    @Column(name = "D")
    private Integer d;

    @Column(name = "E")
    private Integer e;

    @Column(name = "F")
    private Integer f;

    @Column(name = "G")
    private Integer g;

    @Column(name = "H")
    private Integer h;

    @Column(name = "I")
    private Integer i;

    @Column(name = "J")
    private Integer j;

    @Column(name = "K")
    private Integer k;

    @Column(name = "L")
    private Integer l;

    @Column(name = "M")
    private Integer m;

    @Column(name = "N")
    private Integer n;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return realname
     */
    public String getRealname() {
        return realname;
    }

    /**
     * @param realname
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * @return groupname
     */
    public String getGroupname() {
        return groupname;
    }

    /**
     * @param groupname
     */
    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    /**
     * @return pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return power
     */
    public String getPower() {
        return power;
    }

    /**
     * @param power
     */
    public void setPower(String power) {
        this.power = power;
    }

    /**
     * @return lasttime
     */
    public String getLasttime() {
        return lasttime;
    }

    /**
     * @param lasttime
     */
    public void setLasttime(String lasttime) {
        this.lasttime = lasttime;
    }

    /**
     * @return nowtime
     */
    public String getNowtime() {
        return nowtime;
    }

    /**
     * @param nowtime
     */
    public void setNowtime(String nowtime) {
        this.nowtime = nowtime;
    }

    /**
     * @return lastip
     */
    public String getLastip() {
        return lastip;
    }

    /**
     * @param lastip
     */
    public void setLastip(String lastip) {
        this.lastip = lastip;
    }

    /**
     * @return nowip
     */
    public String getNowip() {
        return nowip;
    }

    /**
     * @param nowip
     */
    public void setNowip(String nowip) {
        this.nowip = nowip;
    }

    /**
     * @return officecall
     */
    public String getOfficecall() {
        return officecall;
    }

    /**
     * @param officecall
     */
    public void setOfficecall(String officecall) {
        this.officecall = officecall;
    }

    /**
     * @return homecall
     */
    public String getHomecall() {
        return homecall;
    }

    /**
     * @param homecall
     */
    public void setHomecall(String homecall) {
        this.homecall = homecall;
    }

    /**
     * @return mobilenumber
     */
    public String getMobilenumber() {
        return mobilenumber;
    }

    /**
     * @param mobilenumber
     */
    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    /**
     * @return shortnumber
     */
    public String getShortnumber() {
        return shortnumber;
    }

    /**
     * @param shortnumber
     */
    public void setShortnumber(String shortnumber) {
        this.shortnumber = shortnumber;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return qq
     */
    public String getQq() {
        return qq;
    }

    /**
     * @param qq
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * @return msn
     */
    public String getMsn() {
        return msn;
    }

    /**
     * @param msn
     */
    public void setMsn(String msn) {
        this.msn = msn;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return zhicheng
     */
    public String getZhicheng() {
        return zhicheng;
    }

    /**
     * @param zhicheng
     */
    public void setZhicheng(String zhicheng) {
        this.zhicheng = zhicheng;
    }

    /**
     * @return xuewei
     */
    public String getXuewei() {
        return xuewei;
    }

    /**
     * @param xuewei
     */
    public void setXuewei(String xuewei) {
        this.xuewei = xuewei;
    }

    /**
     * @return banji
     */
    public String getBanji() {
        return banji;
    }

    /**
     * @param banji
     */
    public void setBanji(String banji) {
        this.banji = banji;
    }

    /**
     * @return zhuanyename
     */
    public String getZhuanyename() {
        return zhuanyename;
    }

    /**
     * @param zhuanyename
     */
    public void setZhuanyename(String zhuanyename) {
        this.zhuanyename = zhuanyename;
    }

    /**
     * @return zhidaorenshu
     */
    public Integer getZhidaorenshu() {
        return zhidaorenshu;
    }

    /**
     * @param zhidaorenshu
     */
    public void setZhidaorenshu(Integer zhidaorenshu) {
        this.zhidaorenshu = zhidaorenshu;
    }

    /**
     * @return jidiname
     */
    public String getJidiname() {
        return jidiname;
    }

    /**
     * @param jidiname
     */
    public void setJidiname(String jidiname) {
        this.jidiname = jidiname;
    }

    /**
     * @return innerteachername
     */
    public String getInnerteachername() {
        return innerteachername;
    }

    /**
     * @param innerteachername
     */
    public void setInnerteachername(String innerteachername) {
        this.innerteachername = innerteachername;
    }

    /**
     * @return outerteachername
     */
    public String getOuterteachername() {
        return outerteachername;
    }

    /**
     * @param outerteachername
     */
    public void setOuterteachername(String outerteachername) {
        this.outerteachername = outerteachername;
    }

    /**
     * @return A
     */
    public Integer getA() {
        return a;
    }

    /**
     * @param a
     */
    public void setA(Integer a) {
        this.a = a;
    }

    /**
     * @return B
     */
    public Integer getB() {
        return b;
    }

    /**
     * @param b
     */
    public void setB(Integer b) {
        this.b = b;
    }

    /**
     * @return C
     */
    public Integer getC() {
        return c;
    }

    /**
     * @param c
     */
    public void setC(Integer c) {
        this.c = c;
    }

    /**
     * @return D
     */
    public Integer getD() {
        return d;
    }

    /**
     * @param d
     */
    public void setD(Integer d) {
        this.d = d;
    }

    /**
     * @return E
     */
    public Integer getE() {
        return e;
    }

    /**
     * @param e
     */
    public void setE(Integer e) {
        this.e = e;
    }

    /**
     * @return F
     */
    public Integer getF() {
        return f;
    }

    /**
     * @param f
     */
    public void setF(Integer f) {
        this.f = f;
    }

    /**
     * @return G
     */
    public Integer getG() {
        return g;
    }

    /**
     * @param g
     */
    public void setG(Integer g) {
        this.g = g;
    }

    /**
     * @return H
     */
    public Integer getH() {
        return h;
    }

    /**
     * @param h
     */
    public void setH(Integer h) {
        this.h = h;
    }

    /**
     * @return I
     */
    public Integer getI() {
        return i;
    }

    /**
     * @param i
     */
    public void setI(Integer i) {
        this.i = i;
    }

    /**
     * @return J
     */
    public Integer getJ() {
        return j;
    }

    /**
     * @param j
     */
    public void setJ(Integer j) {
        this.j = j;
    }

    /**
     * @return K
     */
    public Integer getK() {
        return k;
    }

    /**
     * @param k
     */
    public void setK(Integer k) {
        this.k = k;
    }

    /**
     * @return L
     */
    public Integer getL() {
        return l;
    }

    /**
     * @param l
     */
    public void setL(Integer l) {
        this.l = l;
    }

    /**
     * @return M
     */
    public Integer getM() {
        return m;
    }

    /**
     * @param m
     */
    public void setM(Integer m) {
        this.m = m;
    }

    /**
     * @return N
     */
    public Integer getN() {
        return n;
    }

    /**
     * @param n
     */
    public void setN(Integer n) {
        this.n = n;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", realname=").append(realname);
        sb.append(", groupname=").append(groupname);
        sb.append(", pass=").append(pass);
        sb.append(", power=").append(power);
        sb.append(", lasttime=").append(lasttime);
        sb.append(", nowtime=").append(nowtime);
        sb.append(", lastip=").append(lastip);
        sb.append(", nowip=").append(nowip);
        sb.append(", officecall=").append(officecall);
        sb.append(", homecall=").append(homecall);
        sb.append(", mobilenumber=").append(mobilenumber);
        sb.append(", shortnumber=").append(shortnumber);
        sb.append(", email=").append(email);
        sb.append(", qq=").append(qq);
        sb.append(", msn=").append(msn);
        sb.append(", address=").append(address);
        sb.append(", zhicheng=").append(zhicheng);
        sb.append(", xuewei=").append(xuewei);
        sb.append(", banji=").append(banji);
        sb.append(", zhuanyename=").append(zhuanyename);
        sb.append(", zhidaorenshu=").append(zhidaorenshu);
        sb.append(", jidiname=").append(jidiname);
        sb.append(", innerteachername=").append(innerteachername);
        sb.append(", outerteachername=").append(outerteachername);
        sb.append(", a=").append(a);
        sb.append(", b=").append(b);
        sb.append(", c=").append(c);
        sb.append(", d=").append(d);
        sb.append(", e=").append(e);
        sb.append(", f=").append(f);
        sb.append(", g=").append(g);
        sb.append(", h=").append(h);
        sb.append(", i=").append(i);
        sb.append(", j=").append(j);
        sb.append(", k=").append(k);
        sb.append(", l=").append(l);
        sb.append(", m=").append(m);
        sb.append(", n=").append(n);
        sb.append("]");
        return sb.toString();
    }
}