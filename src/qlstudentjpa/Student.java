/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlstudentjpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "student")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s")
    , @NamedQuery(name = "Student.findByMasv", query = "SELECT s FROM Student s WHERE s.masv = :masv")
    , @NamedQuery(name = "Student.findByName", query = "SELECT s FROM Student s WHERE s.name = :name")
    , @NamedQuery(name = "Student.findByOld", query = "SELECT s FROM Student s WHERE s.old = :old")
    , @NamedQuery(name = "Student.findByClass1", query = "SELECT s FROM Student s WHERE s.class1 = :class1")})
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "masv")
    private Integer masv;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "old")
    private int old;
    @Basic(optional = false)
    @Column(name = "class")
    private String class1;

    public Student() {
    }

    public Student(Integer masv) {
        this.masv = masv;
    }

    public Student(Integer masv, String name, int old, String class1) {
        this.masv = masv;
        this.name = name;
        this.old = old;
        this.class1 = class1;
    }

    public Integer getMasv() {
        return masv;
    }

    public void setMasv(Integer masv) {
        this.masv = masv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (masv != null ? masv.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Student : " + "masv=" + masv + ", name=" + name + ", old=" + old + ", class1=" + class1 +",";
    }

    

    
    
}
