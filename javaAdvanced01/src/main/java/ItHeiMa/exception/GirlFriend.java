package ItHeiMa.exception;

public class GirlFriend {
    String name;
    int age;

    public GirlFriend() {

    }
    public GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<3 || name.length()>10){
            throw new NameFormatException("名字："+name+"，长度不在3-10个字符范围内！");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        if(age<18 || age>40){
            throw new AgeOutOfBoundsException("年龄"+age+"超出范围了，请重新输入18~40之间的年龄");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "GirlFriend [name=" + name + ", age=" + age + "]";
    }
}
