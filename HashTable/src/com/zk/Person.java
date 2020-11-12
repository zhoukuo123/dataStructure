package com.zk;

public class Person {
    private int age;
    private float height;
    private String name;

    public Person(int age, float height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    @Override
    /**
     * 用来比较2个对象是否相等
     */
    public boolean equals(Object obj) {
        // 内存地址
        if (this == obj) return true;
        if (obj == null || obj.getClass() != getClass()) return false;
        // if (obj == null || !(obj instanceof Person)) return false;

        // 比较成员变量
        Person person = (Person) obj;
        return person.age == age
                && person.height == height
                && person.name == null ? name == null : person.name.equals(name);
    }

    @Override
    public int hashCode() {
        int hashCode = Integer.hashCode(age);
        hashCode = hashCode * 31 + Float.hashCode(hashCode);
        hashCode = hashCode * 31 + (name != null ? name.hashCode() : 0);
        return hashCode;
    }
}
